public class Courses {
    private int id;
    private String CourseName;
    private String CourseCode;
    private double CoursePrice;

    public Courses() {
    }

    public Courses(int id, String courseName, String courseCode, double coursePrice) {
        this.id = id;
        CourseName = courseName;
        CourseCode = courseCode;
        CoursePrice = coursePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public double getCoursePrice() {
        return CoursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        CoursePrice = coursePrice;
    }
}
