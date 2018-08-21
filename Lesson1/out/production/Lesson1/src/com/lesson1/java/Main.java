package com.lesson1.java;

public class Main {

    public static void main(String[] args) {

        FakeFile File = new FakeFile();
        File.setFilePath("TextFile/text1.txt");
        File.readToString();

    }
}
