class Audiobook extends Title {
int durationInMinutes;



    public Audiobook(String title, String literatureType, int copies,int durationInMinutes) {
        super(title);
        this.literatureType = literatureType;
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    double calculatePoints() {

    }

    @Override
    double calculateLiteraturePoints() {
        return 0;
    }
}