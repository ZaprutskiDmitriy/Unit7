package IStart;

import java.util.Random;

public class SpaceX implements IStart {
    public SpaceX(){

    }
    Random random = new Random();
    int c = random.nextInt(20);
    @Override
    public boolean prelaunchСheck() {
        if(c > 10){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели SpaceX запущены.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
