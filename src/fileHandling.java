 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class fileHandling { 
    public static void fileWrite(String[][]arr) throws IOException{
try {

            File file = new File("Customers.txt");

            //Creates the text file if doesn't exist
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String[] rooms : arr ) {
                bufferedWriter.write(Arrays.toString(rooms));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            
            System.out.println("");
            System.out.println("All the data saved to a text file successfully.");

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }

public static void fileRead(String[][]arr){
 //instance of the buffer reader
        BufferedReader bufferedReader = null;

        try {
            //current line
            String line;

            bufferedReader = new BufferedReader(new FileReader("Customers.txt"));

            //reading line by line until the line becomes null
            while ((line = bufferedReader.readLine()) != null) {

                //split the lines one by one
                String[] lineParts = lineParts = line.split(" ",-1);
                //assigning the parts of the line
                String IDNumber = lineParts[0];
                String firstName = lineParts[1];
                String lastName = lineParts[2];
                
                //display data load from the file
                System.out.println(lineParts[0]+" "+lineParts[1]+" "+lineParts[2]);

             //  arr[Integer.parseInt(IDNumber)][1].equals(firstName);
             //  arr[Integer.parseInt(IDNumber)][2].equals(lastName);
              //  arr[Integer.parseInt(IDNumber)].setLastName(lastName);

            }
            System.out.println("");
            System.out.println("All the data loaded from the text file successfully.");

        } catch (IOException e) {
            System.out.println("Sorry! The program could not find the text file");
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
            } catch (IOException ex) {
                System.out.println("Oops! Something went wrong.");
            }
}

}
}
    
    
    
    
    
    
    
    
    
    
    

