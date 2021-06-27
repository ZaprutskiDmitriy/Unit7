package IStart;

public class Start implements IStart {
    public Start(){

    }

    @Override
    public boolean prelaunchСheck() {
        return true;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели запущены");
    }

    @Override
    public void start() {
        System.out.println("Старт");
    }
}
