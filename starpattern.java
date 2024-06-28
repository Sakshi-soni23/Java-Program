public class starpattern {
    public static void main(String[] args) {
        // 1 left side triangle
        int i ,j;
        /*
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(" & ");
            }
            System.out.println();
        }

         */
        // 2 left side opposite right triangle
        /*
        for(i=1;i<=6;i++){
            for(j=1;j<=7-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
         */
        // 3 right side triangle
        /*
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
          */
        //4 right side ulta triangle
        /*
        int n=6;
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.format("   ");
            }
            for(int k =1;k<=n-i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

         */
        for(i = 1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println( );
        }
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int k =1;k<=5-i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}




