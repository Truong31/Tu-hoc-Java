package OOP.Bai39_KeThua;

public class Test {
    public static void main(String[] args)
    {
        connguoi c = new connguoi("Le Xuan Truong", 2004);
        c.an();
        c.uong();
        c.ngu();

        HocSinh hs = new HocSinh("Le Xuan Truong", 2004, "CT070356", "KMA");
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lamBaiTap();
    }
}
