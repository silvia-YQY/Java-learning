package com.LessonNine.java;

import java.io.*;

public class createFile extends Thread {

    public createFile(int FileName, String content) throws IOException {
        super(String.valueOf(FileName));
        System.out.println(FileName + "  Child thread: " + this);
        run(FileName,content);
    }

    public void run(int fileName,String content) {
        try{
            BufferedWriter output = new BufferedWriter(new FileWriter( "src/main/resources/"+fileName + ".txt"));
            output.write(content);
            output.close();
            System.out.println("  成功: " + "src/main/resources/"+fileName + ".txt");
        }catch (IOException e){
            System.out.println("  错误: " + e);
        }

    }
}
