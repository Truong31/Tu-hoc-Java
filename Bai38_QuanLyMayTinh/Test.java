package OOP.Bai38_QuanLyMayTinh;

public class Test {
    public static void main (String[] args)
    {
        Data d1 = new Data(31, 07, 2004);
        Data d2 = new Data(11, 02, 1997);

        Country c1 = new Country("Viet Nam", "310704");
        Country c2 = new Country("Australia", "110297");

        Information i1 = new Information("LXT", c1);
        Information i2 = new Information("PCY", c2);

        Computer p1 = new Computer(i1, d1, 20000000, 2004);
        Computer p2 = new Computer(i2, d2, 25000000, 1997);

        System.out.println("Is LXT cheaper than PCY: " + p1.comparePrice(p2));
        System.out.println("Country's name of LXT: " + p1.nameCountry());
        System.out.println("Country's name of PCY: " + p2.nameCountry());
    }
}
