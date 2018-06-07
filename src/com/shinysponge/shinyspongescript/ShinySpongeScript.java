package com.shinysponge.shinyspongescript;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShinySpongeScript {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("insert file name: ");
        String name = s.nextLine();
        s.close();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("res/" + name + ".sss"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        List<String> lines = new ArrayList<>();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            SSScript script = Compiler.compile(name + ".sss", lines);
        }
    }

}
