# Combination Calculator

## Overview

This Java program calculates the combination C(n, r), which represents the number of ways to choose `r` elements from a set of `n` elements without considering the order. The user is prompted to input the values for `n` and `r`, and the program calculates the combination using factorials.

## How It Works

- The user is prompted to enter the values for `n` and `r`.
- The program calculates the factorial of `n` (`n!`) and the factorial of `r` (`r!`), then uses these values to calculate the combination using the formula:
  
  
  C(n, r) = n! / (r! * (n - r)!)

- The result is then displayed to the user.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter the values for `n` and `r` when prompted, and the program will display the result of the combination.

## Example Output

```
C(n,r) için n yi giriniz
5
C(n,r) için r yi giriniz
3
Kombinsyon sonucu: 10
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software. See the [LICENSE](LICENSE) file for more details.



