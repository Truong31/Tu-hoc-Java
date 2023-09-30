package OOP.Bai37_QuanLySinhVien;

public class Alumnus {
    private String ID;
    private String Name;
    private BirthDay birth;
    private double avarageScore;
    private Classs c;
    public Alumnus(String iD, String name, BirthDay birth, double avarageScore, Classs c) {
        ID = iD;
        Name = name;
        this.birth = birth;
        this.avarageScore = avarageScore;
        this.c = c;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public BirthDay getBirth() {
        return birth;
    }
    public void setBirth(BirthDay birth) {
        this.birth = birth;
    }
    public double getAvarageScore() {
        return avarageScore;
    }
    public void setAvarageScore(double avarageScore) {
        this.avarageScore = avarageScore;
    }
    public Classs getC() {
        return c;
    }
    public void setC(Classs c) {
        this.c = c;
    }
    public String nameOfDepartment()
    {
        return c.getDepartment();
    }
    public boolean result()
    {
        return this.avarageScore>=5;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((birth == null) ? 0 : birth.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumnus other = (Alumnus) obj;
        if (birth == null) {
            if (other.birth != null)
                return false;
        } else if (!birth.equals(other.birth))
            return false;
        return true;
    }
    
    
}
