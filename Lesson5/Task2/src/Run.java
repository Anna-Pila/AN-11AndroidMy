import hands.SamsungHand;
import hands.SonyHand;
import hands.ToshibaHand;
import heads.SamsungHead;
import heads.SonyHead;
import heads.ToshibaHead;
import legs.SamsungLeg;
import legs.SonyLeg;
import legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead(123);
        ToshibaHead toshibaHead = new ToshibaHead(589);
        SamsungHead samsungHead = new SamsungHead(741);

        SonyHand sonyHand = new SonyHand(456);
        ToshibaHand toshibaHand = new ToshibaHand(963);
        SamsungHand samsungHand = new SamsungHand(159);

        SonyLeg sonyLeg = new SonyLeg(789);
        ToshibaLeg toshibaLeg = new ToshibaLeg(951);
        SamsungLeg samsungLeg = new SamsungLeg(852);

        Robot robotOne = new Robot(sonyHead, toshibaHand, samsungLeg);
        Robot robotTwo = new Robot(toshibaHead, samsungHand, sonyLeg);
        Robot robotThree = new Robot(samsungHead, sonyHand, toshibaLeg);
        System.out.println("Прайс\nГолова:\nSony - " + sonyHead.getPrice() + "$\nToshiba - " + toshibaHead.getPrice() + "$\nSamsung - " + samsungHead.getPrice() + "$");
        System.out.println("__________________________");
        System.out.println("Рука:\nSony - " + sonyHand.getPrice() + "$\nToshiba - " + toshibaHand.getPrice() + "$\nSamsung - " + samsungHand.getPrice() + "$");
        System.out.println("__________________________");
        System.out.println("Нога:\nSony - " + sonyLeg.getPrice() + "$\nToshiba - " + toshibaLeg.getPrice() + "$\nSamsung - " + samsungLeg.getPrice() + "$");
        System.out.println("__________________________");
        System.out.println("Собираем роботов");
        System.out.println("__________________________");
        System.out.println("1-ый робот");
        robotOne.action();
        System.out.println("__________________________");
        System.out.println("2-ой робот");
        robotTwo.action();
        System.out.println("__________________________");
        System.out.println("3-ий робот");
        robotThree.action();
        System.out.println("__________________________");
        System.out.println("Цена 1-го робота: " + robotOne.getPrice() + "$;\nЦена 2-го робота: " + robotTwo.getPrice() + "$;\nЦена 3-го робота: " + robotThree.getPrice() + "$;");
        System.out.println("__________________________");
        System.out.println("Цена самого дорогого робота: " + Math.max(Math.max(robotOne.getPrice(), robotTwo.getPrice()), robotThree.getPrice()) + "$");

    }
}
