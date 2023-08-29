package Basics.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(7);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}

// recursive call - if you calling a function again and again you can treat it
// as a separate call in the stack

// what is recurrence relation: A recurrence relation is an equation which
// represents a sequence based on some rule. It helps in finding the subsequent
// term (next term) dependent upon the preceding term (previous term). If we
// know the previous term in a given series, then we can easily determine the
// next term.

// what is base condition in recursion: The condition that is applied in any
// recursive function is known as a base condition. A base condition is a must
// in every recursive function otherwise it will continue to execute like an
// infinite loop.

// recursive call : A recursive call is one where procedure A calls itself or
// calls procedure B which then calls procedure A again. Each recursive call
// causes a new invocation of the procedure to be placed on the call stack.

//variable in recursion : num 1 . arguments , num2. return type ,num3. body of the function.