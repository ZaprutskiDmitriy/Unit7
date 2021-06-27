package IStart;

public class Cosmodrom{

    public Cosmodrom(){}
    IStart shuttle = new Shuttle();
    IStart spaceX = new SpaceX();

    public void launch (IStart shuttle) {
        if(!shuttle.prelaunchСheck()){
            System.out.println("Предстартовая проверка провалена");
        }
        else{
            shuttle.engineStart();
            System.out.println("Обратный отсчет: 10,9,8,7,6,5,4,3,2,1");
            shuttle.start();
        }
        System.out.println();
    }
}
