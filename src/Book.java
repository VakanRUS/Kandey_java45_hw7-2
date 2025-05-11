import java.util.Objects;

public class Book {
    private String bookName;
    private int yearOfPublish;
    private Author author;

    public Book(String bookName, int yearOfPublish, Author authorName) {
        this.bookName = bookName;
        this.yearOfPublish = yearOfPublish;
        author = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    @Override
    public String toString() {
        return "Автор: " + author + ". Название книги: " + bookName + ". Год выпуска: " + yearOfPublish;
    }

    @Override
    public boolean equals(Object isEquals) {
        if (isEquals == null || getClass() != isEquals.getClass()) return false;
        Book book = (Book) isEquals;
        return yearOfPublish == book.yearOfPublish && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearOfPublish, author);
    }
}
