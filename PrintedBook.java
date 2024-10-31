public class PrintedBook extends Title{
    int pages;


    public PrintedBook(String title, String literatureType, int copies, int pages){
        super();
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        this.pages = pages;

    }

    @Override
    double calculatePoints() {
        return 0;
    }

    @Override
    double calculateLiteraturePoints() {
        return 0;
    }
}
