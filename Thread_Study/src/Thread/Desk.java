package Thread;

public class Desk {
    //定义一个标记
    //true 表示桌子上有汉堡包，允许吃货执行； false 表示桌上没有汉堡包，允许厨师执行
    public static boolean flag = false;
    //汉堡包总数量
    public static int count = 10;
    //锁对象
    public static final Object lock = new Object();
}
