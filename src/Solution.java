//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "Hello world\n" +
            "I am a file\n" +
            "Read me until end-of-file.\n";
        Scanner scanner = new Scanner(mockInput);
        int i = 1;
        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            System.out.printf("%d %s%n", i, message);
            i++;
        }
        scanner.close();
    }
}