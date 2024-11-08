interface Command {
    void execute();
}

class LightOnCommand implements Command {
    public void execute() {
        System.out.println("Light is ON");
    }
}

class RemoteControlTest {
    public static void main(String[] args) {
        Command lightOn = new LightOnCommand();
        lightOn.execute();
    }
}