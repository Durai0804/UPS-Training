import java.util.*;


class A extends Thread{
    @Override
    public void run(){
        for(int i = 0 ;i<5 ;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("A");
        }
        
    }
}

class B extends Thread{
    @Override 
    public void run(){
        for(int i = 0 ; i<5 ; i++){
            
        
    try{
        Thread.sleep(200);
        System.out.println("B");
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
}
class threads{
    public static void main(String[] args){
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}