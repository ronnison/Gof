public class Book {
    private String nome;
    private String autor;
    private String isbn;

    public Book (
            String nome, 
            String autor, 
            String isbn) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getNome() {
        return this.nome;
    }
    public String getAutor() {
        return this.autor;
    }
    public String getIsbn() {
        return this.isbn;
    }
}