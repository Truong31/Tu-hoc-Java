package OOP.Bai35_QuanLySach;

public class Test {
    public static void main(String[] args)
    {
        Date d1 = new Date(31, 07, 2004);
        Date d2 =  new Date(01, 01, 1975);

        Author a1 = new Author("Le Xuan Truong", d1);
        Author a2 = new Author("Eiichiro Oda", d2);

        Book b1 = new Book("Cay Cam Ngot Cua Toi", 89000, 1968, a1);
        Book b2  = new Book("One Piece", 18000, 1998, a2);

        b1.nameOfTheBook();
        b2.nameOfTheBook();
        System.out.println("Compare: " + b1.checkTheSameYear(b2));
        System.out.println("Cay Cam Ngot Cua Toi after discount: " + b1.priceAfterDiscount(10));
        System.out.println("One Piece after discount: " + b2.priceAfterDiscount(12));
    }
}
