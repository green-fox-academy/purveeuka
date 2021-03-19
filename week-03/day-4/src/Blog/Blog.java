package Blog;

import java.util.ArrayList;

public class Blog {
    private ArrayList<BlogPost> blogPosts;
    public Blog(){
        blogPosts = new ArrayList<>();
    }
    public void add(BlogPost blogPost) {
        this.blogPosts.add(blogPost);
    }
    public void delete(int index){
        this.blogPosts.remove(blogPosts.get(index));
    }
    public void update(int i, BlogPost newPost) {
        blogPosts.add(i, newPost);
    }

    public String toString() {
        return "Posts" + '\n' + blogPosts ;
    }
}
/*
Reuse your Blog.Blog.BlogPost class
Create a Blog.Blog class which can:
store a list of BlogPosts
and has the following methods:
add(Blog.Blog.BlogPost) -> adds a Blog.Blog.BlogPost to the list
delete(int) -> deletes the Blog.Blog.BlogPost from the given index
update(int, Blog.Blog.BlogPost) -> replaces an item at the given index with a new Blog.Blog.BlogPost
 */
