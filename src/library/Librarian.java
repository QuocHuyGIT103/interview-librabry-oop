package library;

public class Librarian extends Member {

    public Librarian(String id, String name) {
        super(id, name);
    }

    @Override
    public String getMemberType() {
        return "Librarian";
    }

    public void addBookToLibrary(Library library, Book book) {
        library.addBook(book);
        System.out.println("Librarian " + name + " added " + book.getTitle() + " to the library.");
    }

}
