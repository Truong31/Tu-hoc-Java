package OOP.Bai42_GhiDePhuongThucOverriding;

public class cat extends animal{ 
    public cat()
    {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("I eat fish");
    }

    @Override
    public void sound() {
        System.out.println("meow moew");
    }
    
}
