
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    Scanner sc = new Scanner(System.in);
    //Functions functions = new Functions();

    public static void initialize(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = "empty";//id
            arr[i][1] = "empty";//first name
            arr[i][2] = "empty";//last name
        }
    }

    public void displayAllRooms(String[][] Rooms) {

        try {
    //
            for (int i = 0; i < Rooms.length; i++) {
                if (!Rooms[i][0].equals("empty") || !Rooms[i][1].equals("empty") || !Rooms[i][2].equals("empty")) {
                    System.out.println("");
                    System.out.println("ROOM NO " + i + ":" + " CUS_ID:" + Rooms[i][0] + "  F_NAME:" + Rooms[i][1] + "  L_NAME:" + Rooms[i][2]);
                } else {
                    System.out.println("");
                    System.out.println("ROOM NUMBER " + i + " IS EMPTY");
                }
            }

        } catch (Exception ex) {
            System.out.println("");
            System.out.println("ERROR OCCURED!!");
        }
    }

    public void addCustomer(String[][] Rooms, Customer customer) {
        try {
           // boolean flag = false;
            System.out.print("Enter the Room No : ");
            customer.setRoomNumber(sc.nextInt());
            System.out.print("Enter the customer ID : ");
            customer.setCusID(sc.next());
            System.out.print("Enter the customer First Name: ");
            customer.setFirstName(sc.next());
            System.out.print("Enter the customer Last Name : ");
            customer.setLastName(sc.next());
            
            if(Rooms[customer.getRoomNumber()][1].equals("empty")){
            //Assigning to the array
            Rooms[customer.getRoomNumber()][0] = customer.getCusID();
            Rooms[customer.getRoomNumber()][1] = customer.getFirstName();
            Rooms[customer.getRoomNumber()][2] = customer.getLastName();
            
            System.out.println("");
            System.out.println("Customer Added***");
            }else{
                System.out.println("");
                System.out.println("Sorry! The Room Is Aready Occupied.");
            }
            
        } catch (Exception ex) {
            System.out.println("");
            System.out.println("INVALID USER INPUT!!");
        }
    }

    public void findRoomsFromCus_Name(String[][] Rooms) {
        try {
            Boolean flag = false;
            String cusFName;
            String cusLName;

            System.out.print("Enter Customer First Name: ");
            cusFName = sc.next();
            System.out.print("Enter Customer Last Name : ");
            cusLName = sc.next();
            System.out.println("");
            //read the each file and get values
            for (int i = 0; i < Rooms.length; i++) {
                if (Rooms[i][1].equalsIgnoreCase(cusFName) && Rooms[i][2].equalsIgnoreCase(cusLName)) {
                    System.out.println("CUSTOMER " + cusFName + " " + cusLName + "IS IN ROOM NUMBER: " + i);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Sorry! No such customer exists");
            }

        } catch (Exception ex) {
            System.out.println("");
            System.out.println("ERROR OCCURED!!!");
        }
    }

    public void displayEmptyRooms(String[][] Rooms) {
        try {
            //read the each file and get values
            for (int i = 0; i < Rooms.length; i++) {
                if (Rooms[i][0].equals("empty") || Rooms[i][1].equals("empty") || Rooms[i][2].equals("empty")) {
                    System.out.println("");
                    System.out.println("ROOM NUMBER " + i + " IS EMPTY!!!");
                }
            }

        } catch (Exception ex) {
            System.out.println("");
            System.out.println("ERROR OCCURED!!");
        }
    }

    public void removeCustomer(String[][] Rooms) {
        try {
            String cusID;
            String cus_FNAME;
            String cus_LNAME;
            String getPermission;
            Boolean flag = false;

            System.out.print("Enter Customer ID : ");
            cusID = sc.next();
            System.out.print("Enter Customer First Name: ");
            cus_FNAME = sc.next();
            System.out.print("Enter Customer Last Name:  ");
            cus_LNAME = sc.next();
            System.out.print("Are you sure that you want to Permanently Remove this Customer? (Y/N):  ");
            getPermission = sc.next();

            if (getPermission.equalsIgnoreCase("Y")) {
                //read the each file and get values
                for (int i = 0; i < Rooms.length; i++) {

                    if (Rooms[i][0].equalsIgnoreCase(cusID) && Rooms[i][1].equalsIgnoreCase(cus_FNAME) && Rooms[i][2].equalsIgnoreCase(cus_LNAME)) {
                        Rooms[i][0] = "empty";
                        Rooms[i][1] = "empty";
                        Rooms[i][2] = "empty";
                        flag = true;
                        System.out.println("");
                        System.out.println("Successfully deleted the customer****");
                        break;
                        
                        
                    }
                }
                if(!flag){
                    System.out.println("Sorry!Couldn't find the customer");
                }
            } else {
                return;
            }
        } catch (Exception ex) {
            System.out.println("");
            System.out.println("INVALID USER INPUT!!");
        }
    }

    public void orderedRoomsByName(String[][] Rooms) {
        //sort using bubble sort algorithm
        for (int i = 0; i < Rooms.length-1; i++) {
            for (int j = 0; j < Rooms.length - 1; j++) {

                if ((Rooms[j][1].compareToIgnoreCase(Rooms[j + 1][1])) > 0) {
                    //swap the words
                    
                    String tempfName= Rooms[j][1];
                    Rooms[j][1]=Rooms[j+1][1];
                    Rooms[j+1][1]=tempfName;
                    
                            
                }

            }

        }
        //print sorted customer names 
        System.out.println("CUSTOMERS IN ALPHABETICALLY ORDER: ");
        for(int k =0;k<Rooms.length;k++){
            //if(!Rooms[k][0].equals("empty")&&!Rooms[k][1].equals("empty")&&!Rooms[k][2].equals("empty")){
            String sortedCustomer = Rooms[k][1];
            if(!sortedCustomer.equals("empty")){
            System.out.println(sortedCustomer);
            }
        
       // }
        }
    }
      
}
