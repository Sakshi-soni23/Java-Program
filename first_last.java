import javax.sql.rowset.serial.SerialStruct;

public class first_last {
    public static void occurance(String s , char c , int count ,int i ,int first,int last){
        if(i>=s.length()-1){
            System.out.println("the first ocuurance is:" + first + " and the last ocurance is: " + last );
            return;
        }
        if(s.charAt(i) == c ){
            count++;
            if(count == 1){
                 first = i;
            }
            else{
                 last = i;
            }
        }
        occurance(s,c,count,i+1,first,last);

    }

    public static void main(String[] args) {
        String s = "bbcio";
        char c = 'a';
        int count =0;
        int i=0;
        int fisrt =-1;
        int last =-1;
        occurance(s,c,count,i,fisrt,last);


    }
}
