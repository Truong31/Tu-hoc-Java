package OOP.Bai45_LuyenTap;

public class Test {
    public static void main(String[] args)
    {
        HangSanXuat h1 = new HangSanXuat("Hang 1", "Viet Nam");
        HangSanXuat h2 = new HangSanXuat("Hang 2", "Nhat Ban");
        HangSanXuat h3 = new HangSanXuat("Hang 3", "Uc");

        PhuongTienDiChuyen p1 = new MayBay( h1, "Xang");
        PhuongTienDiChuyen p2 = new XeOto(h2, "Xang Diesel");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        MayBay m1 = new MayBay(h3, "Xang may bay");

        System.out.println("Hang san xuat may bay: " + p1.layTenHangSanXuat());
        p2.batDau();

        System.out.println("Lay van toc May Bay: " + p1.layVanToc());
        System.out.println("Lay van toc o to: " + p2.layVanToc());
        System.out.println("Lay van toc xe may:" + p3.layVanToc());

        m1.catCanh();
        m1.haCanh();
    }
}
