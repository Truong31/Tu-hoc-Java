package OOP.Bai49_50_51_52_Chuoi;

public class PhuongThucTimKiem {
    public static void main(String[] args) {
        String s1 = "Xin chao cac ban, Xin chao";
        String s2 = "Xin chao";
        String s3 = "Xin chao LXT";
        char c1 = 'i';

        System.out.println("Vị trí của s2 trong a1: " + s1.indexOf(s2));
        System.out.println("Vị trí của s3 trong s1: " + s1.indexOf(s3));

        System.out.println("Vị trí của s2 trong s1: " + s1.indexOf(s2, 2));
        System.out.println("Vị trí của c1 trong s1: " + s1.indexOf(c1));
        System.out.println("Vị trí của c1 trong s1: " + s1.indexOf(c1, 21));

        System.out.println("Vị trí của c1 trong s1: " + s1.lastIndexOf(c1));
        System.out.println();

    }
}
