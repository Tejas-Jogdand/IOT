import java.util.Observable;

@SuppressWarnings("deprecation")
class WeatherStation extends Observable {
    private float temperature, humidity, pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() { return temperature; }
    public float getHumidity() { return humidity; }
    public float getPressure() { return pressure; }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
}
