public class Main {
    public static void main(String[] args) {
        Courses course1 = new Courses(3,"Yazılım","101",15000);
        Courses course2 = new Courses(4,"Pazarlama","102",20000);
        CourseManager courseManager = new CourseManager();
        courseManager.add(course1);
        Courses[] courses = {course1,course2};

        for (Courses course : courses){
            System.out.println(course.getCourseName());
        }


    }

}
