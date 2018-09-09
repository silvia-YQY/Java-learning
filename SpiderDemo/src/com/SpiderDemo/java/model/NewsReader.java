package com.SpiderDemo.java.model;

import java.io.File;

// 职责为：读取文件
// 但没有确定读取什么文件，故该类应该是一个抽象类。
public abstract class NewsReader {
    protected File file;

    public NewsReader(File file) {
        this.file = file;
    }

    public abstract News readNews();
}
