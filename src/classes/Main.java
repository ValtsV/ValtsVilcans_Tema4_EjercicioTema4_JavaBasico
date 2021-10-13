package classes;

public class Main {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone("Iphone", 5, true, 50, true, false);
        SmartWatch watch = new SmartWatch("iWatch", 2, false, 30, true);

        System.out.println(phone.brightness);

        phone.changeBrightnessUp(70);

        System.out.println(phone.brightness);

        phone.changeBrightnessDown(60);

        System.out.println(phone.brightness);
        System.out.println(phone.hasCamera);
        System.out.println(phone.hasColors);
        System.out.println(phone.headphoneJack);
        System.out.println(phone.name);
        System.out.println(phone.screenSize);

        System.out.println(watch.measurePulse());
    }
}
