package library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", "12345", true);
        Book book2 = new Book("OOP Concepts", "Jane Smith", "67890", true);

        library.addBook(book1);
        library.addBook(book2);

        Librarian librarian = new Librarian("L001", "Thi");
        Student student = new Student("S001", "Huy");

        library.addMember(student);
        library.addMember(librarian);

        librarian.addBookToLibrary(library, new Book("Data Structures", "Alice Brown", "54321", true));
        librarian.addBookToLibrary(library, new Book("Algorithms", "Bob White", "98765", true));
        librarian.addBookToLibrary(library, new Book("Database Systems", "Charlie Green", "11223", true));
        librarian.addBookToLibrary(library, new Book("Web Development", "Diana Blue", "44556", true));
        librarian.addBookToLibrary(library, new Book("Machine Learning", "Eve Black", "77889", true));
        librarian.addBookToLibrary(library, new Book("Artificial Intelligence", "Frank Red", "99000", true));
        librarian.addBookToLibrary(library, new Book("Computer Networks", "Grace Yellow", "12321", true));
        librarian.addBookToLibrary(library, new Book("Operating Systems", "Hank Purple", "45654", true));
        librarian.addBookToLibrary(library, new Book("Software Engineering", "Ivy Orange", "78987", true));
        librarian.addBookToLibrary(library, new Book("Cyber Security", "Jack Pink", "10101", true));

        student.borrowBook(book1);
        library.displayBooks();
        student.returnBook(book1);
        library.displayBooks();

    }
}
