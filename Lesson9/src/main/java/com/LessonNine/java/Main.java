package com.LessonNine.java;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int num = 0;
        Scanner scan = new Scanner(System.in) ; // 从键盘接收数据
        System.out.println("输入字符, 按下 'q' 键退出。");
        String str =  scan.next();  // 接收数据
        do{
            num ++;
            System.out.println("输入的数据为：" + str) ;
            new createFile(num,str);

        }while((str= scan.next())!=null && !((str= scan.next()).equals("q")));
    }


}
