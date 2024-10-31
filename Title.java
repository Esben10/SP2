abstract class Title {
    String title;
    String literatureType;
    int copies;
    double rate;

    public Title(String name) {
        super(name);
    }

    public String title(String title, String literatureType, int copies) {
        this.title = title;
    }
    public double calculateRoyalty(){

    }

    abstract double calculatePoints();
    abstract double calculateLiteraturePoints();
}


