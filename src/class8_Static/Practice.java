package class8_Static;

import com.sun.org.apache.bcel.internal.generic.POP2;

public class Practice {
    public static String name = "Test Bank";
    private int routingNumber;
    private static int bankOffices;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setAddress(String address) {
        bankOffices++;
        this.address = address;
    }

    public void setRouting(int routingNumber) {
        bankOffices++;
        this.routingNumber = routingNumber;
    }

    public void getBankDetails() {
        System.out.println("Name: " + name);
        System.out.println("Routing# :" + routingNumber);
        System.out.println("Address: " + address);
        System.out.println("total# of bank offices: " + bankOffices);
    }
}



