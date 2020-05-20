package class7_oops;

public class City {
    public static void main(String[] args) {

        HotelTemplate h1 = new HotelTemplate();
        HotelTemplate h2 = new HotelTemplate();

        System.out.println(h2.getHotelName()); // Generic
        System.out.println(h1.getHotelName()); // Generic

        h1.setHotelName("My Hotel - 1");

        System.out.println(h2.getHotelName()); // Generic
        System.out.println(h1.getHotelName()); // MH-1

        h2.setHotelName("My Hotel - 2");

        System.out.println(h2.getHotelName()); //MH-2
        System.out.println(h1.getHotelName()); //MH-1

        System.out.println(h2.isValetAvailable()); // false

        h2.addValetService();

        System.out.println(h1.isValetAvailable()); // false

        System.out.println(h2.isValetAvailable()); // true

        HotelTemplate h3 = new HotelTemplate();

        System.out.println(h3.isValetAvailable()); // false
        System.out.println(h3.getHotelName()); // Generic




    }
}
