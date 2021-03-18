package BlogPost;

public class BlogPostMain {
    public static void main(String[] args) {
        BlogPost post1;
        post1 = new BlogPost("John Doe", "Lorem Ipsum",
                        "Lorem ipsum dolor sit amet.", "2000.05.04.");
        post1.printAuthorName();
        post1.printTitle();
        post1.printText();
        post1.printPublicationDate();
        System.out.println("-----------------------------------------");

        BlogPost post2;
        post2 = new BlogPost("Tim Urban", "Wait but why",
                            "A popular long-form, stick-figure-illustrated blog about almost everything.",
                            "2017.03.28.");
        post2.printAuthorName();
        post2.printTitle();
        post2.printText();
        post2.printPublicationDate();
        System.out.println("-----------------------------------------");

        BlogPost post3;
        post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
                """
                        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
                         When I asked to take his picture outside one of IBM’s New York City offices,
                         he told me that he wasn’t really into the whole organizer profile thing.""",
                "2017.03.28.");
        post3.printAuthorName();
        post3.printTitle();
        post3.printText();
        post3.printPublicationDate();
    }
}
/*
    Create a few blog post objects:
        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
        Lorem ipsum dolor sit amet.
        "Wait but why" titled by Tim Urban posted at "2010.10.10."
        A popular long-form, stick-figure-illustrated blog about almost everything.
        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
        When I asked to take his picture outside one of IBM’s New York City offices,
        he told me that he wasn’t really into the whole organizer profile thing.
 */