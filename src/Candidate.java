public class Candidate {
    String firstName;
    String lastName;
    int barcode;

    Candidate() {}

    Candidate(String firstName, String lastName, int barcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.barcode = barcode;
    }

    boolean sixNumber(int number) {
        if (String.valueOf(number).length() != 6) {
            return false;
        }
        return true;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    void setBarcode(int barcode) {
        if(sixNumber(barcode))
            this.barcode = barcode;
        else barcode = 0;
    }

    String getFirstName() {return firstName;}
    String getLastName() {return lastName;}
    int getBarcode() {return barcode;}
}
