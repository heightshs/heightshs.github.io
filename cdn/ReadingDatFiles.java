//Remember to import the classes
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDatFiles {

   //Describes that the main method can throw an error
   //If the .dat file isn't found
   public static void main(String[] args) throws IOException {
      
      //Establishes a link between Java the file
      File datFile = new File("input.dat");  
       
      //Creates a Scanner object associated with the previous file
      Scanner input = new Scanner(datFile);
      
      //Prints out the input.dat data
      while(input.hasNext()) {
         System.out.println(input.next());
      }
      
   }
}