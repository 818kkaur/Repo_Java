package class7_oops;

public class City {
    public static void main(String[] args) {

        HotelTemplate h1 = new HotelTemplate();
        System.out.println(h1.getHotelName()); // Generic
        h1.setHotelName("Hotel-1");
        System.out.println(h1.getHotelName()); // Hotel-1
        HotelTemplate h2 = new HotelTemplate();
        System.out.println(h2.getHotelName()); // Generic
        h2.setHotelName("Hotel-2");
        System.out.println(h2.getHotelName()); // Hotel-2




        System.out.println(h2.isValetAvailable()); // false

        h2.addValetService();

        System.out.println(h1.isValetAvailable()); // false

        System.out.println(h2.isValetAvailable()); // true

        HotelTemplate h3 = new HotelTemplate();

        System.out.println(h3.isValetAvailable()); // false
        System.out.println(h3.getHotelName()); // Generic




    }
}
