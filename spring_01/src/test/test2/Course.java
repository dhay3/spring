package test.test2;

public class Course {
    private String courseName;
    private int courseHour;
    //授课老师
    private Teacher teacher;//依赖于Teacher类

    public Course(String courseName, int courseHour, Teacher teacher) {
        this.courseName = courseName;
        this.courseHour = courseHour;
        this.teacher = teacher;
    }

    public Course() {

    }

    public Course(Teacher teachers) {
        this.teacher = teachers;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseHour=" + courseHour +
                ", teacher=" + teacher +
                '}';
    }
}
