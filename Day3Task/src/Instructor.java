public class Instructor extends User{
    String InstructorNo;


    public Instructor(int id, String name, String phoneNumber, String instructorNo) {
        super(id, name, phoneNumber);
        InstructorNo = instructorNo;
    }

    public String getInstructorNo() {
        return InstructorNo;
    }

    public void setInstructorNo(String instructorNo) {
        InstructorNo = instructorNo;
    }
}
