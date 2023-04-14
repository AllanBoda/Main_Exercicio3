package POO;

import java.util.Scanner;

class InputReader {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
