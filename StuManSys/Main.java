package StuManSys;

import java.util.*;

public class Main {
    /*
    Main函数，定义了链表list，负责储存所有数据
    */
    public static List<stu> list = new LinkedList<>();
    public static void main(String[] args) {
        new menu().menu();
    }
}