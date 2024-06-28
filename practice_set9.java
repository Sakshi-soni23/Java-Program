//class surface{
//    int radius;
//    int height;
//    public  surface(){
//        radius =2;
//        height=3;
//    }
//    public void setRadius(int n){
//        radius=n;
//    }
//    public int getRadius(){
//        return radius;
//    }
//    public void setHeight(int h){
//        height=h;
//    }
//    public int getheight(){
//        return height;
//    }
//    public double surfacarea(){
//         return (2*3.14*radius*height)+(2*3.14*radius*radius);
//    }
//    public double volume(){
//        return  3.14*radius*radius*height;
//    }
//}
class rectangle{
    int length;
    int breadth;
    public rectangle(){
        length =4;
        breadth=5;
    }
    public rectangle(int length , int breadth){
        length = length;
        breadth=breadth;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class practice_set9 {
    public static void main(String[] args) {
//        surface sc = new surface();
////        sc.setRadius(2);
////        sc.setHeight(3);
//        System.out.println(sc.getheight());
//        System.out.println( sc.getRadius());
//        System.out.println(sc.volume());
//        System.out.println(sc.surfacarea());
        rectangle r = new rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
}
}
