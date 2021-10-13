package classes;

public class SmartPhone extends SmartDevice{
//    1. atributos
        boolean hasCamera = true;
        boolean headphoneJack = true;

//    2. constructores

        public SmartPhone() {

        }

        public SmartPhone(String name, int screenSize, boolean hasColors, int brightness, boolean hasCamera, boolean headphoneJack) {
                super(name, screenSize, hasColors, brightness);
                this.hasCamera = hasCamera;
                this.headphoneJack = headphoneJack;
        }


//    3. metodos


}
