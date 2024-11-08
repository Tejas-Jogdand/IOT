const int sensorPin = A0;

void setup() {
  Serial.begin(9600);
  pinMode(sensorPin, INPUT);
}

void loop() {
  int vibration = analogRead(sensorPin);
  if (vibration > 500) {
    Serial.println("Vibration detected!");
  }
  delay(500);
}
