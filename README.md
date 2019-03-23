# SerialDebug Library for Arduino - source converter

<a href="#releases">![build badge](https://img.shields.io/badge/version-v0.1.0-blue.svg)</a> <a href="https://github.com/JoaoLopesF/SerialDebugConverter/blob/master/LICENSE.txt">![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)</a>
[![Gitter chat](https://badges.gitter.im/SerialDebug/gitter.png)](https://gitter.im/SerialDebug/Public)

__SerialDebug__ is a improved serial debugging to Arduino, with simple software debugger,
to see/change global variables, to add watch for these variables,
or call a function, in runtime, using serial monitor.

This Java program is a converter, to help to migrate your Arduino codes, from Serial.prints to SerialDebug library

## Contents

- [About](#about)
- [Github](#github)
- [Beta version](#beta-version)
- [How it looks](#how-it-looks-1)
- [Usage](#usage)
- [Releases](#releases)

## About

__SerialDebug__ is a library to Improved serial debugging and simple software debugger to Arduino.

[SerialDebug library](https://github.com/JoaoLopesF/SerialDebug)

This converter is to help migrate your codes to use __SerialDebug__ library

This program do:

- Put #include for __SerialDebug__ library
- Detects global variables and put in setup,
 __SerialDebug__ calls to add it into a their simple software debugger
- Detect the level of debugs, if you code has a lot of Serial.prints,
  the level is Verbose, else Debug. 
  A suggestion is after conversion,
  change the messages importants (not Verbose) to Debug, Info, Warning or Error.
- Save the source files in separate diretory, appending _Dbg in names
- Open the directory converted, into a system explorer,
  so You can open this in Arduino

## Beta version

This is a beta version. 
Not yet fully tested, optimized, and documented.

## Github

Contribute to this libray development by creating an account on GitHub.

Please give a star, if you find this library usefull, 
this help a another people, discover it too.

Please add a issue for problems or suggestion.

I suggest you use a Github Desktop New app to clone, 
it help to keep updated.


## How it looks

![Screenshot 1](https://github.com/JoaoLopesF/SerialDebugConverter/blob/master/Screenshots/screenshot1.png)
![Screenshot 2](https://github.com/JoaoLopesF/SerialDebugConverter/blob/master/Screenshots/screenshot2.png)
![Screenshot 3](https://github.com/JoaoLopesF/SerialDebugConverter/blob/master/Screenshots/screenshot3.png)
![Screenshot 4](https://github.com/JoaoLopesF/SerialDebugConverter/blob/master/Screenshots/screenshot4.png)
![Screenshot 5](https://github.com/JoaoLopesF/SerialDebugConverter/blob/master/Screenshots/screenshot5.png)
![Screenshot 6](https://github.com/JoaoLopesF/SerialDebugConverter/blob/master/Screenshots/screenshot6.png)

## Usage

This runs in MacOs, Linux and Windows (and other supported by Java).

You can use this converter in 3 modes:

- Java project

  If you is a Java developer:

  - Just download or clone this repository.

  - And open project a Java IDE, as Eclipse.

- Binary release (needs Java runtime)

  - You can download binary release of this converter

  Latest binary release: [Jar runnable - release v0.1.0](https://github.com/JoaoLopesF/SerialDebugConverter/releases/download/v0.1.0/SerialDebugConverter.jar.zip)

  - Uncompress the Zip file,
  - And run the jar file

- In SerialDebugApp (not needs Java runtime)

  - Just click in "__Conv.__" button.

## Releases

### 0.1.0 - 2018-10-17

    - First beta
