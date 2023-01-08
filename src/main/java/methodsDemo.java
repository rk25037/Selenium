import java.lang.reflect.Method;

public class methodsDemo {
    public static void main (String[] args){
        methodsDemo d = new methodsDemo();
        d.getData();
        String name = d.getData();
        System.out.println(name);

        methodDemo2 d1 = new methodDemo2();
        d1.getUserData();

        String nameStatic = getData1();
    }

    public String getData(){
        System.out.println("Hello World");
        return "Rohit Kumar";
    }

    public static String getData1(){
        System.out.println("abc");
        return "rk25037@gmail.com";
    }
}
