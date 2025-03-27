public class App {
    public static void main(String[] args) throws Exception {
        BookSearch bs = new BookSearch();
        BookSearchProxy bsp = new BookSearchProxy(bs);

        try {
            System.out.println(bsp.getBook("1234").getNome());
            System.out.println(bsp.getBook("1234").getNome());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
