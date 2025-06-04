class Book {
    static int totalNoOfBooks;
    String isbn;
    String title;
    String author;
    boolean isBorrowed;
    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn) {
        this(isbn, "UNKNOWN", "UNKNOWN");
    }
    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }
    void borrowedBook() {
        if(isBorrowed) {
            System.out.println("THIS BOOK IS ALREADY BORROWED");
        } else {
            this.isBorrowed = true;
            System.out.println("ENJOY THE BOOK ");
        }
    }
    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("HOPE YOU ENJOYED THE BOOK");
        } else {
            System.out.println("THIS BOOK IS ALREADY IN THE LIBRARY");
        }
    }
    public static void main(String[] args) {
        Book fantasy = new Book("001","Harry Potter","JK Rowling");
        Book dark = new Book("002","Berserk","Kentaro");
        System.out.println(Book.getTotalNoOfBooks());
        fantasy.borrowedBook();
        dark.borrowedBook();
        fantasy.returnBook();
        fantasy.returnBook();


    }
}

