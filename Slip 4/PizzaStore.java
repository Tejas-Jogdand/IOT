abstract class Pizza {
    void prepare() { System.out.println("Preparing " + this.getClass().getSimpleName()); }
    void bake() { System.out.println("Baking " + this.getClass().getSimpleName()); }
    void cut() { System.out.println("Cutting " + this.getClass().getSimpleName()); }
    void box() { System.out.println("Boxing " + this.getClass().getSimpleName()); }
}

class NYStyleCheesePizza extends Pizza { }
class ChicagoStyleCheesePizza extends Pizza { }

abstract class PizzaStore {
    abstract Pizza createPizza(String type);
    
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        if (type.equals("cheese")) return new NYStyleCheesePizza();
        else return null;
    }
}
