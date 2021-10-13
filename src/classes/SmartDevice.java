package classes;

public class SmartDevice {

//    1. atributos

    String name = "";
    int screenSize = 0;
    boolean hasColors = true;
    int brightness = 10;

//    2. constructores

        public SmartDevice(){

        }

    public SmartDevice(String name, int screenSize, boolean hasColors, int brightness) {
        this.name = name;
        this.screenSize = screenSize;
        this.hasColors = hasColors;
        this.brightness = brightness;
    }

    //    3, metodos

    public void changeBrightnessUp(int amount) {
            this.brightness = Math.min(this.brightness + amount, 100);
    }

    public void changeBrightnessDown(int amount) {
        this.brightness = Math.max(this.brightness - amount, 10);
    }
}
