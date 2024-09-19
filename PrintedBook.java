public class PrintedBook extends Book {
    private int pages;

    PrintedBook(String title, String author, int pages){
        super(title, author);
        this.pages = pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("Printed Book: "+getTitle()+" by "+getAuthor()+" of pages "+pages );
    }

    
}
