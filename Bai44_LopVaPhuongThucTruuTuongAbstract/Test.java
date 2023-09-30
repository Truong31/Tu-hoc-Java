package OOP.Bai44_LopVaPhuongThucTruuTuongAbstract;

public class Test {
    public static void main(String[] args)
    {
        ToaDo t1 = new ToaDo(3, 1);
        ToaDo t2 = new ToaDo(7, 4);
        ToaDo t3 = new ToaDo(11, 02);

        //Hinh h = new Hinh(td1) ==> loi bien dich
        Hinh h1 = new Diem(t1);

        Hinh h2 = new HinhTron(t2, 5);

        Hinh h3 = new HinhChuNhat(t3, 3, 4);

        System.out.println("Dien tich h1: " + h1.tinhDienTich());
        System.out.println("Dien tich h2: " + h2.tinhDienTich());
        System.out.println("Dien tich h3: " + h3.tinhDienTich());
    }
}
