package OOP.Bai43_NapChongPhuongThuc_Overloading;

public class test {
    public static void main(String[] args)
    {
        MyMath m = new MyMath();
        System.out.println("Tim min (5, 6): " + m.timMin(5, 6));
        System.out.println("Tim min (5.5, 6): " + m.timMin(5.5, 6));

        System.out.println("Tinh tong (5, 6): " + m.tinhTong(5, 5.5));
        double arr[] = new double []{1, 2, 3, 4, 5};
        System.out.println("Tinh tong mang: " + m.tinhTong(arr));
    } 
}
