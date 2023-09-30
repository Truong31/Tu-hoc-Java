package OOP.Bai38_QuanLyMayTinh;

public class Information {
    private String nameManufacturer;
    private Country country;
    public Information(String nameManufacturer, Country country) {
        this.nameManufacturer = nameManufacturer;
        this.country = country;
    }
    public String getNameManufacturer() {
        return nameManufacturer;
    }
    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public String Name() {
        return this.country.getName();
    }
    
}
