import com.Workintech.Cars.Car;
import com.Workintech.Cars.Ford;
import com.Workintech.Cars.Holden;
import com.Workintech.Cars.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        /*
         * OUTPUT
         * Car
         * the car's engine is starting
         * Car
         * the car is accelerating
         * Car
         * the car is braking
         * Mitsubishi
         * Mitsubishi Outlander VRX 4WDis starting
         * Mitsubishi
         * Mitsubishi Outlander VRX 4WDis accelerating
         * Mitsubishi
         * Mitsubishi Outlander VRX 4WD is braking
         * Ford
         * Ford Ford Falconis starting
         * Ford
         * Ford Ford Falconis accelerating
         * Ford
         * Ford Ford Falcon is braking
         * Holden
         * Holden Holden Commodoreis starting
         * Holden
         * Holden Holden Commodoreis accelerating
         * Holden
         * Holden Holden Commodore is braking
         */
    }
}