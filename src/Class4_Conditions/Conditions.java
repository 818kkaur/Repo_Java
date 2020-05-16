package Class4_Conditions;

public class Conditions {
    public static void main(String[] args) {
        {
            String name = "Happy";
            boolean result = true;
            int var = 10;
            if (name.length() > 1 || var > 5) {
                System.out.println(name.toUpperCase());
                System.out.println(name.replace('p', 'Z'));
            } else {
                result = false;
            }
            System.out.println("result" + result);
            //days = weekend, clothes = casual.
            //days = weekday and meeting = false, clothes = formals
            //days = weekday and meeting = true clothes = suit

            String days = "weekend";
            Boolean meeting = true;
            String clothes = "";
            if (days.equalsIgnoreCase("weekday")) {
                if (meeting) {
                    clothes = "Suit";
                }
                else {
                    clothes = "formals";
                }
            } else if (days.equalsIgnoreCase("weekend")) {
                clothes = "casual";
            } else {
                System.out.println("Wrong values entered in days" + days);
            }
            System.out.println("clothes: " + clothes);

            //Print the value if it is odd.
            int x = 45;
            if (x % 2 != 0)
                System.out.println(x);
            /**
             * String fullname = "Happy peace love laugh";
             *
             * if full name consists of, first-name, middle-name and last-name:
             * print name like:
             * First Name : Happy
             * Middle name : Peace
             * Last name : Love
             *
             * if name consists of, first-name and last-name:
             * print name like:
             * First Name : Happy
             * Last name : Peace
             *
             * if name consists of, first-name:
             * print name like:
             * First Name : Happy
             *
             * name longer than 3 words, print below:
             * print below:
             * Invalid full name entered: Happy peace love laugh
             *

             String Name = "Happy Peace";
             String [] fullName = Name.split(" ");
             if (fullName.length == 1)
             {
             System.out.println("First Name: " +fullName[0]);}

             else if (fullName.length == 2) {
             System.out.println("First Name: " + fullName[0] + "\n" + "Last Name: " + fullName[1]);
             }
             else if ( fullName.length== 3){
             System.out.println("First Name: " +fullName[0] + "\n" + "Middle Name: " +fullName[1]+ "\n" + "Last Name: "+ fullName[2]);
             }
             else{
             System.out.println("Invalid Name: " +fullName);
             *If I am not on sabbatical
             * mon-fri : if I have a meeting, print "You must go to office; you have meetings" else print "You can work from home"
             * sat : print "Go Out"
             * sun : print "Take rest"
             */
            //else say Enjoy sabbatical
            // String dayName = "";
            // String message = "";

            // use switch
            //System.out.println("Message : " + message);*/
            boolean isSabbatical = false;
            boolean Meeting = true;
            String dayName = "sunday";
            String message = "";
            String UpdatedDay = dayName.toLowerCase();
            if(!isSabbatical) {
                switch (UpdatedDay) {
                    case "monday":
                    case "tuesday":
                    case "wednesday":
                    case "thursday":
                    case "friday":
                        if (Meeting) {
                            message = "You must go to office; you have meetings";
                        } else {
                            message = "You can work from home";
                        }
                        break;

                    case "saturday":
                        message = "Go Out";
                        break;
                    case "sunday":
                        message = "Take rest";
                        break;
                    default:

                        System.out.println("Invalid value! Enter again");
                }
            }
            else
            {
                System.out.println("Enjoy");
            }

            System.out.println("Message: " + message);

               /*
               Based on month, print season:
               * dec, jan, feb = winter
               * mar, apr, may = summer
               * june, july, aug = fall
               * sept, oct, nov =spring*/

            String monthName = "abcd";
            String seasonName = "";
            // code
        /*
        ;*/

            String mn =monthName.toLowerCase();
            switch(mn)
            {
                case "january":
                case "februaury":


                case"december":
                    seasonName = "Winter";
                    break;
                case "march":
                case "april":
                case "may":
                    seasonName = "Summer";
                    break;
                case "june":
                case "july":
                case "august":
                    seasonName = "Fall";
                    break;
                case "September":
                case "October":
                case "November":
                    seasonName = "Spring";
                    break;
                default:
                    System.out.println("Invalid season Name");
            }
            if(seasonName.length() != 0)
                System.out.println("For " + monthName + ", season is: " + seasonName);
        }

    }
}
