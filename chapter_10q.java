class cylinder{
    int radius;
    int height;
    public void setRadius(int n){
        radius =n;

    }
    public void setHeight(int j){
        height =j;

    }
    public int getRadius(){

        return radius;
    }
    public int getHeight(){
        return height;
    }
    public static class chapter_10q {
        public static void main(String[] args) {
            cylinder c = new cylinder();
            c.setHeight(2);
            c.setRadius(9);
            System.out.println(c.getHeight());
            System.out.println(c.getRadius());
        }
        }
    }

