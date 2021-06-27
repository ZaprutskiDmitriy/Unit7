package IStart;

import java.util.Random;

public class Shuttle implements IStart {
    public Shuttle(){

    }
    Random random = new Random();
    int c = random.nextInt(10);
    @Override
    public boolean prelaunchСheck() {
        if(c > 3){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
