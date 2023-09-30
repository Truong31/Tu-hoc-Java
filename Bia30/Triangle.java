package OOP.Bia30;

public class Triangle {
    private int edge_1;
    private int edge_2;
    private int edge_3;
    public Triangle(int e1, int e2, int e3)
    {
        this.edge_1 = e1;
        this.edge_2 = e2;
        this.edge_3 = e3;
    }
    public void PrintPreimeter()
    {
        if(((this.edge_1 + this.edge_2) > this.edge_3) && ((this.edge_1 + this.edge_3) > this.edge_2) && ((this.edge_2 + this.edge_3) > this.edge_1))
            System.out.println("Preimeter: "  + (this.edge_1 + this.edge_2 + this.edge_3));
        else System.out.println("Can't culculate the Preimeter");
    }
    public void PrintAcreage()
    {
        if(((this.edge_1 + this.edge_2) > this.edge_3) && ((this.edge_1 + this.edge_3) > this.edge_2) && ((this.edge_2 + this.edge_3) > this.edge_1))
        {
            double HalfOfPreimeter = (double)(this.edge_1 + this.edge_2 + this.edge_3)/2;
            double Acreage = Math.sqrt(HalfOfPreimeter*(HalfOfPreimeter-this.edge_1)*(HalfOfPreimeter-this.edge_2)*(HalfOfPreimeter-this.edge_3));
            System.out.println("Arceage: " + Acreage);
        }
        else System.out.println("Can't culculate the Acreage");
        
    }
    public void PrintKindOfTriangle()
    {
        if(((this.edge_1 + this.edge_2) > this.edge_3) && ((this.edge_1 + this.edge_3) > this.edge_2) && ((this.edge_2 + this.edge_3) > this.edge_1))
        {
            if((this.edge_1 == this.edge_2) && (this.edge_2 == this.edge_3))
                System.out.println("Equilateral triangle (Tam giac deu)");
            else if((this.edge_1 == this.edge_2) || (this.edge_2 == this.edge_3) || (this.edge_1 == this.edge_3))
            {
                System.out.println("Isosceles triangle (Tam giac can)");
                if((this.edge_1*this.edge_1 + this.edge_2*this.edge_2 == this.edge_3*this.edge_3) || (this.edge_1*this.edge_1 + this.edge_3*this.edge_3 == this.edge_2*this.edge_2) || (this.edge_3*this.edge_3 + this.edge_2*this.edge_2 == this.edge_1*this.edge_1))
                    System.out.println("Triangle right angle (tam giac vuong can)");
            }   
            else System.out.println("Triangle right (Tam giac vuong)");
        }
         else System.out.println("These numbers do not form a Triangle ");
    }
}

