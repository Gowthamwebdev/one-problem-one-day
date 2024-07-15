import java.io.*;
import java.util.*;
class FileWriterExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
           File f = new  File("D:\\HTML\\info.py");
           FileWriter writer = new FileWriter(f);
           String msg ="a=10\nb=20\nprint(a+b)";
           writer.write(msg);
           writer.close();
        } catch (Exception e) {

        }

    }
}
