package decorator.realworld;

import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException {
        LineNumberReader reader =
                new LineNumberReader(new BufferedReader(new FileReader("README.adoc")));

        System.out.println(reader.getLineNumber());
        System.out.println(reader.readLine());
    }
}