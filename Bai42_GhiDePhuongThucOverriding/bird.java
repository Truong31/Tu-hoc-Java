package OOP.Bai42_GhiDePhuongThucOverriding;

public class bird extends animal{
    public bird()
    {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("I eat Cao Cao=)))");
    }

    @Override
    public void sound() {
        System.out.println("Hu Hu");
    }
    
}
