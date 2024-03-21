/* Author: <Zainab Alfredji>
  Id: <am8171>
  Study program: <DT>
*/
package partyController;

import partyModel.Address;
import partyModel.Countries;
import partyModel.Guest;
import partyModel.GuestManager;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        int maxNbrOfGuests = 10;

        System.out.println("Enter the maximum number of guests: ");
        Scanner scanner = new Scanner(System.in);
        maxNbrOfGuests = scanner.nextInt();

        Controller controller = new Controller(maxNbrOfGuests);
        GuestManager guestManager = new GuestManager(maxNbrOfGuests);
        System.out.println(guestManager.getInfoStrings());
    }
}
