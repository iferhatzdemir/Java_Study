public class Student {
    //name,code,prefix,note,Teacher tanımlamaları ilk önce yapılacak
    String name;
    String studentNumber;
    String ClassName;
    Course c1;
    Course c2;
    Course c3;


    boolean isPass;
    double avarage;



    public Student(String name, String studentNumber, String ClassName, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.ClassName = ClassName;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.avarage = 0;


    }

    void addBulkExamNote(int note1, int note2, int note3, int exNote1, int exNote2, int exNote3) {

        if ((note1 >= 0 && note1 <= 100) && (note2 >= 0 && note2 <= 100) && (note3 >= 0 && note3 <= 100)) {
            this.c1.note = note1;
            this.c2.note = note2;
            this.c3.note = note3;
            this.c1.extraNote = exNote1;
            this.c2.extraNote = exNote2;
            this.c2.extraNote = exNote3;
        }


    }

    public void isPass() {

        this.avarage = ((this.c1.note*80)/100+(this.c1.extraNote*20)/100 + (this.c2.note*80)/100+(this.c2.extraNote*20)/100 +(this.c3.note*80)/100+(this.c3.extraNote*20)/100) / 3;
        if (this.avarage > 50.00) {
            this.isPass = true;
            System.out.println("Congratulation! Your are Passed!");
        }else {
            System.out.println("Sorry! Your are not Passed! Try Again");
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.courseName + " : " + this.c1.note);
        System.out.println(this.c2.courseName + " : " + this.c2.note);
        System.out.println(this.c3.courseName + " : " + this.c3.note);
        System.out.println("Avarage : " + this.avarage);
    }
void getStudentInfo(){
    System.out.println("*************************************************");
    System.out.println("            The Student Information");
    System.out.println("*************************************************");
    System.out.println(this.name + " " + this.ClassName + " ( " + this.studentNumber + " )");
    System.out.println("-------------------------------------------------");
}

}

    
    /*public static void CourseAdd() {

        System.out.println("Course Additional Screen:");
        System.out.println("Select the course you want to add:");
        System.out.println("1-History\n2-Math\n3-Chemical\n4-Biological\n5-Language");
        int input = scanner.nextInt();
      
            switch (input) {
                case 1:
                    if (!(stdCourses.contains("History"))) {
                        stdCourses.add("History");
                    } else {
                        System.out.println("You've already taken the history lesson:");
                        CourseAdd();
                    }
                    break;
                case 2:
                    if (!(stdCourses.contains("Math"))) {
                        stdCourses.add("Math");
                    } else {
                        System.out.println("You've already taken the Math lesson:");
                        CourseAdd();
                    }
                    break;
                case 3:
                    if (!(stdCourses.contains("Chemical"))) {
                        stdCourses.add("Chemical");
                    } else {
                        System.out.println("You've already taken the Chemical lesson:");
                        CourseAdd();
                    }
                    break;
                case 4:
                    if (!(stdCourses.contains("Biological"))) {
                        stdCourses.add("Biological");
                        System.out.println("Biological Added.");
                    
                    } else {
                        System.out.println("You've already taken the Biological lesson:");
                        CourseAdd();
                    }
                    break;
                case 5:
                    if (!(stdCourses.contains("Language"))){
                        stdCourses.add("Language");
                    } else {
                        System.out.println("You've already taken the Language lesson:");
                        CourseAdd();
                    }
                    break;
                default:
                    System.out.println("Enter a Valid Input");
                    CourseAdd();

        }
    }
}*/
