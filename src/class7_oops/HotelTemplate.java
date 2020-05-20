package class7_oops;

public class HotelTemplate
    {

        String name = "Generic";
        int rooms;
        int employee;
        boolean isValet = false;

        public void roomCleaning() {
            System.out.println("room Cleaning");
        }

        public void setHotelName(String hotelName) {
            name = hotelName;
        }

        public String getHotelName() {
            return name;
        }

        //write method to add/subtract hotel name
        public void changeRoomsCount(int change) {
            rooms = rooms + change;
        }

        public int getRooms() {
            return rooms;
        }

        public int updateRoomCount(int change) {
            rooms = rooms + change;
            return rooms;
        }

        public void addValetService() {
            isValet = true;
        }

        public boolean isValetAvailable() {
            return isValet;
        }

}
