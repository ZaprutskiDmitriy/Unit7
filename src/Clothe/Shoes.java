package Clothe;

public class Shoes implements IShoes {
    public Shoes(){
    }

    @Override
    public void putOn() {
        System.out.println("Обувь надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Обувь снята");
    }
}
