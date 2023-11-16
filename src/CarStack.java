import java.util.Iterator;
import java.util.Stack;

public class CarStack implements Iterable<Car>, Movable {
    private int maxCars;
    private int maxDoors;
    private Stack<Car> cars;

    public CarStack(int maxCars, int maxDoors){
        this.maxCars = maxCars;
        this.maxDoors = maxDoors;
    }

    public void addCar(Car car) {
        if((cars.size() < maxCars) && car.isLoadable && (car.getNrDoors() <= maxDoors)) {
            cars.push(car);
        }
    }

    public Car removeCar() {
        if (!cars.isEmpty()) return (Car) cars.pop(); //Säger att (Car) är redundant
        return null;
    }

    public Iterator<Car> iterator() {
        return cars.iterator();
    }

    @Override
    public void move() {
        for (Car car: cars) {
            car.move();
        }
    }

    @Override
    public void turnLeft() {
        for (Car car: cars) {
           car.turnLeft();
        }
    }

    @Override
    public void turnRight() {
        for(Car car: cars) {
            car.turnRight();
        }
    }
}
