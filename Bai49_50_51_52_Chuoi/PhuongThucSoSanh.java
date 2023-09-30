package OOP.Bai49_50_51_52_Chuoi;

public class PhuongThucSoSanh {
    public static void main(String[] args) {
        String s1 = "Le Xuan Truong";
        String s2 = "Le Xuan Truong";
        String s3 = "le xuan truong";
        //Hàm equals
        System.out.println("So sanh s1 va  s2: " + s1.equals(s2));
        System.out.println("So sanh s1 voi s3: " + s1.equals(s3));
        System.out.println();

        //Hàm equalsIgnoreCase: so sanh giong nhau khong phan biet chu hoa, chu thuong
        System.out.println("So sanh s1 va s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("So sanh s1 va s3: " + s1.equalsIgnoreCase(s3));
        System.out.println();

        //compareTo: so sanh chuoi >, <, =; trả về 2 giá trị âm, dương, 0.
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van A";
        System.out.println("So sanh sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
        System.out.println();
        //compareToIgnoreCase: so sanh chuoi >, <, = (không phân biệt chữ hoa, chữ thường)
        String a = "Le Xuan Truong";
        String b = "le xuan truong";
        String c = "Le thu hien";
        System.out.println("a compareToIgnoreCase b: " + a.compareToIgnoreCase(b));
        System.out.println("a compareToIgnoreCase c: " + a.compareToIgnoreCase(c)); 
        System.out.println();

        //Hàm regionMatches ==> so sánh 1 đoạn
        String r1 = "LXT.vn";
        String r2 = "XT.v";
        boolean check = r1.regionMatches(1, r2, 0, 4);
        System.out.println(check);
        System.out.println();

        //Hàm startWith ==> Hàm kiểm tra chuỗi bắt đầu bằng
        String sdt = "037456789";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("012"));
        System.out.println();

        //Hàm endWith ==> hàm kiểm tra chuỗi kết thúc bằng
        String tenFile = "Le Xuan Truong.doc";
        String tenFile2 = "Le Thu Hien.jpg"; 
        if(tenFile.endsWith("doc"))
            System.out.println("file 1 la file van ban");
        else if(tenFile.endsWith("jpg"))
            System.out.println("File 1 la file anh");
        if(tenFile2.endsWith("doc"))
            System.out.println("file 2 la file van ban");
        else if(tenFile2.endsWith("jpg"))
            System.out.println("File 2 la file anh");
    }
}
