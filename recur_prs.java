import javax.imageio.stream.ImageInputStream;

public class recur_prs {
//    public static void print(int n){
//  if(n==6){
//    return;
//}
// System.out.println(n);
//        print(n+1);
//    }

    public static void natural(int n , int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        natural(n-1, sum);
    }
        public static void main(String[] args){
natural(5,0);


    }
}