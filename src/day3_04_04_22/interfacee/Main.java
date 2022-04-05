package day3_04_04_22.interfacee;

public class Main implements SmartTvremote{

    public void fun()
    {
        System.out.println("Hello Dhruv");
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.fun();
    }
}
