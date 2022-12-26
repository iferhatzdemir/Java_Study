public class Course {
    Teacher teacher;
    String courseName;
    String courseCode;
    String prefix;
    int extraNote;

    int note;
Course(String courseName, String courseCode, String prefix, int note) {
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.prefix = prefix;
    this.note = 0;

}
void setTeacher(Teacher teacher) {
    if(teacher.branch.equals(this.prefix)){
        this.teacher = teacher;
    }else System.out.println("Teacher and course departments do not match.");
}
void getTeacherInfo() {
        this.teacher.print();
}

}
