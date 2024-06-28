class circle1{
    public int radius;
    circle1(int a){
        System.out.println("this is circle" + a);
        this.radius=a;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
    class cylinder5 extends circle1{
       public int hiegth;
        cylinder5(int r,int h){
            super(r);
            this.hiegth=h;
            System.out.println("uuu");
        }
        public double area(){
            return (2 * Math.PI * radius* hiegth) + (2 * Math.PI * radius * radius);
        }
    }

public class inheritance_practice {
    public static void main(String[] args) {
//       cylinder c = new cylinder(3,8);
//circle1 c = new circle1(3);
//circle1 c1 = new circle1(6);
        cylinder5 cy = new cylinder5(6,9);

    }
}
