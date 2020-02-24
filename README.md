# Java - Exam 1 

## Schreibe einen Primzahl-Checker (50 Punkte)

Schreib ein Programm, dass eine Zahl von der Konsole einliest und prüft ob es sich um eine Primzahl handelt oder nicht. 
Eine Primzahl ist eine Zahl, die nur durch sich selbst und 1 teilbar ist. 

Einige Beispiele:
11, 17, 37, 23, 89 sind Primzahlen. 
34, 66, 52 sind keine Primzahlen.

## Römische Zahlen (30 Punkte)

Schreibe ein Programm, dass eine positive Zahl zwischen 0 und 100 von der Konsole einliest und ihre Repräsentation im römischen Zahlensystem ausgibt. Im römischen Zahlensystem werden Zahlen als Summen dargestellt:

 I=1
 V=5
 X=10
 L=50
 C=100
 
 Einige Beispiele: 
 7 = VII
 8 = VIII
 9 = IX
 93 = XCIII

Einige Regeln für das Übersetzen 
* Zeichen dürfen maximal 3-mal nebeneinander verwendet werden (XXX = 30, III = 3)
* Steht eine kleinere Einheit vor einer größeren subtrathiert man diese (IV = 4 "eins vor fünf", XC = 90 "10 vor hundert")

## Programmauswertung (10 Punkte)

Wie sieht die Ausgabe dieses Programms aus? 

```java
int number = 12; 
System.out.println(number/5);
System.out.println(number/5.0);
number += 7; 
System.out.println(number);
```
2 <br>
2.4  (int -> double) <br>
19 <br>

## Datentypen (5 Punkte)

Welche Datentypen kennst du? 
Gibt es Unterschiede bei der Verwendung zwischen einem `int` und einem `Integer`? 

primitive und komplexe Datentypen (Objekte)

primitive: int, double, long, short, byte, boolean, char
komplexe: String, Integer, Double, Boolean...

int ist nur ein primitiver Datentyp und hat keine Methoden!
Integer ist eine Wrapperklasse (wird als einfaches Objekt behandelt) und besitzt somit einige Methoden <br>
z.B. Integer.toString(), .intValueOf usw.

## Scope (5 Punkte) 

Was ist der Scope einer Variable? 
Erkläre anhand eines kleinen Beispielprogramms.

Scope ist der Lebensraum in der eine Variable deklariert wird.
Die Variable existiert nur innerhalb der geschwungenen Klammern.
```java
for(int i = 0; i < 10; i++){
    System.out.println(i);
}
```
der Scope der Variable i ist in der for-Schleife


