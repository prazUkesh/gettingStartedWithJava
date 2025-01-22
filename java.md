### Getting started with Java

repo link:-  https://github.com/prazUkesh/gettingStartedWithJava

a java skeleton

```c
public class main {
    public static void main(String[] args){
        System.out.println("hi this is Ukesh");
    }
}
```

## Java Variables

`type variableName = value;`

- string

```java
String name = "eshii";
```

- int

```java
int age = 20;

//can overwrite varialbles by doing
age = 20; //(age should be decleard before)

//make the int variable unchangeable
final int head = 1;
head = 0; // will generate an error
```

integer types

- byte (can store number from -128 to 127)
- short (can store number from -32768 to 32767)
- int (can store number from  -2147483648 to 2147483647)
- long (can store number from -9223372036854775808 to 9223372036854775807)
- float

```java
float pi = 3.14f;
double num = 12.1212d;
```

- double ()

```java
 Note that you should end the value with an "f" for floats and "d" for doublesf
```

- char

```java
char str = 'x';
```

- boolean

```java
boolean GFisReal = false;
```

example code for datatypes

```java
public class main {
    public static void main(String[] args){
        // real life example of data types
        int items = 4;
        float itemPrice = 5.57f;
        float totalCose = items * itemPrice;
        char currency = '$';

        System.out.println("total items: "+ items);
        System.out.println("item price per price: "+ itemPrice);
        System.out.println("your total cost: "+ currency + totalCose);

        System.out.println("---------------------\nthanks you for buying\ndo visit us again");
    }
}
```

### Java Type Casting

assigning a value of one primitive data to another type

- widening casting(small to larger type size)

`byte` → `short` → `char` → `int` → `long` → `float`  → `double` 

example 

```java
public class main{
	public static void main(String[] args){
	 int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

	}
}
```

- narrow casting (larger to smaller)

`double` → `float` → `long`  → `int` → `char` → `short` → `byte`

example

```java
public class main{
	public static void main(String[] args){
					double myDouble = 99.9d;
          int myInt = (int) myDouble;
    
          System.out.println(myInt);
          System.out.println(myDouble);

	}
}
```

### Java Operators

if you know C, you know this C-eet

- arithmetic operators
- logical operators
- comparison operator
- assignment operator

### Strings

collection of characters

1. String methods
- string length

```java
 String name = "ukesh";
           System.out.println("string length is: "+ name.length());
```

- changing the text case

```java
 String name = "ukesh";
          string newName =  System.out.println("string in capital is: "+ name.toUppercase());
```

- finding a character in a string

```java
String txt = "helo my name is esh";
System.out.println(txt.indexOf("esh"));
```

- concatenation

use the `+` or `concat()`

```java
String fName = "esh";
String lName = "uke";
System.out.println(fName.concat(lName));
```

### java math

```java
Math.max(6,9); // max value
Math.min(6,9); // minimum value
Math.sqrt(64); // square root
Math.abs(-6.9); // absolute value
Math.random(); int randomNum = (int)(Math.random() * 101);  // 0 to 100
```

### java loops

- for each loop

```java
for (variableType VariableName: arrayName){
System.out.println()
}

String[] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i: Cars){
System.out.println(i);
}
```

### Java Break & Continue

```java
for(int i=0;i<10;i++){
	if (i==6){
		break;
}
	System.out.println(i)
}
```

```java
for(int i=0;i<10;i++){
	if (i==6){
		continue;
}
	System.out.println(i)
}
```

### Java Arrays

declaring an array

```java
variableType[] arrayName = {value1, value2};
String[] langs = {"go","java","python","c","c++","c#"};
```

accessing an array

```java
System.out.prinln(arrayName[arrayIndex]);
System.out.prinln(langs[3]);
```

modifying an array element

```java
arrayName[arrayIndex] = newValue;
langs[5] = "c sharp";
```

array length

```java
System.out.println(arrayName.length);
System.out.println(langs.length)
```

multi-dimensional Array
```
int[3][3] tictactoeBoard;
int[8][8] chessBoard;

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```
accessing elements from multi-dimensional array
```
System.out.println(myNumbers[1][2]);
```