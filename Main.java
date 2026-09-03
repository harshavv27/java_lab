package library.main;

import library.model.LibraryResource;
import library.model.Book;
import library.model.DigitalResource;
import library.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        // Create five library resource objects stored in an array
        LibraryResource[] resources = new LibraryResource[5];
        resources[0] = new Book(1, "Clean Code", "Robert C. Martin", "Technology");
        resources[1] = new Book(2, "The Alchemist", "Paulo Coelho", "Fiction");
        resources[2] = new DigitalResource(3, "Introduction to Java", "Herbert Schildt", "PDF");
        resources[3] = new DigitalResource(4, "Data Structures Explained", "Mark Allen Weiss", "ePub");
        resources[4] = new Book(5, "Wings of Fire", "A.P.J. Abdul Kalam", "Biography");

        // Overdue days for each resource (0 means not overdue)
        int[] overdueDays = {0, 3, 5, 0, 7};

        // Display complete details of all resources
        LibraryService.displayAllDetails(resources);

        // Calculate and display total fine
        LibraryService.calculateTotalFine(resources, overdueDays);

        System.out.println();
        LibraryResource.displayTotalResources();
    }
}
