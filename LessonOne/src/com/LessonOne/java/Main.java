package com.LessonOne.java;

public class Main {
    public static void main(String[] args) {
        FakeFile File1 = new FakeFile();
        FakeFile File2 = new FakeFile("TextFile/text2.txt");

        FileHelper F = new FileHelper();
        F.copy(File1,File2);

    }
}
