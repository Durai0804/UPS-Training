import java.util.*;

class animal{
    void sound(){
        System.out.println("All animals makes sound");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("A dog barks");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("A cate meows");
    }
}

public class runtime{
    public static void main(String[] args){
        cat c = new cat();
        dog d = new dog();
        c.sound();
        d.sound();
        animal a = new animal();
        a.sound();
    }
}