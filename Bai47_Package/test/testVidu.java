package OOP.Bai47_Package.test;

import OOP.Bai47_Package.code.Vidu;

public class testVidu {
    public static void main(String[] args) {
        Vidu vd = new Vidu(5, 6);
        System.out.println(vd.getA());

        OOP.Bai47_Package.code_1.Vidu v1 = new OOP.Bai47_Package.code_1.Vidu(1, 2, 3);
        System.out.println(v1.getB());
    }
}
