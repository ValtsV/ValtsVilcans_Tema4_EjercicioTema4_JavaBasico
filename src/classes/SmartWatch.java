package classes;

public class SmartWatch extends SmartDevice{
//    1.atributos

        boolean hasPulseSensor = true;

//    2. constructores

    public SmartWatch() {

    }

    public SmartWatch(String name, int screenSize, boolean hasColors, int brightness, boolean hasPulseSensor) {
        super(name, screenSize, hasColors, brightness);
        this.hasPulseSensor = hasPulseSensor;
    }

//    3. metodos
    public int measurePulse() {
        return (int) (Math.random()*100);
    }
}
