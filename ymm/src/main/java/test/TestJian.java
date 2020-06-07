package test;

import netty.FileUploadEntity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestJian {
    private static String file_name="/media/sun/Deepin/小票销售数据_utf8.7z";
    private static volatile int start = 0;//数据读取的起始位置
    private static volatile int dataLength = 0;//需读取的数据长度
    private static final int dataGrameNum = 10;//数据段数
    private static int dataGrameLength = 0;//数据段数长度
    public static RandomAccessFile randomAccessFile;

    public static void main(String[] args) throws IOException {
        FileUploadEntity uploadFile = new FileUploadEntity();
        File file = new File(file_name);
        randomAccessFile = new RandomAccessFile(file,"r");
        dataGrameLength = (int) (randomAccessFile.length() / dataGrameNum);
        System.out.println("randomAccessFile.length()"+randomAccessFile.length());
        System.out.println("dataGrameLength"+dataGrameLength);
    }
}
