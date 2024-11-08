interface Command { void execute(); void undo(); }

class CeilingFan {
    void on() { System.out.println("Ceiling fan is ON"); }
    void off() { System.out.println("Ceiling fan is OFF"); }
}

class FanOnCommand implements Command {
    CeilingFan fan;
    FanOnCommand(CeilingFan fan) { this.fan = fan; }

    public void execute() { fan.on(); }
    public void undo() { fan.off(); }
}
