This Example class demonstrates new feature introduced for switch expression in Java 14

Java 14 adds a new form of switch label “case L ->” which allows multiple constants per case and returns a value for the whole switch-case block so it can be used in expressions (switch expressions). And the yield keyword is used to return value from a switch expression.

For background information about the design of switch expressions, see [JEP 361](https://openjdk.java.net/jeps/361).
