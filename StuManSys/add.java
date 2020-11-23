package StuManSys;

import java.util.Scanner;

public class add extends Main {
    /*
    增加函数
    list上添加数据
     */
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the name");
        String n = sc.next();
        System.out.println("input the id");
        int i = sc.nextInt();
        list.add(new stu(n,i));
    }
}
