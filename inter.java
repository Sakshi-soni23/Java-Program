interface bicycle{
    void applybreak(int decrement);
    void speedup(int increment);
}
class avocycle implements bicycle{
    public void applybreak(int decrement){
        System.out.println("apply break");
  }
   public void speedup(int increment){
        System.out.println("speedup");
    }
}


public class inter {
    public static void main(String[] args) {

    }
}
