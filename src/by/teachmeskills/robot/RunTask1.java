package by.teachmeskills.robot;


import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class RunTask1 {


    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SonyHand sonyHand = new SonyHand(25);
        SonyLeg sonyLeg = new SonyLeg(20);
        SonyHead sonyHead = new SonyHead(50);
        ToshibaHand toshibaHand = new ToshibaHand(10);
        ToshibaLeg toshibaLeg = new ToshibaLeg(30);
        ToshibaHead toshibaHead = new ToshibaHead(40);
        SamsungHand samsungHand = new SamsungHand(35);
        SamsungLeg samsungLeg = new SamsungLeg(30);
        SamsungHead samsungHead = new SamsungHead(60);

        Robot robot1 = new Robot(sonyHead, sonyHand, samsungLeg);
        Robot robot2 = new Robot(toshibaHead, samsungHand, toshibaLeg);
        Robot robot3 = new Robot(samsungHead, toshibaHand, sonyLeg);

        robot1.action();
        robot2.action();
        robot3.action();
        System.out.println(robot1.getPrice());
        System.out.println(robot2.getPrice());
        System.out.println(robot3.getPrice());

        if(robot1.getPrice() >= robot2.getPrice() && robot1.getPrice() >= robot3.getPrice()) {
            System.out.println("Самый дорогой robot1");
        }

        if(robot2.getPrice() >= robot1.getPrice() && robot2.getPrice() >= robot3.getPrice()) {
            System.out.println("Самый дорогой robot2");
        }

        if(robot3.getPrice() >= robot1.getPrice() && robot3.getPrice() >= robot2.getPrice()) {
            System.out.println("Самый дорогой robot3");
        }
    }
}
