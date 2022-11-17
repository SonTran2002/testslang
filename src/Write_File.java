import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Write_File {

    private static final String FILENAME = "Student_File.txt";

    public static void Write(List<Student>list) throws IOException {
    FileWriter fw ;
        try  {
            File file =new File(FILENAME);
            if(!file.exists()){
                file.createNewFile();
            }
            fw=new FileWriter(file.getAbsoluteFile(),true);
        }
        catch (IOException e) {
            System.out.println("File not exist");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Student data=list.get(i);
            String buf = data.getId() + ", " +
                    data.getName() + ", " +
                    data.getGpa() + ", " +
                    data.getAddress() + ", " +
                    data.getNote() + "\n";
            fw.write(buf);
        }
     fw.close();
    }

    public static void Write_New(List<Student>list) throws IOException{
        FileWriter fw ;
        try
        {
            fw = new FileWriter(FILENAME);
        }
        catch(IOException exc)
        {
            System.out.println("File not exist");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Student data=list.get(i);
            String buf = data.getId() + ", " +
                    data.getName() + ", " +
                    data.getGpa() + ", " +
                    data.getAddress() + ", " +
                    data.getNote() + "\n";
            fw.write(buf);
        }
        fw.close();
    }
}


    