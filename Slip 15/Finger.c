const int touchPin = 4;

void setup() {
  Serial.begin(9600);
  pinMode(touchPin, INPUT);
}

void loop() {
  if (digitalRead(touchPin) == HIGH) {
    Serial.println("Finger detected!");
  }
  delay(500);
}
