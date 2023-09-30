package OOP.Bai34_Equals_Hashcode;

public class Test {
    public static void main(String[] args)
    {
        MyDate md1 =  new MyDate(31, 07, 2004);
        MyDate md2 = new MyDate(31, 07, 2004);
        MyDate md3 = new MyDate(15, 12, 2004);
        System.out.println(md1);

        if(md1 == md2)
        {
            System.out.println("md1 = md2");
        }
        else System.out.println("md1 != md2");
        
        System.out.println("Compare md1 and md2:  " +  md1.equals(md2));
        System.out.println("Compare md1 and md3:  " + md1.equals(md3));
    }
}
