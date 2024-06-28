class base1{
    int x;
base1(){
    System.out.println(" i m constructor");
}
    base1(int x){
        System.out.println(" i m constructor of value x " + x);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class child extends base1{
    child(){
//       super(3);
        System.out.println("i m child class constuctor");
    }
    child(int x,int y){
super(x);
        System.out.println("i m child class constuctor of value y "+ y);
    }
}
class grandchild extends child{
    grandchild(){
        System.out.println("i am constructor of grandchild");
    }
    grandchild(int x,int y,int z){
        super(x,y);
        System.out.println("i am constructor of grandchild of value z "+z);
    }
}



public class in_4_con {
    public static void main(String[] args) {
//        base1 b =new base1();
//        child c =new child();
//        grandchild gc = new grandchild(6,7,8);
grandchild gc = new grandchild();
    }
}
