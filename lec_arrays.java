public class lec_arrays {
    public static void main(String[] args) {
        // one way to print index of array element
      // int [] marks = {3,4,5,6,6};
//        System.out.println(marks[1]);
        String [] student= {"sawan","sanjay","payal"};
        //second way
        for(int i=0;i<student.length;i++){
            System.out.println(student[i]);

        }
        //nasive way
        System.out.println(" ");
        for(int i=student.length-1;i>-1;i--){
            System.out.println(student[i]);
        }
        //for-each loop
        System.out.println("  ");
        for(String element:student){
            System.out.println(element);
        }
    }
}
