package StuManSys;

import java.io.*;

public class writefile extends Main{
    /*
    写入文件函数
    在指定的路径下，如果没有这个文件就创建；
    用PrintWriter写入文件
     */
    public void writefile() throws IOException {
        if (list.size()==0){
            System.out.println("no data to write!");
            System.out.println("return to menu");
            new menu().menu();
        }
        File f = new File("/home/liwei/桌面/files/java/2.txt");
        if(!f.exists()) f.createNewFile();
        try(FileWriter fw = new FileWriter(f); PrintWriter pw = new PrintWriter(fw)){
            for (int i=0;i<list.size();i++){
                pw.println(list.get(i).getName()+" "+list.get(i).getId());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
