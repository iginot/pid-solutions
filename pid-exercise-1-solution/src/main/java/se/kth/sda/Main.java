package se.kth.sda;

public class Main {
    public static void main(String[] args) {
        final String path = "resources/bars.xml";
        Program program = new Program(path);
        program.run();
    }
}
