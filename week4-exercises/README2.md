Reflection Questions
Question 1: What is the difference between checked and unchecked exceptions?
Answer:
Checked exceptions help prevent problems by making handling intentional and visible. While, Unchecked exception regularly points to programming errors like null pointers that need to be fixed, not just caught.
Question 2: When should you create a custom exception?
Answer:
We can create custom exceptions when: Representing domain-specific business logic errors. Moreover, adding additional data or context to error information. Meanwhile, distinguishing among different error types in layered applications.
Question 3: Why is exception translation useful in layered systems?
Answer:
As per my understanding, exception translation avoids implementation details from leaking across layer boundaries whereas preserving debugging information. It: Continues clean layer abstractions. Preserves original exception causes via chaining. Provides reliable error handling interfaces. Defends higher layers from low-level implementation details. Let’s each layer to handle exceptions at its proper level of abstraction
Question 4: How can the Observer pattern improve error reporting?
Answer:
The Observer pattern improves error reporting by: Letting several independent systems to react to errors. Enabling dynamic removal/addition of notification methods. Helping different response strategies for different types of error.
