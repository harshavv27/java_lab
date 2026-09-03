package library.model;

public class DigitalResource extends LibraryResource implements Printable {
    private String format;  // e.g. PDF, ePub, MP4

    public DigitalResource(int resourceId, String title, String author, String format) {
        super(resourceId, title, author);
        this.format = format;
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays*2.0;  // Rs. 2 per day
    }

    @Override
    public void printDetails() {
        System.out.println("--- Digital Resource Details ---");
        System.out.println(getBasicDetails());
        System.out.println("Format: "+format);
        System.out.println("Fine Rate: Rs. 2/day");
    }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }
}
