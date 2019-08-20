
package IO;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFileExampleIO {
    
      
     public static void writeUsingFileWriter(String data){
         FileWriter fw=null;
         File file=new File("test.txt");
         try{
             fw=new FileWriter(file,true);
             fw.write(data);
         }catch(IOException e){
             e.printStackTrace();
         }finally{
             try{
                 fw.close();
             }catch(IOException e){
                 e.printStackTrace();
             }
         }
         
     }  
     public static void writeUsingOutputStream(String data){
         OutputStream os=null;
         File file =new File("test.txt");
         try{
             os=new FileOutputStream(file,true);
         os.write(data.getBytes(),0,data.length());
             
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
          String data="salam aleykum esq olsun qardaslara";
        writeUsingFileWriter(data);
    }
        
    }

