package java11.lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(
                new File("src/java11/lesson1/input.txt") );
        PrintWriter out = new PrintWriter(
                new File("src/java11/lesson1/output.txt") );
        int n = in.nextInt(); //прочитать из файла и записать в перем.

        int z = n / 100; // 456 / 100 = 4
        int x = (n / 10) % 10;  // 456 / 10 = 45 % 10 = 5
        int y = n % 10;  // 456 % 10 = 6, пример еще 5 % 3 = 2

        out.print("" + x*y*z);

        out.flush();
        out.close();
    }
}