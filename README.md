<div align="center">
  <h1> Template Method  </h1>
</div>

# Code

Simple project representing the Template Method design pattern.

# Definition

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

![image](https://user-images.githubusercontent.com/40416044/149624505-066e86a7-620a-45e5-b2c2-06915bb85583.png)

This pattern has two main parts:

- The "template method" is implemented as a method in a base class (usually an abstract class). This method contains code for the parts of the overall algorithm that are invariant. The template ensures that the overarching algorithm is always followed. In the template method, portions of the algorithm that may vary are implemented by sending self messages that request the execution of additional helper methods. In the base class, these helper methods are given a default implementation, or none at all (that is, they may be abstract methods).
- Subclasses of the base class "fill in" the empty or "variant" parts of the "template" with specific algorithms that vary from one subclass to another. It is important that subclasses do not override the template method itself.

At run-time, the algorithm represented by the template method is executed by sending the template message to an instance of one of the concrete subclasses. Through inheritance, the template method in the base class starts to execute. When the template method sends a message to self requesting one of the helper methods, the message will be received by the concrete sub-instance. If the helper method has been overridden, the overriding implementation in the sub-instance will execute; if it has not been overridden, the inherited implementation in the base class will execute. This mechanism ensures that the overall algorithm follows the same steps every time, while allowing the details of some steps to depend on which instance received the original request to execute the algorithm.

This pattern is an example of inversion of control because the high-level code no longer determines what algorithms to run; a lower-level algorithm is instead selected at run-time.

Some of the self messages sent by the template method may be to hook methods. These methods are implemented in the same base class as the template method, but with empty bodies (i.e., they do nothing). Hook methods exist so that subclasses can override them, and can thus fine-tune the action of the algorithm without the need to override the template method itself. In other words, they provide a "hook" on which to "hang" variant implementations.





Source: <a href="https://pt.wikipedia.org/wiki/Flyweight"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/flyweight"> Refactoring Guru </a>
