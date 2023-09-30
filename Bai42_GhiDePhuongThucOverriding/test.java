package OOP.Bai42_GhiDePhuongThucOverriding;

public class test {
    public static void main(String[] args)
    {
        System.out.println("Test dog");
        dog d = new dog();
        d.eat();
        d.sound();
        d.sleep();

        System.out.println("-------");
        System.out.println("Test cat");
        cat c = new cat();
        c.eat();
        c.sound();
        c.sleep();

        System.out.println("-------");
        System.out.println("Test bird");
        bird b = new bird();
        b.eat();
        b.sound();
        b.sleep();        
    }
}
