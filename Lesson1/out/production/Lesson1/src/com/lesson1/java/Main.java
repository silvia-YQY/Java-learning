package com.lesson1.java;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        FakeFile File = new FakeFile();
        File.setFilePath("TextFile/text1.txt");
        File.readToString();
        File.writeString("今天天气很好啊。");

    }
}
