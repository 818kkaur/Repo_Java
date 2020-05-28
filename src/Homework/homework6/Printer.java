package Homework.homework6;

public class Printer {


        /**
         * Create a printer
         * <p>
         * max toner level = 100
         * max pages in tray = 100
         * with 1 page printing, 1 toner is being used
         * <p>
         * 1. addToner
         * 2. addPages
         * 3. Print (single and double)
         * 4. PrinterSummary
         * Toner level:
         * Pages count in tray:
         * 5. checkToner
         * if toner is less than 10; it should warn to "Add toner"
         */
        static int tonerLevel=100;
        static int pagesInTray = 100;
        int pagesRequired;

        int tonerRequired;

        public void printPages(int pagesToPrint, boolean ecoFr) {
            if (ecoFr) {
                if (pagesToPrint % 2 == 0) {
                    pagesRequired = pagesToPrint / 2;
                    tonerRequired = pagesToPrint;

                    pagesInTray = pagesInTray - pagesRequired;
                    tonerLevel = tonerLevel-tonerRequired;
                } else {
                    pagesInTray = pagesToPrint / 2 + 1;
                    tonerLevel = pagesToPrint;

                    pagesInTray = pagesInTray - pagesRequired;
                    tonerLevel = tonerLevel-tonerRequired;
                }
                System.out.println("Pages printed: " + pagesRequired +",double sided");
                System.out.println("Toner left: "+ tonerLevel);
            } else {
                pagesRequired = pagesToPrint;
                tonerRequired = pagesToPrint;

                pagesInTray = pagesInTray - pagesRequired;
                tonerLevel = tonerLevel-tonerRequired;

                System.out.println("Pages printed: " + pagesToPrint+"-Single sided");
                System.out.println("Toner left: "+ tonerLevel);
            }

        }
        public void printSummary() {
            System.out.println("Current Toner Level: " + tonerLevel);
            System.out.println("Total pages in tray " + pagesInTray);
        }

        public void tonerCapacity() {
            if (tonerLevel > 10) {
                System.out.println("Toner needs to be added to the printer");
            }
        }

        public void printerCapacity()
    {
            if (pagesInTray > 10) {
                System.out.println("More paper needs to be added to the printer");
            }
        }

        public void addToner(int tonerCount) {
            if (tonerCount > 0 && tonerCount <= 100) {


                if ((tonerCount + tonerLevel) <= 100) {
                    tonerLevel += tonerCount;
                } else {
                    System.out.println("More toner added than printer capacity");
                }
            } else {
                System.out.println("Invalid toner amount to add");
            }
        }

        public void addPages(int pCount) {
            if (pCount > 0 && pCount <= 100) {
                if (pCount + pagesInTray <= 100) {
                    pagesInTray = pCount + pagesInTray;
                } else {
                    System.out.println("Pages added over printer capacity");
                }
            } else {
                System.out.println("Invalid pages to add");
            }

        }

    }


