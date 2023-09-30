package OOP.Bai36_QuanLyBoPhim;

public class Test {
    public static void main(String[] args)
    {
        Date d1 = new Date(31, 07, 2004);
        Date d2 = new Date(11, 02, 1997);

        Manufacturer m1 = new Manufacturer("LapHo","Viet Nam");
        Manufacturer m2 = new Manufacturer("Rosie", "Korea");

        Movie M1 = new Movie("OnePiece", 2022, 89000, m1, d1);
        Movie M2 = new Movie("Violet Evergarden", 2021, 120000, m2, d2);

        System.out.println("One Piece is cheaper than Violet evergarden: " + M1.compareBetween2Movie(M2));
        System.out.println("Name of Onepiece's Manufacturer: " + M1.nameOfManufacturer());
        System.out.println("One piece after Discount 25%: " + M1.priceAfterDiscount(25));
        System.out.println("Violet Evergarden after Discount 30%: " + M2.priceAfterDiscount(30));
    }
}
