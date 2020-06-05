package Homework.homework6;

import Homework.Demo;

public class MainClass {
    public static void main(String[] args) {
        Demo.Printer p1 = new Demo.Printer();

        p1.printPages(10,false);
   p1.addPages(25);
        p1.addToner(10);
        Printer p2 = new Printer();
//     System.out.println(p1.addPages(12));
     p1.printSummary();
//        System.out.println(p1.addToner(20));
//        System.out.println(p2.addToner(20));
      p2.printSummary();
    }
}

