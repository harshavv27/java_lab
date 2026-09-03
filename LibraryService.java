package library.service;

import library.model.LibraryResource;
import library.model.Printable;
import library.util.InputValidator;

public class LibraryService {

    public static void displayAllDetails(LibraryResource[] resources) {
        System.out.println("===== LIBRARY RESOURCES =====");
        System.out.println("Library: "+LibraryResource.libraryName);
        System.out.println();
        for (LibraryResource resource : resources) {
            if (resource instanceof Printable) {
                ((Printable) resource).printDetails();
            }
            System.out.println();
        }
    }

    public static void calculateTotalFine(LibraryResource[] resources, int[] overdueDays) {
        double totalFine = 0;
        System.out.println("===== OVERDUE FINES =====");
        for (int i=0; i<resources.length; i++) {
            if (InputValidator.validateFineDays(overdueDays[i]) && overdueDays[i]>0) {
                double fine = resources[i].calculateFine(overdueDays[i]);
                System.out.println(resources[i].getTitle()+" - Overdue Days: "+overdueDays[i]+" - Fine: Rs. "+fine);
                totalFine += fine;
            }
        }
        System.out.println("Total Fine: Rs. "+totalFine);
    }
}
