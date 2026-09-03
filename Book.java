package library.model;

public class Book extends LibraryResource implements Printable {
    private String genre;

    public Book(int resourceId, String title, String author, String genre) {
        super(resourceId, title, author);
        this.genre = genre;
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays*5.0;  // Rs. 5 per day
    }

    @Override
    public void printDetails() {
        System.out.println("--- Book Details ---");
        System.out.println(getBasicDetails());
        System.out.println("Genre: "+genre);
        System.out.println("Fine Rate: Rs. 5/day");
    }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}
