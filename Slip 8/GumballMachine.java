class GumballMachine {
    String state = "NoQuarter";

    void insertQuarter() {
        if (state.equals("NoQuarter")) {
            state = "HasQuarter";
            System.out.println("Quarter inserted");
        }
    }

    void turnCrank() {
        if (state.equals("HasQuarter")) {
            state = "Sold";
            System.out.println("Crank turned, gumball dispensed");
        }
    }
}
