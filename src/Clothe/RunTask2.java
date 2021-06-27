package Clothe;

public class RunTask2 {
    public static void main(String[] args) {
        Jacket jacket = new Jacket();
        Trousers trousers = new Trousers();
        Shoes shoes = new Shoes();

        Person person1 = new Person("Mike", jacket, trousers, shoes);
        Person person2 = new Person("Tom", jacket, trousers, shoes);

        person1.putOnAll();
        person2.takeOffAll();

    }
}
