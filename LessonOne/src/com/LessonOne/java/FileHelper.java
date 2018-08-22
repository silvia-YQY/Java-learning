package com.LessonOne.java;
import java.io.*;
//import com.LessonOne.java.FakeFile;


public class FileHelper {

    public static void copy(FakeFile file1,FakeFile file2 ){

        String fileContext = file1.readToString();
        try {
            file2.writeString(fileContext);
            System.out.println("copy成功，内容为："+fileContext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}