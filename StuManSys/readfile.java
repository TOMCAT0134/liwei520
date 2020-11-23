package StuManSys;

import java.io.*;

public class readfile {
    /*
    读文件函数
    文件存在的情况，用BufferReader读取
     */
    public void readfile() {
        File f = new File("/home/liwei/桌面/files/java/3.txt");
        if(!f.exists()) {
            System.out.println("file does not exist!");
            new menu().menu();
        }
        try(
                FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr)){
            while(true){
                String line = br.readLine();
                if(line == null) break;
                else System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
