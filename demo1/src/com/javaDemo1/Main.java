package com.javaDemo1;
import java.util.* ;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //标准输出
        int [] a = new int[10];
        a[0] = 5;
        System.out.println("Hello,world"+a);

        //标准输入
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));

        Scanner scan = new Scanner(System.in) ; // 从键盘接收数据
        System.out.print("输入数据：") ;
        String str =  scan.next();  // 接收数据
        do{
            System.out.println("输入的数据为：" + str) ;
        }while((str= scan.next())!=null);
        /*
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

        InputStream val = System.in ;
        InputStreamReader stdReader = new InputStreamReader(System.in);
        char[] buffer = new char[20];
        int length = stdReader.read(buffer);
        System.out.println(buffer);
        System.out.println(length);
        */

        //读取文件并写入到另外一个文件
        FileInputStream input = new FileInputStream("res/input.txt");
        FileOutputStream output = new FileOutputStream("res/output.txt");

        InputStreamReader reader = new InputStreamReader(input, "UTF-8");
        OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");

        BufferedReader bufferedReader = new BufferedReader(reader);
        PrintWriter printer = new PrintWriter(writer);

        //一行行读取文件
        /*
        String context = "";
        for(String line = bufferedReader.readLine(); line != null;line = bufferedReader.readLine()){
            context = context + line;
            System.out.println(context);
        }
       */

        String context2 = "";
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            context2 += line;
            //System.out.println(context2);
        }

        reader.close();
        input.close();
        System.out.println(context2 + "88");
        printer.print(context2);
        printer.close();
        output.close();

    }
}
