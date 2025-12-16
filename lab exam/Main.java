import extracurricular.*;

public class Main {
    public static void main(String[] args) {

        Sports p = new Sports("Ram", 32, 4);
        System.out.println("=== Default Display ===");
        p.display();
        System.out.println("\n=== Overloaded Display with Prefix ===");
        p.display(">>>");
    }
}