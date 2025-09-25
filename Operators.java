public class Operators {

    public static void main(String[] args) {
        int a;
        a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));           // Logical NOT

        //type of logical operators
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

        // !true = false
        // !false = true
        
        // !true && false = false
        // !false || true = true
        // !true || false = false
        // !false && true = true
        // !(true && false) = true
        // !(false || true) = false
        // !(true || false) = false
        // !(false && true) = true
        // !(true && true) = false
        // !(false || false) = true
        // !(true || true) = false
        // !(false && false) = true
        //true ^ true = false
        //true ^ false = true
        //false ^ true = true
        //false ^ false = false

        // Bitwise Operators
        int p = 5;  // 0101 in binary
        int q = 3;  // 0011 in binary
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q: " + (p & q));   // Bitwise AND
        System.out.println("p | q: " + (p | q));   // Bitwise OR
        System.out.println("p ^ q: " + (p ^ q));   // Bitwise XOR
        System.out.println("~p: " + (~p));         // Bitwise NOT
        System.out.println("p << 1: " + (p << 1)); // Bitwise left shift
        System.out.println("p >> 1: " + (p >> 1)); // Bitwise right shift
        System.out.println("p >>> 1: " + (p >>> 1)); // Bitwise unsigned right shift

        // Assignment Operators
        int c = a; // Simple assignment
        System.out.println("\nAssignment Operators:");
        System.out.println("c = a: " + c);
        c += b;    // c = c + b
        System.out.println("c += b: " + c);
        c -= a;    // c = c - a
        System.out.println("c -= a: " + c);
        c *= 2;    // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 2;    // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 3;    // c = c % 3
        System.out.println("c %= 3: " + c); 
        c &= 1;    // c = c & 1
        System.out.println("c &= 1: " + c);
        c |= 2;    // c = c | 2
        System.out.println("c |= 2: " + c);
        c ^= 3;    // c = c ^ 3
        System.out.println("c ^= 3: " + c);
        c <<= 1;   // c = c << 1
        System.out.println("c <<= 1: " + c);
        c >>= 1;   // c = c >> 1
        System.out.println("c >>= 1: " + c);
        c >>>= 1;  // c = c >>> 1
        System.out.println("c >>>= 1: " + c);

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("d: " + d);
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("d after d++: " + d);
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("d after d--: " + d);

        // instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String str = "Hello, World!";
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("str instanceof Object: " + (str instanceof Object));
        // System.out.println("str instanceof Integer: " + (str instanceof Integer)); // Invalid: String can never be Integer
            
    }
    
}
