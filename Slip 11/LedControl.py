import RPi.GPIO as GPIO
import time

ledPin = 17
GPIO.setmode(GPIO.BCM)
GPIO.setup(ledPin, GPIO.OUT)

# Light an LED
GPIO.output(ledPin, GPIO.HIGH)
time.sleep(1)
GPIO.output(ledPin, GPIO.LOW)
GPIO.cleanup()
