import java.util.List;
import java.util.ArrayList;

public class BookSearchProxy {
    
    private BookSearch bs;
    private List<Book> cache;

    public BookSearchProxy(BookSearch bs) {
        this.bs = bs;
        this.cache = new ArrayList<Book>();
    }

    public Book getBook (String isbn) {
        for (Book bk : cache) {
            if (bk.getIsbn().equals(isbn)) {
                System.out.println("Proxy");
                return bk;
            }
        }
        Book result = bs.getBook(isbn);
        if (result != null) {
            cache.add(result);
        }
        return result;
    }

}
