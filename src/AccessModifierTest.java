import java.rmi.AccessException;
/*
public class AccessModifierTest {
   *//* public int hour;        //public은 제한 없다.
    public int minute;
    public int second;

    public static void main(String[] args) {
        AccessModifierTest a1 = new AccessModifierTest();
        a1.hour = 25;*//*       //시간은 0~24까지이다. 기준을 만들어야 한다.


    private int hour;
    private int minute;
    private int second;

    public int getHour(){
        return hour;
    }
 public void setHour(int hour){
     if (hour < 0 || hour > 23) return;
     this.hour = hour;
 }

    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }



    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    public static void main(String[] args) {
        AccessModifierTest a1 = new AccessModifierTest();

        a1.setHour(4);
        System.out.println(a1.getHour());
    }
    *//*접근 제어자를 이용하여 멤버에 접근을 통제하고 메서드로써 간접으로 컨트롤 하는 것이 좋다.
    * 멤버변수는 값의 변경의 자유가 너무 넓다.
    * 그래서 메서드를 통해 규칙을 만들어 직접적인 자유 반경을 줄이면
    * 더 효과적으로 관리를 할 수 있다.*//*

    *//*위 코드는 한개의 클래스 이기에 멤버변수의 범위를 private로 선정했다.
    * 만약 위 코드를 상속을 하려면 private가아닌 protect가 좋을 것이다.
    * default는 상속이 불가능하지만, 서로 다른 클래스 인스턴스로는 사용가능하다.*//*
}*/

 public class AccessModifierTest {
   /* public int hour;        //public은 제한 없다.
    public int minute;
    public int second;

    public static void main(String[] args) {
        AccessModifierTest a1 = new AccessModifierTest();
        a1.hour = 25;*/       //시간은 0~24까지이다. 기준을 만들어야 한다.


    protected int hour;
    protected int minute;
    protected int second;

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }



    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if (second < 0 || second > 59) return;
        this.second = second;
    }
}

/*만약 프레임까지 나타내고 싶다면?
* 1. 멤버 변수의 접근 제어자를 변경해주어야 한다.
* 2. 상속으로 멤버를 더 추가해준다.*/

class son extends AccessModifierTest{           //상속 클래스 추가.
    protected int frame;
    public int getFrame(){
        return frame;
    }
    public void setFrame(int frame){
        if (frame < 0 || frame > 59)return;
        this.frame = frame;
    }
}

class Main{
    public static void main(String[] args) {
        son s1 = new son();
        s1.setHour(04);
        s1.setMinute(15);
        s1.setSecond(03);
        s1.setFrame(33);
        System.out.println(s1.getHour());
        System.out.println(s1.getMinute());
        System.out.println(s1.getSecond());
        System.out.println(s1.getFrame());

    }
}