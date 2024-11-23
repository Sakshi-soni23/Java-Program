public class advance_rec {
    public static int countpaths(int i ,int j , int n , int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        int downpaths = countpaths(i+1,j,n,m);
        int rightpath = countpaths(i,j+1,n,m);
        return downpaths+rightpath;

    }
    public static void main(String[] args) {
        int n=3 ,m = 4;
int total = countpaths(0,0,n,m);
        System.out.println( " the total paths is:" +total);
    }
}