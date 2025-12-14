# CS-320
CS 320 Portfolio Reflection – Software Testing and Automation
How can I ensure that my code, program, or software is functional and secure?

I ensure that my software is functional and secure by incorporating testing throughout the development process rather than treating it as a final step. In this course, I relied heavily on unit testing using JUnit to validate expected behavior, enforce constraints, and catch defects early. Writing tests for both valid and invalid inputs helped ensure that my services handled edge cases correctly and enforced data integrity. From a security perspective, validating inputs and enforcing strict requirements (such as ID length and non-null fields) reduces the risk of unexpected behavior or misuse. Automated testing also supports consistent verification as the code evolves, helping maintain reliability over time.

How do I interpret user needs and incorporate them into a program?

I interpret user needs by closely analyzing requirements and translating them into clear, testable behaviors within the code. For the ContactService project, I used the provided requirements to define object constraints, service operations, and expected outcomes, then wrote unit tests to verify that those needs were met. By treating requirements as test cases, I ensured that the software aligned directly with user expectations. This approach helps prevent scope creep and ensures that functionality is implemented exactly as intended, without assumptions.

How do I approach designing software?

I approach software design by focusing on clarity, modularity, and testability. I begin by identifying the core responsibilities of each class and ensuring that each component has a single, well-defined purpose. In this course, separating object models from service logic allowed me to write cleaner code and more effective tests. I also design with maintainability in mind, knowing that automated tests will need to evolve alongside the code. By combining thoughtful design with automated testing, I can confidently refactor or extend functionality while preserving correctness and quality.
