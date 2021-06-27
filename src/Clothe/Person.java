package Clothe;

public class Person {

    private String name;
    private Jacket jacket;
    private Trousers trousers;
    private Shoes shoes;

    public Person(String name, Jacket jacket, Trousers trousers, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public void putOnAll(){
        System.out.println(name);
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();
        System.out.println();
    }

    public void takeOffAll(){
        System.out.println(name);
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();
        System.out.println();
    }

}
