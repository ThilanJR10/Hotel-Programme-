
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static void main(String args[]) throws IOException {
        //initialize the displayRooms array and arr array
        String[][] arr = new String[10][3];
        //initializing the array
        Functions.initialize(arr);
        //Creating an object of type Room
        Functions room = new Functions();
        //Creating an object of customer class
        Customer customer = new Customer();
        //Creating an object of fileHandling class
        fileHandling handle = new fileHandling();
        
                
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("|                                                                                             |");
        System.out.println("                        *******WELCOME TO HOTEL MANAGEMENT SYSTEM*******              ");
        System.out.println("|                                                                                             |");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("      ##  LOGIN #####    ");
        System.out.println("");
        System.out.print("   USERNAME:   ");
        String username = sc.next();
        System.out.println("");
        System.out.print("   PASSWORD:   ");
        String password = sc.next();
        System.out.println("");
        if ((username.equalsIgnoreCase("1")) && ((password.equalsIgnoreCase("1")))) {
            System.out.println("Login Successfully!!!");

            while (true) {
                System.out.println("");
                System.out.println("");
                System.out.println("***************************************");
                System.out.println("---------------HOME PAGE---------------");
                System.out.println("***************************************");
                System.out.println("");

                String var = "";

                //Create Main Menu
                System.out.println(" V - Display Rooms");
                System.out.println(" A - Add Customers");
                System.out.println(" F - Find Rooms");
                System.out.println(" E - Display Empty Rooms");
                System.out.println(" D - Remove Customer");
                System.out.println(" O - View Rooms Ordered By Name");
                System.out.println(" S - Store Data In Text File");
                System.out.println(" L - Load Data Into The Array");
                System.out.println("");
                System.out.print("");
                System.out.print("Select Your Route:  ");
                System.out.print("");
                System.out.print("");

                var = sc.next();

                
                if (var.equalsIgnoreCase("V")) {
                    System.out.println("");
                    System.out.println("----------ALL ROOMS----------");
                    System.out.println("");

                    room.displayAllRooms(arr);

                } else if (var.equalsIgnoreCase("A")) {
                    System.out.println("");
                    System.out.println("----------ADDING CUSTOMER----------");
                    System.out.println("");

                    room.addCustomer(arr,customer);

                } else if (var.equalsIgnoreCase("F")) {
                    System.out.println("");
                    System.out.println("----------FIND ROOMS----------");
                    System.out.println("");

                    room.findRoomsFromCus_Name(arr);

                } else if (var.equalsIgnoreCase("E")) {
                    System.out.println("");
                    System.out.println("----------EMPTY ROOMS----------");
                    System.out.println("");

                    room.displayEmptyRooms(arr);

                } else if (var.equalsIgnoreCase("D")) {
                    System.out.println("");
                   
                           System.out.println("----------REMOVE CUSTOMER----------");
                    System.out.println("");

                    room.removeCustomer(arr);

                } else if (var.equalsIgnoreCase("O")) {
                    System.out.println("");
                    System.out.println("----------SORT CUSTOMERS' NAMES----------");
                    System.out.println("");

                    room.orderedRoomsByName(arr);
                }  else if (var.equalsIgnoreCase("S")) {
                    System.out.println("");
                    System.out.println("----------STORE DATA IN TEXT FILE----------");
                    System.out.println("");

                    handle.fileWrite(arr);
                    
                }  else if (var.equalsIgnoreCase("L")) {
                    System.out.println("");
                    System.out.println("----------LOAD DATA INTO THE ARRAY----------");
                    System.out.println("");

                    handle.fileRead(arr);
                   

                } else {

                    System.out.println("");
                    System.out.println("INVALID SELECTION");

                }
            }
        } else {
            System.out.println("Username or Password Incorrect!!!");
            
        }
    }
    

}
