
class animal {
String name;
public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
        System.out.println("there are many variety of animals");
    }
}
class dog extends animal{
    String voice;
    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
public class inheritance {
    public static void main(String[] args) {
        animal a = new animal();
       a.setName("dog");
       System.out.println(a.getName());
        dog d = new dog();
        d.setVoice("bark");
        System.out.println(d.getVoice());

    }
}
