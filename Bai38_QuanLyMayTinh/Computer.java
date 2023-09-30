package OOP.Bai38_QuanLyMayTinh;

public class Computer {
    private Information info;
    private Data date;
    private double price;
    private int timeGuarantee;
    public Computer(Information info, Data date, double price, int timeGuarantee) {
        this.info = info;
        this.date = date;
        this.price = price;
        this.timeGuarantee = timeGuarantee;
    }
    public Information getInfo() {
        return info;
    }
    public void setInfo(Information info) {
        this.info = info;
    }
    public Data getDate() {
        return date;
    }
    public void setDate(Data date) {
        this.date = date;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getTimeGuarantee() {
        return timeGuarantee;
    }
    public void setTimeGuarantee(int timeGuarantee) {
        this.timeGuarantee = timeGuarantee;
    }
    public boolean comparePrice(Computer c1)
    {
        return this.price < c1.price;
    }
    public String nameCountry()
    {
        return this.info.Name();
    }
}
