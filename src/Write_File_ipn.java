import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Write_File_ipn {
    public static void Write_ipn(List<Student>list) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Student.inp"));

        for (int i = 0; i < list.size(); i++) {
            dos.writeInt(list.get(i).getId());
            dos.writeUTF(", "+list.get(i).getName()+", ");
            dos.writeFloat(list.get(i).getGpa());
            dos.writeUTF(", "+list.get(i).getAddress()+", ");
            dos.writeUTF(list.get(i).getNote()+"/n");
        }
        dos.close();
    }
}