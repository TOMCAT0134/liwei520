package StuManSys;

import java.util.Scanner;

public class modi extends Main{
    /*
    modify修改函数
    继承Main函数中list，搜索整个list，返回想修改的序列，不是-1就修改
     */
    public void modi(){
        Scanner sc = new Scanner(System.in);
        if (list.size()==0) {
            System.out.println("no data!");
            System.out.println("return to menu");
            new menu().menu();
        }
        System.out.println("which one do you want to modify?\ninput the name");
        String s = sc.next();
        int n = -1;
        for (int i=0;i<list.size();i++){
            if (list.get(i).getName().equals(s))
                n = i;
        }
        if(n!=-1){
            System.out.println("modify the data");
            System.out.println("input the new name");
            list.get(n).name = sc.next();
            System.out.println("input the new id");
            list.get(n).id = sc.nextInt();
        }
        else System.out.println("no data!");
    }
}
