/*
  Author: <Zainab Alfredji>
  Id: <am8171>
  Study program: <DT>
*/
package partyModel;

import partyModel.Address;

public class Guest {
    /* Declare instance variables for first name and family name as String-objects and
       address as an Address-object.
     */
    private String firstName;
    private String familyName;
    private Address address;

    /* Write a default constructor (no parameters) that gives default values for
       instance variables and creates the Address-object using
       the default constructor for class Address.
       Use default values for first name and family name of your choice
       that will inform a user that this value isn't really set.

       You can handle this in this constructor or call
       the constructor below with null for all values and handle that there.
     */

    public Guest(){
        this.firstName = "First name ";
        this.familyName = "Family name ";
        this.address = new Address();
    }

    /* Write a constructor with parameters for all instance variables
       given above where the address is a reference to an Address-object
       and first name and family name are of type String.

       Check that the values for the parameters for first name and family name
       isn't empty Strings or null before assigning the values to the corresponding
       instance variables. If any value is empty or null assign a default value of your choice
       that will inform a user that this value isn't really set.

       If the parameter for the Address-object is null create an Address-object
       by using the default constructor for class Address.
     */

    public Guest(String firstName, String familyName, Address address){
        this.firstName = firstName;
        this.familyName = familyName;
        this.address = address;
    }

    /* Write a constructor with parameters for all instance variables
       given above and all instance variables for the address.
       Create the Address-object with the values given in the parameters.
       Let the Address class take care of assigning default values if any
       parameters for this object is an empty String or null.
   */

    public Guest(String firstName, String familyName, String street, String city, String zipCode, Countries country){
        this.firstName = firstName;
        this.familyName = familyName;
        this.address = new Address(street, city, zipCode, country);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()){
            this.firstName = firstName;
        } else {
            System.out.println("Enter first name ");
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName){
        if (familyName != null && !familyName.isEmpty()){
            this.familyName = familyName;
        } else {
            System.out.println("Enter family name");
        }
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        if (address != null && !address.equals("")){
            this.address = address;
        } else {
            System.out.println("Enter address");
        }
    }

    public void setStreet(String streetText) {
        this.address.setStreet(streetText);
    }

    public void setCity(String cityText) {
        this.address.setCity(cityText);
    }

    public void setZipCode(String zipCodeText) {
        this.address.setZipCode(zipCodeText);
    }

    public void setCountry(Countries country) {
        this.address.setCountry(country);
    }
    /* Implement get- and set-methods for all instance variables,
       including variables matching the instance variables of
       the Address-object (those call getters and setters in the Address-object).

       Remember to check parameters in set-methods with the same
       rules as in the constructor above.
     */

    /* Write a toString method to return a String made of first name and
       family name and the address (by calling the toString method of the Address-object)
       formated in one line.
     */

    public String toString() {
        return  firstName + ", " + familyName + ", " + address.toString();
    }
}
