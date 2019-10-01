# Itmo-GitPractise
With this library you can deal with fractions, unite them in sets and create polinoms

# Installation
1. `git clone git://github.com/DeLonghi/Itmo-GitPractise`
2. `javac -d yourdir/ *.java`
3. import library in your project

# Example of usage
```java 
 //fractions 
 
 Fraction f1 = new Fraction(1, 50);
 Fraction f2 = new Fraction(300, 2);
 Fraction f3 = new Fraction(new File("C:\\JAVAAAA\\Itmo-GitPractise\\src\\Fraction Input"));

 (f1.compare(f3)) ? System.out.println("f1 > f2") : System.out.println("f1 < f2");
 
 
 //sets of fractios
 
 SetOfFraction sof = new SetOfFraction();
 sof.AddFraction(f1);
 sof.AddFraction(new Fraction(2, 1));
 sof.AddFraction(f3);
 
 //returns max fraction
 
 Fraction f = sof.getMax();
 ```
 # License
 [MIT](http://www.mit.edu/)
