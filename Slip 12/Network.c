#include <WiFi.h>

void setup() {
  Serial.begin(9600);
  int networks = WiFi.scanNetworks();
  for (int i = 0; i < networks; i++) {
    Serial.print("Network found: ");
    Serial.println(WiFi.SSID(i));
  }
}

void loop() { }
