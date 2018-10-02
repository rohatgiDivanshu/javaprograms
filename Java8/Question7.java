package com.Java8;

import java.io.*;

public class Question7 {
    public static void main(String[] args) throws FileNotFoundException {

        try
        {
            Employee employee1 = new Employee("divanshu",55000.0,"JVM");
            Employee employee2 = new Employee("akash",25000.0,"JVM");
            File file = new File("/tmp/employee");
            file.mkdir();
            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee/employee.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee1);
            objectOutputStream.flush();
            fileOutputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
