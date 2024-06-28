class a{
    public void ride(){
        System.out.println("i m rider");
    }
}
class b extends a{
    @Override
    public void ride(){
        System.out.println("hello ");
    }
    public void bike(){
        System.out.println("i m ridding a bike");
    }

}

public class method_overriding {
    public static void main(String[] args) {
        a ride =new a();
        ride.ride();
        b bike =new b();
        bike.ride();
        b h = new b();
        h.bike();


    }
}
