package com.LessonOne.java;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FakeFile File1 = new FakeFile();
        File1.setFilePath("TextFile/text1.txt");

        FakeFile File2 = new FakeFile();
        File2.setFilePath("TextFile/text2.txt");

        FileHelper F = new FileHelper();
        F.copy(File1,File2);

    }
}
