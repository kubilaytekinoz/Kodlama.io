public class Student extends User {
    int not1;

    public Student() {

    }

    public Student(int id, String name, String phoneNumber, int not1) {
        super(id, name, phoneNumber);
        this.not1 = not1;
    }

    public int getNot1() {
        return not1;
    }

    public void setNot1(int not1) {
        this.not1 = not1;
    }
}
