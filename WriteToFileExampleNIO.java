package IO;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class WriteToFileExampleNIO {
    public static void main(String[] args) throws IOException {
        String data="bu vacib bir Datadir";
        writeUsingPath("test.txt",data);
        copyFileUsingPath();
    }
    public static void writeUsingPath(String filename,String data) throws IOException{
        Path path=Paths.get(filename);
        Files.write(path,data.getBytes());
    }
    public static void writeUsingBufferedWriter(String filename,String data){
        Path path=Paths.get(filename);
        try(BufferedWriter bw=Files.newBufferedWriter(path, Charset.forName("UTF-8"))){
            bw.write(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void copyFileUsingPath(){
       Path old=Paths.get("old.txt");
       Path new1=Paths.get("new.txt");
       try(OutputStream os=new FileOutputStream(new1.toFile())){
           Files.copy(old, os);
       }catch(IOException e){
           e.printStackTrace();
       }
    }


}
