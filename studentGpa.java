import java.util.ArrayList;
import java.util.List;

class Student{
    private String name = null;
    private double gpa = 0;
    public Student(String name, double gpa){
        this.name= name;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}
public class studentGpa {
    public static void main(String[] args){
        List<Student> student = new ArrayList<>();
        student.add(new Student("Ayan",8.33));
        student.add(new Student("Nabila",9.6));
        student.add(new Student("Mukhtar",10.0));
        student.sort((o1,o2)->{
            if(o2.getGpa() - o1.getGpa()>0){
                return 0;
            } else if (o2.getGpa() - o1.getGpa()<0) {
                return -1;
            }else {
                return 0;
            }
        });
        for(Student s: student){
            System.out.println(s.getName()+" "+s.getGpa());
        }
    }
}
