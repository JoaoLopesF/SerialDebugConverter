#include "Arduino.h"

// Globals for this example

uint8_t mRunSeconds = 0;
uint8_t mRunMinutes = 0;
uint8_t mRunHours = 0;

boolean mBoolean = false;
char mChar = 'X';
byte mByte = 'Y';
int mInt = 1;
unsigned int mUInt = 2;
long mLong = 3;
unsigned long mULong = 4;
float mFloat = 5.0f;
double mDouble = 6.0;

String mString = "This is a string";
String mStringLarge = "This is a large stringggggggggggggggggggggggggggggggggggggggggggggg";

char mCharArray[] = "This is a char array";
char mCharArrayLarge[] = "This is a large char arrayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";

//The setup function is called once at startup of the sketch
void setup()
{

	Serial.begin(115200);

	Serial.println("**** Setup: initializing ...");
}

// The loop function is called in an endless loop
void loop()
{

	Serial.print("* Run time: ");
	Serial.print(mRunHours);
	Serial.print(':');
	Serial.print(mRunMinutes);
	Serial.print(':');
	Serial.println(mRunSeconds);

	// Count run time (just a test - for real suggest the TimeLib and NTP, if board have WiFi)

	mRunSeconds++;

	if (mRunSeconds == 60) {
		mRunMinutes++;
		mRunSeconds = 0;
	}
	if (mRunMinutes == 60) {
		mRunHours++;
		mRunMinutes = 0;
	}
	if (mRunHours == 24) {
		mRunHours = 0;
	}

	if (mRunSeconds % 5 == 0) { // Each 5 seconds

		Serial.println("* This is a message of debug");

	}

	// Wait a time

	delay(1000);
}
