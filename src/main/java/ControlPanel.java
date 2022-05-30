package main.java;

public class ControlPanel {

        private Altimeter altimeter = new Altimeter() ;
        private  AirGauge airGauge = new AirGauge();

        public void control(){
            System.out.println("Measure height");
            System.out.println("Measure air pressure");
        }

        public static void main(String[] args) {
            System.out.println(new ControlPanelTest());
        }
    }

    class ControlPanelTest {
        public static void main(String[] args) {
            new ControlPanel().control();
        }
    }
    class Altimeter{

        @Override
        public String toString() {
            return "Measure height";
        }
    }
    class AirGauge{

        @Override
        public String toString() {
            return "Measure air pressure";
        }
    }
