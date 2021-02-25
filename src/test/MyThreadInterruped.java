package test;

/**
 * @Author: wj
 * @Date: 2020/6/8 14:50
 */
public class MyThreadInterruped extends Thread {

    @Override
    public void run() {
        //System.out.println("MyThreadInterruped 线程对象执行。");
        while(true){

        }
    }

    public static void main(String[] args) {
        MyThreadInterruped thread = new MyThreadInterruped();
        thread.start();
        try{
            Thread.sleep(1000);
            System.out.println("睡眠结束");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("thread线程状态:"+thread.getState()+"是否停止0？="+thread.isInterrupted());
        thread.interrupt();

        //Thread.currentThread().interrupt();
        System.out.println("thread线程状态:"+thread.getState()+"是否停止1？="+thread.isInterrupted());
       //thread.interrupt();
        System.out.println("thread线程状态:"+thread.getState()+"是否停止2？="+thread.isInterrupted());
    }
}
