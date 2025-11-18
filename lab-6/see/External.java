package see;

import cie.Student;

public class External extends Student {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }
}