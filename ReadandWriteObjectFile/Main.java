
package IO.ReadandWriteObjectFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
   User u=new User("Emil","Aga",25);
   
   File file=new File("test.txt");
   
     try (ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(file))) {
            oos.writeObject(u);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
         u=(User) ois.readObject();
            System.out.println(u.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
   
}}
