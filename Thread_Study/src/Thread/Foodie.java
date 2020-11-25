package Thread;

import sun.security.krb5.internal.crypto.Des;

public class Foodie extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else {
                    if (Desk.flag){
                        //有
                        System.out.println("在吃了");
                        Desk.flag=false;
                        Desk.lock.notifyAll();
                        Desk.count--;
                    }else {
                        //没有
                        //使用什么对象当做锁，就用什么对象调用wait
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
