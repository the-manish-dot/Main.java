class Exersion {
    int bookid;
    String title;
    String author;


    ConstructorExersion(int bookid, String title, String author) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
    }

    void dispalyimp() {
        System.out.println("bookid " + bookid);
        System.out.println("title " + title);
        System.out.println("author name " + author);
    }
}

public class Exersion1 {
    public static void main(String[] args) {

    Exersion1 obj = new Exersion(1, "Your Name", "Manish");

        obj.dispalyimp();
    }
}
