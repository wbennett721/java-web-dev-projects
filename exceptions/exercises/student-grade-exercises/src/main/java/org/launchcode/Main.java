package org.launchcode;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y) {
        // Write code here!
        x = 100;
        boolean b = y <= 0;

        try {

            if (y == 0) {
            }
            throw new ArithmeticException("WARNING: Y cannot equal 0");


        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        return x;
    }

    public static <fileName> int CheckFileExtension(String fileName) {
        String[] fileNames = new String[0];
        for (String fileName : fileNames) {
            try {
                CharSequence java = null;
                if (fileName.contains(java)) {
                    throw new CheckFileExtensionException(fileName);
                } else {
                    boolean b = !fileName.contains(java);
                    //.java, they get 0 points. If the file submitted is null or an empty string,
                if (fileName == null);
                if (Objects.equals(fileName, ""));
                if (fileName == String.valueOf(0));

                }


            } catch (CheckFileExtensionException e) {
                e.printStackTrace();
            }

        }

    }

}    // Write code here!

