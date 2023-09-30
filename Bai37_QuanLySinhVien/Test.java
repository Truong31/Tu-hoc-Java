package OOP.Bai37_QuanLySinhVien;

public class Test {
    public static void main(String[] args)
    {
        BirthDay b1 = new BirthDay(31, 07, 2004);
        BirthDay b2 = new BirthDay(11, 02, 1997);

        Classs c1 = new Classs("A2", "Information Technology");
        Classs c2 = new Classs("A1", "Singer");

        Alumnus a1 = new Alumnus("CT310704", "Le Xuan Truong", b1, 26.65, c1);
        Alumnus a2 = new Alumnus("S110297", "Park Cheayoung", b2, 26, c2);

        System.out.println("Le Xuan Truong is studying: " + a1.nameOfDepartment());
        System.out.println("Park Chaeyoung is studying: " + a2.nameOfDepartment());

        System.out.println("Did Truong pass: " + a1.result());
        System.out.println("Did Cheayoung pass: " + a2.result());

        System.out.println("Is Truong's Birthday the same as Cheayoung's BirthDay: " + a1.equals(a2));
    }
}
