package Seminar3;

//public void rwLine(Path pathRead,Path pathWrite)trows IOException{
//        BufferedReader in=null;
//        BufferedWriter out=null;
//        try{
//            in = Files.newBufferReader(pathRead);
//            out = Files.newBufferWriter(pathWrite);
//            out.write(in.readLine());
//        } finally {
//            try {
//                if (in != null) in.close();
//        } catch(IOException e);
//        }
//        try{
//            if(out != null) out.close();
//        } catch(IOException e)
//        }

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

//public class Task1 {
    //public static void main(String[] args) {

 //   }

//    public void rwLine(Path pathRead, Path pathWrite) {
//        try (BufferedReader in = Files.newBufferedReader(readPath)) ;
//        BufferedWriter out = Files.newBufferedWriter(writePath);
//    } {
//        out.write(in.readLine());
//    } catch (IOException e){
//        System.out.println("Ошибка чтения файла");
//    }
//}
