class circle{
    private int radius;
    public void setradius(int n){
         radius = n;
    }
    public float getRadius(){
        return 3.14f*radius*radius;
    }

}
public class chapter_9getter {
    public static void main(String[] args) {
        circle c = new circle();
        c.setradius(0);
        System.out.println(c.getRadius());

    }
}
