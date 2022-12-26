public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String phone, String branch) {
        this.name = name;
        this.phone=phone;
        this.branch = branch;
    }
void print() {
    System.out.println("NAME:"+this.name);
    System.out.println("PHONE:"+this.phone);
    System.out.println("BRANCH:"+this.branch);
}

}
