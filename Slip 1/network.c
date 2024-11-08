#include <SPI.h>
#include <WiFi.h>

void setup() {
  Serial.begin(9600);
  Serial.println("Scanning for networks...");
  int networks = WiFi.scanNetworks();
  for (int i = 0; i < networks; i++) {
    Serial.print("Network name: ");
    Serial.println(WiFi.SSID(i));
  }
}

void loop() {
  // No need to use loop here
}