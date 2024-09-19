public class EBook extends Book{
    private String fileSize;

    EBook(String title, String author, String fileSize){
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Ebook: "+getTitle()+" by "+getAuthor()+" of size "+fileSize );
    }
     
}
