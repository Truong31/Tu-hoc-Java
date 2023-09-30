package OOP.Bai42_GhiDePhuongThucOverriding;

public class dog  extends animal{
    public dog()
    {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("I eat bone");
    }

    @Override
    public void sound() {
        System.out.println("go go");
    }
    
    
}
