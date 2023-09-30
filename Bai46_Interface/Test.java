package OOP.Bai46_Interface;

public class Test {
    public static void main(String[] args)
    {
        MayTinhCasioFX500 fx570Vn = new MayTinhCasioFX500();
        MayTinhVinacal500 vn500 = new MayTinhVinacal500();

        System.out.println("test cau a");
        System.out.println("5 + 3 = " + fx570Vn.cong(05, 03));
        System.out.println("4 x 5 = " + vn500.nhan(04, 05));
        System.out.println("4 : 0 = " + fx570Vn.chia(4, 0));

        System.out.println("test cau b");
        double[] arr1 = new double[] { 3, 2, 5, 10, 9};
        double[] arr2 = new double[] { 8, 1, 3, 11, 6};  
        SapXepChen s1 = new SapXepChen();
        s1.sapXepGiam(arr2);
        s1.sapXepTang(arr1);
        
        for(int i=0;i<arr1.length;i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        for(int i=0;i<arr2.length;i++)
            System.out.print(arr2[i] + " ");

        System.out.println();
        System.out.println("test cau c");
        PhanMemMayTinh m1 = new PhanMemMayTinh();
        System.out.println("3 + 5 = " + m1.cong(3, 05));
        double[] a = new double[] {5, 6, 1, 3, 7, 0};
        m1.sapXepGiam(a);
        for(int i=0; i<a.length;i++)
            System.out.print(a[i] + " ");

    }
}
