    /*8. Library System — Library & Book
        A library contains books.
        •	Create Library and Book. 
        •	Books can exist independently of the library. 
        •	Add multiple books. 
        •	Search for a book by title. 
        •	Remove a book from the library. 
        •	The removed book should still conceptually exist. 
 */
class Book {
    String title;
    String author;

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}
class Library{
    String libraryName;
    Book[] books; // library has a book

     void displayBooks() {

        System.out.println("Library: " + libraryName);
        System.out.println("Books:");

        for (int i = 0; i < books.length; i++) {

            if (books[i] != null) {
                books[i].displayBook();
            }
        }
   }
       void searchBook(String title) {

        for (int i = 0; i < books.length; i++) {

            if (books[i] != null && books[i].title.equals(title)) {
                System.out.println("Book Found!");
                books[i].displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    void removeBook(int index) {
        books[index] = null;
    }
 }
public class problem8 {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "James";

        Book book2 = new Book();
        book2.title = "Clean Code";
        book2.author = "Robert Martin";

        Library library = new Library();
        library.libraryName = "City Library";

        // Aggregation
        library.books = new Book[2];

        library.books[0] = book1;
        library.books[1] = book2;

        // Display all books
        library.displayBooks();

        // Search
        System.out.println("Searching for Clean Code:");
        library.searchBook("Clean Code");

        // Remove book2
        library.removeBook(1);

        System.out.println("After removing Clean Code:");
        library.displayBooks();

        // Removed book still exists
        System.out.println("Removed book still exists:");
        book2.displayBook();
    }
}