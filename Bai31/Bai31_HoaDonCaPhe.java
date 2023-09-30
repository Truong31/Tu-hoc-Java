package OOP.Bai31;

public class Bai31_HoaDonCaPhe {
    private String coffeName;
    private double Price_1Kg;
    private double Mass;
    public Bai31_HoaDonCaPhe(String Name, double Price, double m)
    {
        this.coffeName = Name;
        this.Price_1Kg = Price;
        this.Mass = m;
    }
    public double ToTalMoney()
    {
        return this.Mass * this.Price_1Kg;
    }
    public boolean CheckTheMass(double m)
    {
        return this.Mass > m;
    }
    public boolean CheckTheBill()
    {
        return this.ToTalMoney() > 500000;
    }
    public double Discount(double x)
    {
        if(this.ToTalMoney()>500000)
        {
            return this.ToTalMoney()*(x/100);
        }
        else return  0;
    }
    public double PriceAfterDiscount(double x)
    {
        return this.ToTalMoney() - this.Discount(x);
    }
}

