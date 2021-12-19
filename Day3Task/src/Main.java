import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(3,"Zeynep","500",60);
        Student st2 = new Student(4,"Yağmur","555",80);

        Instructor ins1 = new Instructor(5,"Kubilay","555","ins101");
        Instructor ins2 = new Instructor(6,"Tekinöz","555","ins102");

        Instructor[] instructors = {ins1,ins2};
        Student[] students = {st1,st2};

        for (Instructor instructor : instructors){
            System.out.println("Eğitmen " + instructor.getId() + " : "+ instructor.getName());
        }
        System.out.println("----------------------------------");
        for(Student student : students){
            System.out.println("Öğrenci " +student.getId() + " : "+ student.getName());
        }

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new InstructorManager());

        customerManager.add(new StudentManager());
    }
}
