class Volt {
    private int volts;
    public Volt(int v) { this.volts = v; }
    public int getVolts() { return volts; }
}

interface SocketAdapter {
    Volt get3Volt();
    Volt get12Volt();
    Volt get120Volt();
}

class SocketAdapterImpl implements SocketAdapter {
    public Volt get3Volt() { return new Volt(3); }
    public Volt get12Volt() { return new Volt(12); }
    public Volt get120Volt() { return new Volt(120); }
}
