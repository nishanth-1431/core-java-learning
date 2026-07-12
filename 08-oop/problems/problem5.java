/*5. Book
Create a Book class.
Fields:
- title
- author
- pages
Method:
- displayBook()
Create two Book objects and display their details.
Topics Used:
- Classes
- Objects
- Methods
 */
class Book {

    String title;
    String author;
    int pages;

    public void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Pages  : " + pages);
        System.out.println();
    }
}

public class problem5 {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.pages = 650;

        Book book2 = new Book();
        book2.title = "Data Structures";
        book2.author = "Mark Allen";
        book2.pages = 420;

        book1.displayBook();
        book2.displayBook();
    }
}