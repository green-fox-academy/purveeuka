package BlogPost;

public class BlogPost {
    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
    public void printAuthorName() {
        System.out.println(this.authorName);
    }
    public void printTitle() {
        System.out.println(this.title);
    }
    public void printText() {
        System.out.println(this.text);
    }
    public void printPublicationDate() {
        System.out.println(this.publicationDate);
    }
}

/*
    Create a BlogPost.BlogPost class that has
        an authorName
        a title
        a text
        a publicationDate
 */