package 연습;

public class exam7 {

	public static void main(String[] args) {
		Car car = new Car();
		car.printCar();
		car.turnOn();
		car.printCar();
		car.setGear('D');
		for(int i=1; i<=50; i++)
				car.accCar();
		car.printCar();
		car.turnOff();
		car.printCar();
	}

}
