# Library Management System

This is a simple console-based Library Management System implemented in Java, demonstrating Object-Oriented Programming (OOP) principles: **Inheritance**, **Encapsulation**, **Polymorphism**, and **Abstraction**.

## Project Overview

The system allows:

- Managing books (add books, display book list).
- Managing members (librarians and students).
- Performing actions like borrowing and returning books.

The project is organized into multiple Java files within the `library` package, showcasing modular code structure and professional organization.

## OOP Principles Demonstrated

- **Abstraction**: Using the `LibraryItem` interface to define common behaviors for library items.
- **Encapsulation**: Private fields in `Book` and `Library` with public getters/setters.
- **Inheritance**: `Librarian` and `Student` classes extend the abstract `Member` class.
- **Polymorphism**: Overriding `getMemberType` in `Librarian` and `Student` for different behaviors.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/library-management-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd library-management-system
   ```
3. Compile the Java files:
   ```bash
   javac library/*.java
   ```
4. Run the main class:
   ```bash
   java library.LibraryManagementSystem
   ```

## Sample Output

```
Librarian Thi added book: Data Structures
Huy borrowed Java Programming
Library Books:
Book: Java Programming, Author: John Doe, ISBN: 12345, Available: false
Book: OOP Concepts, Author: Jane Smith, ISBN: 67890, Available: true
...
Huy returned Java Programming
Library Books:
Book: Java Programming, Author: John Doe, ISBN: 12345, Available: true
...
```

## Project Structure

```
library/
├── LibraryItem.java      # Interface for library items
├── Book.java            # Class representing a book
├── Member.java          # Abstract class for members
├── Librarian.java       # Class for librarians
├── Student.java         # Class for students
├── Library.java         # Class managing books and members
├── LibraryManagementSystem.java  # Main class to run the program
```

## Future Improvements

- Add a graphical user interface using JavaFX or Swing.
- Implement data persistence (e.g., save books/members to a file).
- Add authentication for members.

## Author

- [QuocHuyGIT103] (https://github.com/QuocHuyGIT103/interview-librabry-oop)

This project was created as part of my preparation for a Java internship interview to demonstrate OOP skills.
