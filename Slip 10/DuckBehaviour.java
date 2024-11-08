interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() { System.out.println("Flying with wings"); }
}

class Duck {
    FlyBehavior flyBehavior;

    Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void performFly() { flyBehavior.fly(); }
}
