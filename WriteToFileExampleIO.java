
package IO;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.IOException;
public class WriteToFileExampleIO {
    
      
       
     public static void writeUsingOutputStream(String data){
         OutputStream os=null;
         File file =new File("C:\\Users\\Emilaga\\Desktop\\setup.txt");
         try{
             os=new FileOutputStream(file,true);
         os.write(data.getBytes());
     }catch(IOException ex){
         ex.printStackTrace();
     }finally{
             try{
                 os.close();
             }catch(IOException ex){
                 ex.printStackTrace();
             }
         }
        
        
     }
     
     
     public static void main(String[] args) {
          String data="salam aleykum";
        writeUsingOutputStream(data);  
    }
        
    }

