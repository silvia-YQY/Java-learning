package com.LessonOne.java;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FakeFile File1 = new FakeFile();
        File1.setFilePath("TextFile/text1.txt");
        File1.readToString();

        FakeFile File2 = new FakeFile();
        File2.setFilePath("TextFile/text2.txt");

        FileHelper F = new FileHelper();
        F.copy(File1,File2);
//        try {
//            File.writeString("今天天气很好啊。");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("e"+e);
//        }
    }
}
