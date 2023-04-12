package Phones;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CellPhone cellPh = new CellPhone("Nokia", "жёлтый", "раскладушка");
        StationaryPhone statePh = new StationaryPhone("Siemens", "чёрный");
        FaxPhone faxPh = new FaxPhone("Sony", "белый");

        ArrayList<Phone> myPhones = new ArrayList<>();
        myPhones.add(cellPh);
        myPhones.add(statePh);
        myPhones.add(faxPh);

        System.out.println(myPhones.toString());

        cellPh.dial();
        cellPh.getConnected();
        statePh.ring();
        statePh.getConnected();
        faxPh.sendFax();
        statePh.getDisconnected();
    }
}
