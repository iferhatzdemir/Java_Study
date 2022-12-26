public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("David", "05415316784", "Math");
        Teacher t2 = new Teacher("feqw", "05415316784", "FZK");
        Teacher t3 = new Teacher("guas", "05415316784", "BIO");
        //t1.print();
        Course Course1 = new Course("Math", "101", "MTH", 100);
        Course Course2 = new Course("FZK", "101", "FZK", 100);
        Course Course3 = new Course("BIO", "101", "BIO", 100);
        Course1.setTeacher(t1);
        Course2.setTeacher(t2);
        Course3.setTeacher(t3);

        Student s1 = new Student("David", "05415316784", "1", Course1, Course2, Course3);
        s1.addBulkExamNote(100, 100, 100,100,80,90);

        s1.isPass();
    }


}