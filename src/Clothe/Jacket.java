package Clothe;

public class Jacket implements IJacket{
    public Jacket(){

    }

    @Override
    public void putOn() {
        System.out.println("Куртка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка снята");
    }
}
