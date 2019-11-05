package cn.com.zfh.Demo1;

public class Demo1 implements Interface1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1 instanceof Interface1);
        System.out.println(demo1 instanceof Interface2);
    }
}
