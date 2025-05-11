public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сергей", "Лукьяненко");
        Author author2 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Лабиринт отражений", 1997, author1);
        Book book2 = new Book("Тёмная башня", 1975, author2);
        book2.setYearOfPublish(1982);
        System.out.println(book1);
        System.out.println(book2);
    }
}