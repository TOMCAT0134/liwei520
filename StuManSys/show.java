package StuManSys;

import java.util.Scanner;

public class show extends Main{
    /*
    展示函数
    1.展示全部，遍历整个链表，输出所有数据
    2.查询某个特定值，存在就输出
    3.返回
     */
    public void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("how to show");
        System.out.println("1.all");
        System.out.println("2.someone");
        System.out.println("0.return");
        switch (sc.next()){
            case "1":
                if(list.size()==0) System.out.println("no data");
                for (stu x:list){
                    System.out.println(x.getName()+" "+x.getId());
                }
                break;
            case "2":
                if (list.size()==0) System.out.println("no data!");
                System.out.println("input the name");
                String sn = sc.next();
                int n = -1;
                for(int i=0;i<list.size();i++){
                    if (list.get(i).getName().equals(sn))
                        n = i;
                }
                if(n!=-1){
                    System.out.println("the name is "+list.get(n).getName());
                    System.out.println("the id is "+list.get(n).getId());
                }
                else System.out.println("no data!");
                break;
            case "0":
                new menu().menu();
                break;
            default:
                System.out.println("Wrong choice!");
                show();
        }
    }
}
