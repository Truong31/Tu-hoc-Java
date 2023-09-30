package OOP.Bai36_QuanLyBoPhim;

public class Movie {
    private String movieName;
    private int yearOfManufacturer;
    private double price;
    private Manufacturer co;
    private Date d;
    public Movie(String movieName, int yearOfManufacturer, double price, Manufacturer co, Date d) {
        this.movieName = movieName;
        this.yearOfManufacturer = yearOfManufacturer;
        this.price = price;
        this.co = co;
        this.d = d;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }
    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Manufacturer getCo() {
        return co;
    }
    public void setCo(Manufacturer co) {
        this.co = co;
    }
    public Date getD() {
        return d;
    }
    public void setD(Date d) {
        this.d = d;
    }
    public boolean compareBetween2Movie(Movie anotherMovie)
    {
        return this.price < anotherMovie.price;
    }
    public String nameOfManufacturer()
    {
        return this.co.getName();
    }
    public double priceAfterDiscount(double x)
    {
        return this.price - (x/100)*this.price;
    }
}
