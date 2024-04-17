package LibararyProject;

public class Books {
   private String bookName;
   private String author;
   private static int count;

    public Books(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Books.count = count;
    }
}
