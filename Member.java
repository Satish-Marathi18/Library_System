public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book){
        System.out.println(this.name+" is borrowing "+book.getTitle());
        book.borrowBook();
    }

    public void returnBook(Book book){
        System.out.println(this.name+" is returning "+book.getTitle());
        book.returnBook();
    }
    
}
