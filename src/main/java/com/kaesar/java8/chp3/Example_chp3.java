package com.kaesar.java8.chp3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example_chp3 {

    public static String proceeFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

//    public static String processFile() throws IOException {
//        String result =
//    }
}
