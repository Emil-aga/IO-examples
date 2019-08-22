
package IO;
import java.io.BufferedWriter;
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
     
     public static void writeUsingBufferedWriterAutoCloseable(String data){
         File file =new File("qaqam.txt");
         
            try( BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
            
             bw.write(data);
             //no need to close it
             //bw.close()
         }catch(IOException e){
             e.printStackTrace();
         }
     }
     
     public static void writeUsingBufferedWriter(String data){
         File file=new File("test.txt");
         FileWriter fw=null;
         BufferedWriter bw=null;
         try{
             fw=new FileWriter(file);
             bw=new BufferedWriter(fw);
             bw.write(data);
         }catch(IOException e){
             e.printStackTrace();
         }finally{
             try{
                 if(bw!=null){
                 bw.close();}
                 if(fw!=null){
                     fw.close();
                 }
                 
                 
             }
             catch(IOException e){
                 e.printStackTrace();
             }
         }
     }
     
     public static void main(String[] args) {
          String data="Bu bir Datadir";
        writeUsingBufferedWriter(data);
    }
        
    }

