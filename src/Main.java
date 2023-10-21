public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Andrzej", "Sapkowski");
        Author author2 = new Author("Stephen", "King");

        Book book1 = new Book("Book 1", author1, 2011);
        Book book2 = new Book("Book 2", author2, 2009);

        book1.setPublicationYear(1994);

        System.out.println(book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " "
                + book1.getAuthor().getLastName() + ", published in " + book1.getPublicationYear());
        System.out.println(book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " "
                + book2.getAuthor().getLastName() + ", published in " + book2.getPublicationYear());
    }
}
