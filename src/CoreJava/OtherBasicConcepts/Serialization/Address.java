package CoreJava.OtherBasicConcepts.Serialization;

import java.io.Serializable;

public class Address implements Serializable {

    private int houseNumber;

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}
