package OOP.Bai40_CacDangKeThua.Dang3_Hierarchical_ThuBac;

public class test {
    public static void main(String[] args)
    {
        dog d = new dog();
        d.eat();
        d.bark();
        System.out.println(d.getHome());

        cat c = new cat();
        c.eat();
        c.meow();
        System.out.println(c.getName());

        bird b = new bird();
        b.eat();
        b.Fly();
    }
}
