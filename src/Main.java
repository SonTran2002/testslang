import java.io.IOException;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<Student> list_Student = new ArrayList<Student>();
        Write_File_ipn wr_ipn=new Write_File_ipn();
        Read_File rd=new Read_File();
        Write_File wr=new Write_File();
        boolean exit = false;
        while (true) {
            System.out.println("-----------menu------------");
            System.out.println("1. Add student.");
            System.out.println("2. Update student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by increase id.");
            System.out.println("5. Sort student by increase GPA.");
            System.out.println("6. Show All student.");
            System.out.println("0. exit.");
            System.out.println("---------------------------");
            System.out.print("Please choose: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Student s = new Student();
                    s = s.addStudent(s);
                    list_Student.add(s);
                    wr.Write(list_Student);
                    list_Student.clear();
                    break;
                case 2:
                    Student s2 = new Student();
                    System.out.println("Please enter Student's id");
                    int check = sc.nextInt();
                    boolean checkidChange = false;
                    rd.Read(list_Student);
                    for (int i = 0; i < list_Student.size(); i++) {
                        if (check == list_Student.get(i).getId()) {
                            checkidChange = true;
                            System.out.println("Student's id is:  ");
                            int t0 = sc.nextInt();
                            list_Student.get(i).setId(t0);
                            System.out.println("Student's name is: ");
                            String t1 = sc.nextLine();
                            t1 = sc.nextLine();
                            list_Student.get(i).setName(t1);
                            System.out.println("Student's gpa is: ");
                            Float t2 = sc.nextFloat();
                            list_Student.get(i).setGpa(t2);
                            System.out.println("Student's address is: ");
                            String t3 = sc.nextLine();
                            t3 = sc.nextLine();
                            list_Student.get(i).setAddress(t3);
                            System.out.println("Student's note is: ");
                            String t4 = sc.nextLine();
                            list_Student.get(i).setNote(t4);
                        }
                    }
                    if (checkidChange == true) {
                        System.out.println("Update success");
                        wr.Write_New(list_Student);
                        list_Student.clear();
                        break;
                    }
                    System.out.println("don't find Student's id");
                    break;
                case 3:
                    System.out.println("Please enter Student's id");
                    int check2 = sc.nextInt();
                    boolean checkidChange2 = false;
                    rd.Read(list_Student);
                    for (int i = 0; i < list_Student.size(); i++){
                        if (check2 == list_Student.get(i).getId()){
                            list_Student.remove(i);
                            checkidChange2 = true;
                        }
                    }
                    if (checkidChange2 == true) {
                        System.out.println("Delete success");
                        wr.Write_New(list_Student);
                        list_Student.clear();
                        break;
                    }
                    System.out.println("don't find Student's id");
                    break;
                case 4:
                    System.out.println("Sort student by increase id Success");
                    rd.Read(list_Student);
                    Student s4=new Student();
                    s4.Sort_Id(list_Student);
                    wr.Write_New(list_Student);
                    list_Student.clear();
                    break;

                case 5:
                    System.out.println("Sort student by increase GPA Success");
                    rd.Read(list_Student);
                    Student s5=new Student();
                    s5.Sort_GPA(list_Student);
                    wr.Write_New(list_Student);
                    list_Student.clear();
                    break;
                case 6:
                    rd.Read(list_Student);
                    Student s3 = new Student();
                    s3.show_Info_Student(list_Student);
                    list_Student.clear();
                    break;
                case 7:
                    rd.Read(list_Student);
                    wr_ipn.Write_ipn(list_Student);
                    System.out.println("Write file IPN Success");
                    list_Student.clear();
                    break;
                case 0:
                    exit = true;
                    break;
            }
            if (exit==true) {
                break;
            }
        }
    }
}

