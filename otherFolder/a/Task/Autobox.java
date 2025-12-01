package otherFolder.a.Task;

public class Autobox {
    static Integer integerAutobox(Integer a){
        Integer auint = a;
        return auint;
    }
     static Integer integerAutobox(int a){
        Integer auint = a;
        return auint;
    }
    public static void main(String[] args) {
        int x =3;
        Integer y = 1;
        Integer p = y;
        int o = p;
        integerAutobox(y);
        integerAutobox(x);
    }
}
