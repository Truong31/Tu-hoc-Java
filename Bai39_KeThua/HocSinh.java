package OOP.Bai39_KeThua;

public class HocSinh extends connguoi{
    private String tenLop, tenTruong;

    public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    public void lamBaiTap()
    {
        System.out.println("Lam Bai");
    }
}
