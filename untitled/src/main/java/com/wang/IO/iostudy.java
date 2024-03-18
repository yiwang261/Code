package com.wang.IO;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Scanner;

public class iostudy {

    @Test
    public void InputStreamTest(){
        byte []bytes = new byte[12];
        File file = new File("my.txt");
        int cnt = 0;
        try {
            InputStream inputStream = new FileInputStream(file);
            while(cnt!= -1){
             cnt = inputStream.read(bytes);
             if(cnt==-1) break;
             String s = new String(bytes,0,cnt);
                System.out.println(s);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public  void OutputStreamTest(){
            String s = "Hello World!";
        try {
            OutputStream outputStream = new FileOutputStream("my.txt");
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void WriteTest(){
        String s = new String("HelloWorld！！");
        Writer writer = null;
        try {
            writer = new FileWriter("my.txt",true);
            writer.write(s);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Test
    public  void  ReadTest(){
        Reader  reader = null;
        char [] chars = new char[8];
        try {
            reader = new FileReader("my.txt");
            int cnt = 0;
            while (cnt != -1){

                cnt =  reader.read(chars);


                for (int i = 0; i < cnt; i++) {
                    System.out.print(chars[i]);
                }
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void BuffedWriteTest(){
        String s = "Hello World!!!!!!111";
        Writer writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("my.txt",true));
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Test
    public void BuffedReadTest(){
        BufferedReader bufferedReader = null;
        String [][]ss = new String[10][1024];
        int i = 0;
        try {
             bufferedReader = new BufferedReader(new FileReader("my.txt"));
            String s = null;
             while ( (s = bufferedReader.readLine()) != null){
               ss[i] =  s.split(",");
               i++;
                 //System.out.println(s);
             }
            for (int j = 0; j < i; j++) {
                for(int k = 0; k < ss[j].length; k++)
                System.out.println(ss[j][k]);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
