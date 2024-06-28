
//class Employee{//problem1
//     int salary;
//     String name;
//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public String setname(String n){
//        return name = n;
//     }
//}
//class cellophone{//problem 2
//    public void phone(){
//        System.out.println("your phone is ringing......");
//    }
//    public void vibrate(){
//        System.out.println("your vibrating mode is on................");
//    }
//}
//public class chapter_object {
//    public static void main(String[] args) {
////        Employee sakshi = new Employee();
////        sakshi.setname("sakshi");
////        System.out.println(sakshi.getName());
////        sakshi.salary =340000;
////        System.out.println(sakshi.getSalary());
//        cellophone ring = new cellophone(); //problem 2
//        ring.phone();
//        ring.vibrate();
//
//
//    }
//}
//problem3
class student{
    String name;
    int phoneno;


}
public class chapter_object {
    public static void main(String[] args) {
       student sc = new student();
       sc.name="john";
       sc.phoneno=234567886;
        System.out.println(sc.name);
        System.out.println(sc.phoneno);
        student two = new student();
        two.name="sam";
        two.phoneno= 345566735;
        System.out.println(two.phoneno);
        System.out.println(two.name);
    }
}
