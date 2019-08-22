package IO;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class ReadFileIO {
    public static void main(String[] args) throws FileNotFoundException, IOException   {
            readFileUsingByte("test.txt");
    }
    public static void readUsingBufferedReader(String filename){
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr=new FileReader(filename);
            br=new BufferedReader(fr);
           String setir;
           while((setir=br.readLine())!=null){
                System.out.println(setir);
               }
       }catch(IOException E){
            E.printStackTrace();
        }finally{
            try{
                if(br!=null){
                    br.close();
                }
                if(fr!=null){
                    fr.close();
                }
            }catch(IOException E){
                E.printStackTrace();
            }
        }
    }
    public static void readUsingBufferedReaderAutoCloseable(String filename){
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
          String setir;
          while((setir=br.readLine())!=null){
              System.out.println(setir);
          } 
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readUsingFileReader(String filename) throws IOException{
        //istifadesi meslehet deyildir
        FileReader fr=new FileReader(filename);
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
    }
    public static void readUsingScanner(String filename) throws FileNotFoundException{
        File file=new File(filename);
        Scanner sc=new Scanner(file);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
    public static void readUsingInputStream(String filename){
        try(InputStream is=new FileInputStream(filename)){
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readFileUsingByte(String filename) throws FileNotFoundException, IOException{
        File file=new File(filename);
        FileInputStream fis =new FileInputStream(file);
        byte[]arr=new byte[(int)file.length()];
        fis.read(arr,0,arr.length);
        for(int x:arr){
            System.out.print((char)x);
        }
            
        
    }
}
