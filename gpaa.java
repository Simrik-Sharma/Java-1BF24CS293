import java.util.Scanner;
class Student
{
    String USN;
    String name;
    int[] marks = new int[8];
    int[] credits = new int[8];
    void read(Scanner sc)  
    {
        System.out.println("Enter USN:");
        USN = sc.nextLine();
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter marks and credits for 8 subjects:");
        for (int i = 0; i < 8; i++)
        {
            System.out.println("Subject " + (i + 1) + " marks:");
            marks[i] = sc.nextInt();
            System.out.println("Subject " + (i + 1) + " credits:");
            credits[i] = sc.nextInt();
            sc.nextLine(); 
        }
    }
    double gradePoint(int mark)
    {
        if (mark >= 90) return 10;
        else if (mark >= 80) return 9;
        else if (mark >= 70) return 8;
        else if (mark >= 60) return 7;
        else if (mark >= 50) return 6;
        else if (mark >= 40) return 5;
        else return 0;
    }
    double sgpa()
    {
        int totalCredits = 0;
        double totalPoints = 0;
        for (int i = 0; i < 8; i++)
        {
            totalPoints += gradePoint(marks[i]) * credits[i];
            totalCredits += credits[i];
        }
        return totalPoints / totalCredits;
    }
    void display()
    {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + name);
        System.out.printf("SGPA: %.2f\n", sgpa());
    }
}
class gpaa
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter details for Student 1:");
        s1.read(sc);
        System.out.println("Details for Student 1:");
        s1.display();
        System.out.println();  
        Student s2 = new Student();
        System.out.println("Enter details for Student 2:");
        s2.read(sc);
        System.out.println("Details for Student 2:");
        s2.display();
        sc.close();
    }
}
