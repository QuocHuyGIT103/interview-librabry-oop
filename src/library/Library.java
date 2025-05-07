package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public Library(List<Book> books, List<Member> members) {
        this.books = books;
        this.members = members;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b.getDetails() + ", Available: " + b.isAvailable());
        }
    }

}
