public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        Book ebook1 = new EBook("Java Programming", "John Doe","1.5MB");
        Book printedBook1 = new PrintedBook("Clean Code","Robert c",100);

        library.addBook(ebook1);
        library.addBook(printedBook1);

        System.out.println("-------------------");

        library.displayBooks();

        System.out.println("-------------------");

        Member member1 = new Member("Satish", 1001);
        Member member2 = new Member("Vikas", 1002);

        library.addMember(member1);
        library.addMember(member2);

        System.out.println("-------------------");

        member1.borrowBook(ebook1);
        member2.borrowBook(ebook1);

        System.out.println("-------------------");

        member1.returnBook(ebook1);

        System.out.println("----------------------");

        library.displayMembers();

        System.out.println("-------------------");
    }
}
