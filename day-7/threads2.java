import java.util.*;

class shared{

}

public class threads2{
    public static void main(String[] args){

        shared s = new shared()
        thread B = new thread(() -> {
            System.out.println("B");
            try{
                Thread.sleep(2000);
            }
        }
    }
}