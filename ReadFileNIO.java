package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileNIO {
    public static void main(String[] args) throws IOException {
        System.out.println(readFileAsString("test.txt"));
    }
    public static String readFileAsString(String filename) throws IOException{
       byte [] data=readFileAsByte(filename); 
        
       String dataStr=new String (data);
       return dataStr;
    }
    public static  byte[] readFileAsByte (String filename) throws IOException{
        Path path=Paths.get(filename);
        return Files.readAllBytes(path);
    }
            
            
}
