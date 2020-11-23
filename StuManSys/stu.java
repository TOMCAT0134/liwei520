package StuManSys;

public class stu{
    /*
    封装一个stu类，定义了name，id
     */
    String name;
    int id;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public stu(){}
    public stu(String name,int id){
        this.name = name;
        this.id = id;
    }
}