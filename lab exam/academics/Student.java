package academics;
public class Student {
    private String name;
    private int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
    public void display(String pre) {
        System.out.println(pre + " Name: " + name + ", Roll No: " + rollNo);
    }
}