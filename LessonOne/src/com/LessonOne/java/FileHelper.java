package com.LessonOne.java;
import java.io.*;

public class FileHelper {

    public static void copy(FakeFile file1,FakeFile file2 ){
        try {
            file2.writeString(file1.readToString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}