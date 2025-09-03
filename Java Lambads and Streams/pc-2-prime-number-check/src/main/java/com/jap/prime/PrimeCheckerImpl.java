package com.jap.prime;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {
        // Lambda expression to check prime number
        PrimeChecker primeChecker = (numb) -> {
            if (numb <= 1) return false;
            for (int i = 2; i <= Math.sqrt(numb); i++) {
                if (numb % i == 0) return false;
            }
            return true;
        };

        // Call the lambda and return the result
        return primeChecker.checkPrime(number);
    }
}

