import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      create variables
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int page_size_input = 0;
        int page_size = 0;
        int virtual_address_input = 0;
        int page_number = 0;
        int offset = 0;
        String x = "n";


//      using a while loop to keep program running
        while (flag){

//          ask user input
            System.out.println("Enter page size: ");
            page_size_input = scanner.nextInt();
            System.out.println("Enter a virtual address: ");
            virtual_address_input = scanner.nextInt();

//          do calculation
            page_size = page_size_input * 1024;
            page_number = virtual_address_input / page_size;
            offset = virtual_address_input % page_size;

//          print result
            System.out.println("The address "+virtual_address_input+" contains: page number = "+page_number+" offset = "+offset +"\n");

//          ask for continue or not
            System.out.println("Continue?(y/n): " );
            x = scanner.next();

//          if x equal to n then set flag to false and end the program by end the loop
            if (x.equals("n")){
                flag = false;
            }


        }

    }
}