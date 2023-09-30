package OOP.Bai49_50_51_52_Chuoi;

import java.util.Scanner;

public class ThucHanh {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String s;
        System.out.println("Nhap vao chuoi: " );
        s = input.nextLine();
        System.out.println("------------");

        System.out.println(s.length());

        int doDai = s.length();
        for(int i=0;i<doDai;i++)
        {
            System.out.println("Vị trí " + i + " là: " + s.charAt(i));
        }
        char[] arr = new char[100];
        s.getChars(2, 4, arr, 0);
        for(int i=0; i<arr.length;i++)
        {
            System.out.println("Giá trị cua mang tai " + i + " là: " + arr[i]);
        }

        byte[] arrBytes = s.getBytes();
        for(byte b: arrBytes)
            System.out.println(b);
    }
}
