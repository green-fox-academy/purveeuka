/**
 * Created by aze on 2017.05.11..
 */

let server = "http://localhost:8080";

function ajax(method, endpoint, data, cb, err) {
    let httpRequest = new XMLHttpRequest();
    httpRequest.open(method, server + endpoint, true);
    httpRequest.setRequestHeader('Content-Type', 'application/json');
    if (window.username)  {
        httpRequest.setRequestHeader('Username', window.username);
    }
    httpRequest.send(JSON.stringify(data));
    httpRequest.onreadystatechange = function () {
        if (httpRequest.readyState == XMLHttpRequest.DONE) {
            console.log('xd');
            if (httpRequest.status == 200 || httpRequest.status == 201) {
                cb(JSON.parse(httpRequest.responseText));
            } else {
                err(httpRequest.status)
            }
        }
    };
}

function createElement(element) {
    var res = document.createElement(element.type);
    if ('classes' in element && element.classes.length != 0) {
        res.classList.add(element.classes);
    }
    if ('attributes' in element) {
        Object.keys(element.attributes).forEach(function (attr) {
            res.setAttribute(attr, element.attributes[attr]);
        });
    }
    if ('inner' in element) {
        res.innerHTML = element.inner;
    }

    if ('children' in element) {
        element.children.forEach(function (child) {
            res.appendChild(child);
        });
    }
    return res;
}

function timeDifference(current, previous) {

    var msPerMinute = 60 * 1000;
    var msPerHour = msPerMinute * 60;
    var msPerDay = msPerHour * 24;
    var msPerMonth = msPerDay * 30;
    var msPerYear = msPerDay * 365;

    var elapsed = current - previous;

    if (elapsed < msPerMinute) {
        return 'just now';
    } else if (elapsed < msPerHour) {
        return Math.round(elapsed / msPerMinute) + ' minutes ago';
    } else if (elapsed < msPerDay) {
        return Math.round(elapsed / msPerHour) + ' hours ago';
    } else if (elapsed < msPerMonth) {
        return 'approximately ' + Math.round(elapsed / msPerDay) + ' days ago';
    } else if (elapsed < msPerYear) {
        return 'approximately ' + Math.round(elapsed / msPerMonth) + ' months ago';
    } else {
        return 'approximately ' + Math.round(elapsed / msPerYear) + ' years ago';
    }
}

function createPost(post, index, voted = 0) {

    if(!post["vote"]) {
        voted = post["vote"]
    }

    var owner = post["owner"] == null ? "anonymous" : post["owner"];
    var ago = "few seconds ago";
    ago = timeDifference(new Date(), Date.parse(post["timestamp"]));

    var article = createElement({
        type: "article",
        attributes: {
            id: "post-" + post["id"]
        },
        children: [
            createElement({
                type: "div",
                classes: "number",
                inner: index + 1
            }),
            createElement({
                type: "div",
                classes: "score",
                children: [
                    createElement({
                        type: "img",
                        attributes: {
                            "src": "images/upvote" + (voted == 1 ? "d" : "") + ".png",
                            "alt": "upvote",
                            "data-id": post["id"]
                        }
                    }),
                    createElement({
                        type: "p",
                        inner: post["score"]
                    }),
                    createElement({
                        type: "img",
                        attributes: {
                            "src": "images/downvote" + (voted == -1 ? "d" : "") + ".png",
                            "alt": "downvote",
                            "data-id": post["id"]
                        }
                    })
                ]
            }),
            createElement({
                type: "div",
                classes: "content",
                children: [
                    createElement({
                        type: "h2",
                        children: [
                            createElement({
                                type: "a",
                                attributes: {
                                    "href": post["url"]
                                },
                                inner: post["title"]
                            })
                        ]
                    }),
                    createElement({
                        type: "p",
                        inner: "submitted " + (ago) + " by <strong>" + (owner) + "</strong>"
                    })
                ]
            })
        ]
    });
    return article;
}

function appendPost(article) {
    document.querySelector("main").appendChild(article);
    article.querySelectorAll("img").forEach(function (item) {
        item.onclick = handleVote;
    })
}

function handleVote(event) {
    var isUpvote = event.target.getAttribute("alt") == "upvote";
    ajax("PUT",
        "/posts/" + event.target.getAttribute("data-id") + "/" + (isUpvote ? "upvote" : "downvote"), {},
        function (data) {
            var oldChild = document.querySelector("#post-" + data["id"]);
            var number = oldChild.querySelector(".number").innerText;
            document.querySelector("main").replaceChild(
                createPost(data, parseInt(number) - 1, (isUpvote ? 1 : -1)),
                oldChild);
        });
}

function hide() {
    document.querySelectorAll(".new").forEach(el => el.classList.add("hidden"));
}

function login(data) {
    window.username = data["username"];
    hide();
    document.querySelectorAll("#user-login").forEach(el => el.classList.add("hidden"));
    document.querySelectorAll("#user-info").forEach(el => el.classList.remove("hidden"));
    document.querySelectorAll("#user-info").forEach(el => el.innerHTML = "Logged in as <strong>" + data["username"] + "</strong>");
}

function register(data) {
    hide();
}

function deletePosts() {
    document.querySelector("main").innerHTML = '';
}

document.onload = ajax("GET", "/posts", null, function (data) {

    console.log(data);

    data.forEach(function (data, index) {
        appendPost(createPost(data, index));
    });

    document.querySelector("#submit-login").onclick = function (event) {
        event.preventDefault();
        ajax("POST", "/users/login", {
            username: document.querySelector("#username-l").value,
            password: document.querySelector("#password-l").value
        }, function (data) {
            login(data)

            ajax("GET", "/posts", null, function (data) {

                deletePosts();

                data.forEach(function (data, index) {
                    appendPost(createPost(data, index));
                });
            })

        }, function (data) {
            alert('User login failed :(')
        });
    };

    document.querySelector("#submit-register").onclick = function (event) {
        event.preventDefault();
        ajax("POST", "/users", {
            username: document.querySelector("#username-r").value,
            password: document.querySelector("#password-r").value
        }, function (data) {
            alert('You have been registered!')
            register(data)
        },  function (data) {
            alert('User registration failed :(')
        });
    };

    document.querySelector("#submit-post").onclick = function (event) {
        event.preventDefault();
        ajax("POST", "/posts", {
            url: document.querySelector("#url").value,
            title: document.querySelector("#title").value
        }, function (data) {
            appendPost(createPost(data, document.querySelector("main").childElementCount - 1));
            document.querySelector("#new").classList.add("hidden");
        });
    };

    document.querySelector("#add_post").onclick = function (event) {
        event.preventDefault();
        hide();
        document.querySelector("#new").classList.remove("hidden");
    }

    document.querySelector("#show_login").onclick = function (event) {
        event.preventDefault();
        hide();
        document.querySelector("#login").classList.remove("hidden");
    }

    document.querySelector("#show_register").onclick = function (event) {
        event.preventDefault();
        hide();
        document.querySelector("#register").classList.remove("hidden");

    }
});