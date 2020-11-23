package StuManSys;

import java.io.IOException;
import java.util.*;

public class menu {
    /*
    菜单函数
    展示所有选项并跳转
     */
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("what do you want?");
        System.out.println("1.show");
        System.out.println("2.add");
        System.out.println("3.del");
        System.out.println("4.modi");
        System.out.println("5.readfile");
        System.out.println("6.writefile");
        System.out.println("0.exit");
        switch (sc.next()){
            case "1":
                new show().show();
                menu();
                break;
            case "2":
                new add().add();
                menu();
                break;
            case "3":
                new del().del();
                menu();
            break;
            case "4":
                new modi().modi();
                menu();
                break;
            case "5":
                new readfile().readfile();
                menu();
                break;
            case "6":
                try {
                    new writefile().writefile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                menu();
                break;
            case "0":       //确认是否退出
                System.out.println("y/n?");
                String s = sc.next();
                if(s.equals("y")||s.equals("Y")) {
                    System.out.println("bye!");
                    System.exit(0);
                }
                else if (s.equals("N")||s.equals("n")) menu();
                else System.out.println("input y/n");
                break;
            default:
                System.out.println("Wrong choice!");
                menu();
        }
    }
}
