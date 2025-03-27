public class BookSearch {

    private Book b1 = new Book("Clean Code", "Roberto", "1234");
    private Book b2 = new Book("Java: Como programar", 
        "Deitel", "4321");

    public BookSearch () {}


    public Book getBook(String isbn) {
        System.out.println("search");
        if (isbn.equals("1234")) {
            return this.b1;
        } else if (isbn.equals("4321")) {
            return this.b2;
        } else {
            return null;
        }
    }
}
