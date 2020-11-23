package StuManSys;

import java.util.Scanner;

public class del extends Main{
    /*
    删除函数
    1.删除全部，遍历整个链表，删除所有数据
    2.删除某个特定值，存在就删除
    3.返回
     */
    public void del(){
        Scanner sc = new Scanner(System.in);
        System.out.println("what do you want to delete");
        System.out.println("1.all");
        System.out.println("2.someone");
        System.out.println("0.return");
        switch (sc.next()){
            case "1":       //删除全部数据
                System.out.println("are you sure?");        //确认是否删除全部数据
                System.out.println("y/n");
                String se = sc.next();
                if (se.equals("y")||se.equals("Y")){
                    for (int i=0;i<list.size();i++){
                        list.remove(i);
                    }
                }
                else if (se.equals("N")||se.equals("n"))del();
                else {
                    System.out.println("wrong choice");
                    del();
                }
                break;
            case "2":           //删除某一个数据
                int n = -1;
                System.out.println("input the name");
                String s = sc.next();
                for (int i=0;i<list.size();i++){
                    if (list.get(i).getName().equals(s))
                        n = i;
                }
                if (n!=-1)
                    list.remove(n);
                else System.out.println("no data!");
                break;
            case "0":       //返回菜单
                new menu().menu();
            default:
                System.out.println("wrong choice!");
                del();
        }
    }
}
