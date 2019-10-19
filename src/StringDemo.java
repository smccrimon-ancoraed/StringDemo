import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        int i, j;
        String[] mynames;
        mynames = new String[10];
        String name;

        Scanner inputDevice = new Scanner(System.in);
// mynames[i] = inputDevice.nextLine();
        for (i = 0; i < mynames.length; i++) {
            System.out.println(i+") Please enter your name >> ");
            mynames[i] = inputDevice.nextLine();
        }

             // Print the list of names
        System.out.println("\nName list\n=================\n");
        // ConsoleWrite("")
         for (i = mynames.length-1; i>=0 ;i--) {

             System.out.println(i+") "+mynames[i]);

         }
        /*
         i = mynames.length;
         while (i != 0) {
            System.out.println(mynames[i]);
            i--;
        }

         */
        // for (start; condition; incr) { statements }
        // while (condition) { statements }
        // do {  statements  } while (condition)

        // 9; 9<9 = False ; i=9-1
        //  ; 8<9 = True ; i=8-1
        //  ; 7<9 = True ; i=7-1

    }
}
