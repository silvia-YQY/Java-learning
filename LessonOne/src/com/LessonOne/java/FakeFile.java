package com.LessonOne.java;
import java.io.*;


public class FakeFile {
    public final String fileName;
    private static int number = 0;

    //设置文件路径

    //构造方法一
    public FakeFile(String fileName){
        this.fileName = fileName;
        FakeFile.number += 1;
        System.out.println("设置路径成功！");
    }

    //构造方法二 ，默认构造
    public FakeFile(){
        this.fileName = "TextFile/text1.txt";
        FakeFile.number += 1;
    }


    //读取文件内容
    public String readToString() {
        String context = "";
        try {
            FileInputStream input  = new FileInputStream(this.fileName);
            InputStreamReader reader = new InputStreamReader(input,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            //System.out.println("bufferedReader"+bufferedReader);
            try {
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    context += line;
                }
                System.out.println("读取的文件内容为："+context);
                reader.close();
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("请输入正确文件名"+e);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("文件内没有内容"+e);
        }
        return context;

    }
    //写入文件
    public void writeString(String content) throws IOException {
        FileOutputStream output = new FileOutputStream(this.fileName);
        OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
        PrintWriter printer = new PrintWriter(writer);
        System.out.println("写入文件成功，写入内容为："+content);
        printer.print(content);
        printer.close();
        writer.close();
        output.close();

    }



}
