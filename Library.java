import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    Library(){
        this.books = new ArrayList<>();
        this.members=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle()+" is added to the library");
    }

    public void addMember(Member member){
        members.add(member);
        System.out.println(member.getName()+" added as the library member");
    }

    public void displayBooks(){
        for(Book book : books){
            book.displayDetails();
        }
    }

    public void displayMembers(){
        for(Member member : members){
            System.out.println("Name: "+member.getName()+"   Member ID: "+member.getMemberId());
        }
    }
}
