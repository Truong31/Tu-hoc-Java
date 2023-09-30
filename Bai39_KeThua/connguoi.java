package OOP.Bai39_KeThua;

public class connguoi {
    private String hoVaTen;
    private int namSinh;
    public connguoi(String hoVaTen, int namSinh) {
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void an()
    {
        System.out.println("Uwu uwu");
    }
    public void uong()
    {
        System.out.println("Uc uc");
    }
    public void ngu()
    {
        System.out.println("Ngu");
    }
}
