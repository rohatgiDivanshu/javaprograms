package com.Java8;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Question8 {
    public static void main(String[] args) throws IOException {
        File file = new File("/tmp/employee/divanshu.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] buffer = new byte[2078];
            int bytesRead = 0;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            bufferedInputStream.close();
        }
    }
}
