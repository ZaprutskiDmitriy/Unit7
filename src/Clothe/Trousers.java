package Clothe;

public class Trousers implements ITrousers{
    public Trousers(){
    }

    @Override
    public void putOn() {
        System.out.println("Штаны надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны сняты");
    }
}
