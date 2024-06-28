class circle2{
    public int r;

    public double getR() {
        return 3.14*r*r;
    }
    public void setR(int r) {
        this.r = r;
    }
}
class cylinder3 extends circle2{
    public int height;

    public double getvolume() {
        return 3.14*r*r*height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
public class inheritnce_4 {
    public static void main(String[] args) {
        cylinder3 cy = new cylinder3();
        cy.setHeight(1);
        cy.setR(2);
        System.out.println( "volume of cylinder  "  +  cy.getvolume());
        circle2 c = new circle2();
        c.setR(1);
        System.out.println( c.getR());

    }
}
