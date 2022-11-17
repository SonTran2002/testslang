import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 public class Student{
       int id;
       String name;
       float gpa;
       String address;
       String note;


    Student addStudent(Student a) {
        a = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Student's id is:  ");
        a.id=sc.nextInt();
        System.out.println("Student's name is: ");
        a.name = sc.nextLine();
        a.name = sc.nextLine();
        System.out.println("Student's gpa is: ");
        a.gpa = sc.nextFloat();
        System.out.println("Student's address is: ");
        a.address = sc.nextLine();
        a.address = sc.nextLine();
        System.out.println("Student's note is: ");
        a.note = sc.nextLine();
        System.out.println("Student's successfully added to the list!");
        return a;
    }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public float getGpa() {
         return gpa;
     }

     public void setGpa(float gpa) {
         this.gpa = gpa;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public String getNote() {
         return note;
     }

     public void setNote(String note) {
         this.note = note;
     }

      public void show_Info_Student(List<Student>list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Student["+(i+1)+"]: ");
            System.out.println("id:  " +  list.get(i).getId());
            System.out.println("name:  "+ list.get(i).getName());
            System.out.println("gpa:  "+ list.get(i).getGpa());
            System.out.println("address:  "+ list.get(i).getAddress());
            System.out.println("note:  "+  list.get(i).getNote());
            System.out.println("");
        }
    }
    public void Sort_Id(List<Student>list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).id>list.get(j).id) {
                    Student s=new Student();
                    s=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,s);
                }
            }
        }
    }
     public void Sort_GPA(List<Student>list) {
         for (int i = 0; i < list.size(); i++) {
             for (int j = i + 1; j < list.size(); j++) {
                 if (list.get(i).getGpa()>list.get(j).getGpa()) {
                     Student s=new Student();
                     s=list.get(i);
                     list.set(i,list.get(j));
                     list.set(j,s);
                 }
             }
         }
     }
}


