interface Car {
    void assemble();
}

class BasicCar implements Car {
    public void assemble() {
        System.out.print("Basic Car");
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}

abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    public void assemble() {
        this.car.assemble();
    }
}
