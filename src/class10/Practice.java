package class10;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class Practice {
    public static void main(String[] args) {
      //  ONE TRY BLOCK CAN HANDLE ONLY ONE EXCEPTION NO MATTER HOW MANY EXCEPTIONS THERE ARE IN ONE TRY BLOCK. SUPPOSE  IF THERE ARE MULTIPLE LINES AND 2ND LINE AND 4TH HAVE AN EXCEPTION SO IN THIS CASE CODE FLOW WILL MOVE UNTIL LINE 2, SEE THAT THERE IS AN EXCEPTION IN LINE 2 THEN IT WILL JUMP OUT OF TRY BLOCK  and look for catch block and move further after the catch block in the code. IT WILL not jump back into try block again so line 3 and 4 in the try block will never execute so it is always better to have separate try blocks.
      //Compile time exception- While writing the code, java will show red squibly warning and if you hover, it  will say unhandled exception and type of exception that can occur so this means that we need to put this code in try block and create a catch block for it based on the type of exception we get.
        //This is  example of compile time exception
        try {
            Thread.sleep(5000); // 1 sec = 1000 ms

        }
        catch (InterruptedException ex)
        {
            System.out.println("BE careful");
        }
       // This is  example of compile time exception
        try
        {
        File file = new File("./Desktop/test.txt");
        FileInputStream fis = new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File is not found at the location");
        }
        try
        {
            int[] Ar1 = {1,2,3,4,5};
            System.out.println("Hello World");
            System.out.println(Ar1[5]);
            System.out.println("Around the world");
            System.out.println(2/0);
        }
        catch(ArithmeticException e)
        {
          //  e.printStackTrace();
            System.out.println("Invalid number");
        }
        catch(IndexOutOfBoundsException e)
        {
         // e.printStackTrace();
            System.out.println("Hello World");
        }
        catch(Exception e) //better to have this as last catch block in the last so that the exception is always caught
        {
            // e.printStackTrace();
            System.out.println("Hello World");
        }
    }
}
