import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.List;

public class Read_File {

    private static final String FILENAME = "Student_File.txt";

    public static void Read(List<Student> list) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILENAME));

        String strCurrentLine;
        int i = 0;
        while ((strCurrentLine = br.readLine()) != null) {
            Student s = new Student();
            String s;
            String[] buffer = strCurrentLine.split(", ");
            s.setId(Integer.parseInt(buffer[0]));
            s.setName(buffer[1]);
            s.setGpa(Float.parseFloat(buffer[2]));
            s.setAddress(buffer[3]);
            s.setNote(buffer[4]);
            list.add(s);
            i++;
        }
        br.close();

    }
}
