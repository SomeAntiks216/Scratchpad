// all Java files are run in a public class with the name of the file
public class javaScratch {

    static void variables() {
        
        /* 
        All primitive variables are as follows:
            The following are integer types:
                byte: stores whole numbers from -128 to 127
                short: stores whole numbers from -32,768 to 32,768
                int: stores whole numbers from -2,147,483,648 to 2,147,483,647
                long: stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            The following are floating point types:
                float: stores fractional numbers; sufficient for 6 to 7 decimal digits
                double: stores fractional numbers; sufficient for 15 to 16 decimal digits
                    Since Java automatically defines decimal numbers as doubles, you can differentiate doubles and floats with an "f" or "d"
                        i.e.
                            double myDouble = 9.65d;
                            float myFloat 7.77f;
            boolean: stores true or false values
            char: stores a single character, letter, or ASCII value
                Character values must be surrounded by *single quotes*
        String is not a primitive variable and is instead a predefined class (hence the capitalization)
        Non-primitive data types:
            Also called reference types, these are created by the programmer (with the exception of String)
            Reference types can be used to call methods to perform certain operations
            Primitive types start with a lowercase letter, while reference types tend to start with an uppercase letter
            Primitive types can either be empty or hold a value, while reference types can also be "null"
            Common examples of non-primitive data types are Strings, Arrays, and Classes
        Final variables (e.g. "final String [...]") are constants
        Variable types cannot be changed (i.e. " String greeting = "Hello"; / greeting = "13"; ")
        The var keyword 
            var is used to allow the system to automatically detect and assign the variable type
                Examples:
                5 : int
                4.87 : double   the appending "d" is optional, since this is the default decimal variable type
                7.62f : float
                'd' : char
                true : boolean
                "Hello" : String
            A variable using var cannot be left empty
                i.e. "var myVar;" throws an error
            var cannot reassign its variable type
                i.e. a variable (int) with value 10 cannot be changed to 9.99 (double), regardless of its initialization
            var can simplify the initialization of complex data types, such as Arrays:
                ArrayList<String> cars = new ArrayList<String>();
                var cars = new ArrayList<String>()
        Variable type casting
            Widening casting: smaller types can be automatically/implicitly cast into larger types
                byte -> short -> char -> int -> long -> float -> double
                i.e. 
                    int myInt = 5;
                    double myDouble = myInt; (reads 5.0)
            Narrowing casting: larger types can be manually/explicitly cast into smaller types
                i.e.
                    double myDouble = 7.66d;
                    int myInt = (int) myDouble; (reads 7)
                Narrowing casting from a double or float to an int (or similar) effectively rounds the value down
            You can also manually cast variables as you use them
                i.e.
                    System.out.println("I am about " + (int) height + " feet tall.");
        */

        final String name = "Agamemnon"; 
        final char initial = 'A';
        int age = 27; // age in years
        double height = 5.5d; // height in feet
        boolean queer = true;

        float agePrecise = age; // create variable with increased precision (reads 27.0)
        int heightRounded = (int) height; // create variable with decreased precision (reads 5)

        System.out.println("My name is " + name + ",");
        System.out.println("which makes my initial " + initial + ".");
        System.out.println("I am exactly " + agePrecise + " years old,");
        System.out.println("about " + heightRounded + " feet tall,");
        System.out.println("and it is " + queer + " that I am queer.");
        System.out.println("Nice to meet you!\n");

    }

    static void operators() {

        /*
        Operators
            Arithmetic operators
                + : addition : add two values together (e.g. x + y)
                - : subtraction : subtracts one value from another (e.g. x - y)
                * : bultiplication : multiply one value with another (e.g. x * y)
                / : division : divide one value by another (e.g. x / y)
                    division of two integers yields an integer, while division using at least one float or double yields a decimal answer
                % : modulus : returns the division remainder (e.g. x % y)
            Bitwise operators
                ~ : bitwise NOT : breaks values into bits and inverts each bit, returning the resulting bit string composed into base-10
                & : bitwise AND : breaks values into bits and compares each bit-place, returning a 1 in that place if both bits are 1, and otherwise a 0; returns the resulting bit string composed into base-10
                | : bitwise OR : breaks values into bits and compares each bit-place, returning a 1 in that place if either bit is 1, and otherwise a 0; returns the resulting bit string composed into base-10
                ^ : bitwise XOR : breaks values into bits and compares each bit-place, returning a 1 in that place if either bit is a 1, but not both, and otherwise a 0; returns the resulting bit string composed into base-10
                >> : bitwise right-shift : breaks the first value into bits and shifts all bits to the right a number of spaces equal to the second value
                << : bitwise left-shift : breaks the first value into bits and shifts all bits to the left a number of spaces equal to the second value
            Assignment operators
                = : assignment : sets a variable to the following value
                += : addition assignment : adds a value to a variable
                -= : subtraction assignment : subtracts a value from a variable
                *= : multiplication assignment : multiplies a variable by a value
                /= : division assignment : divides a variable by a value
                %= : modulus assignment : sets a variable to the remainder of the variable divided by the value
                ++ : increment : increases the value of a variable by 1 (e.g. ++x)
                -- : decrement : decreases the value of a variable by 1 (e.g. --x)
                &= : bitwise AND assignment : compares individual bits of the variable and the value and sets the variable to a string of bits composed into base-10 based on corresponding bits' AND relationships
                |= : bitwise OR assignment : compares individual bits of the variable and the value and sets the variable to a string of bits composed into base-10 based on corresponding bits' OR relationships
                ^= : bitwise XOR assignment : compares individual bits of the variable and the value and sets the variable to a string of bits composed into base-10 based on corresponding bits' XOR relationships
                >>= : bitwise right-shift assignment : breaks a variable into bits and shifts them a number of spaces to the right equal to the value, then composes the result into base-10
                <<= : bitwise left-shift assignment : breaks a variable into bits and shifts them a number of spaces to the left equal to the value, then composes the result into base-10
            Comparison operators
                == : equal to
                != : not equal to
                > : greater than
                < : less than
                >= : greater than or equal to
                <= : less than or equal to
            Logical operators
                && : logical AND : returns true if both statements are true
                || : logical OR : returns true if either statement is true
                ! : logical NOT : returns true if the statement is false (and vice-versa)
            Precedence and order of operations (simplified)
                parentheses ("()")
                increment, not ("++", "--", "!", "~")
                multiplication, division, modulus ("*", "/", "%")
                additive ("+" , "-")
                bitwise shifts (">>", "<<")
                relational (">", "<", ">=", "<=")
                equality ("==", "!=")
                bitwise AND ("&")
                bitwise XOR ("^")
                bitwise OR ("|")
                logical AND ("&&")
                logical OR ("||")
                assignment ("=")
            Precedence and order of operations (expanded) (credit Princeton University)
                [level] [operator]                      [associativity]
                16      ()      parentheses             left-to-right
                        []      array access   
                        new     object creation
                        .       member access
                        ::      method reference
                15      ++      unary post-increment    left-to-right
                        --      unary post-decrement
                14      +       unary plus              right-to-left
                        -       unary minus
                        !       unary logical NOT
                        ~       unary bitwise NOT
                        ++      unary pre-increment
                        --      unary post-increment
                13      ()      cast                    right-to-left
                12      * / %   multiplicative          left-to-right
                11      + -     additive                left-to-right
                        +       concatenation
                10      >> <<   bitwise shift           left-to-right
                        >>>
                9       < >     relational              left-to-right
                        <= >=
                        instanceOf
                8       == !=   equality                left-to-right
                7       &       bitwise AND             left-to-right
                6       ^       bitwise XOR             left-to-right
                5       |       bitwise OR              left-to-right
                4       &&      logical AND             left-to-right
                3       ||      logical OR              left-to-right
                2       ?:      ternary                 left-to-right
                1       =       assignment              right-to-left
                        += -=
                        *= /=
                        %=
                        &= ^= |=
                        <<= >>=
                        >>>=
                0       ->      lambda expression       right-to-left
                        ->      switch expression

        */

        int x = 7;
        int y = 18;
        int z = 2;

        // the following variables are represented by doubles, but many work out to be integers
        // it is important to note that any of these operators can result in non-integer values, depending on the original values
        double a = x + y;
        double b = z - y;
        double c = x * z;
        double d = z / x;
        double e = y % x;

        System.out.println("x is " + (x));
        System.out.println("y is " + (y));
        System.out.println("z is " + (z) + "\n");

        System.out.println("x + y = " + a);
        System.out.println("z - y = " + b);
        System.out.println("x * z = " + c);
        System.out.println("z / x = " + d);
        System.out.println("y mod x = " + e);

        // variables incremented or decremented, even as part of another variable's declaration, affect the value of the reference variable itself
        int f = ++z; // z and f are now 3
        int g = --y; // y and g are now 17

        System.out.println("z incremented = " + z + " (" + f + ")"); // 3 (3)
        System.out.println("y decremented = " + y + " (" + g + ")\n"); // 17 (17)

        // set z and y variables back to original value
        --z;
        ++y;

        // arithmetic operators can also be used directly within a function
        System.out.println("7 - 4 = " + (7 - 4) + "\n");

        // assignment operators can be used on two variables
        x += 5;
        System.out.println("x increased by 5 is " + x + "\n");

        // comparison oeprators/statements output "true" or "false"
        System.out.println("It is " + (z > y) + " that z is greater than y.");
        System.out.println("It is " + (x < z) + " that z is less than z.\n");

        boolean A = true;
        boolean B = false;
        boolean C = false;

        System.out.println("Boolean A is \"" + A + "\"");
        System.out.println("Boolean B is \"" + B + "\"");
        System.out.println("Boolean C is \"" + C + "\"\n");

        // logical operators compare two booleans, outputting a corresponding boolean
        System.out.println("Boolean A and boolean B are both true: " + (A && B));
        System.out.println("At least one of boolean B and boolean C are true: " + (A || C));
        System.out.println("Boolean C is false: " + (!C) + "\n");

    }

    static void strings() {

        /*
        Strings
            A String variable contains a collection of characters surrounded by double quotes ("")
            String methods
                .length()
                .toUpperCase()
                .toLowerCase()
                .indexOf()
                .charAt()
                .equals()
                .trim()
            Concatenation
                the "+" operator can be used between strings to join them
                alternatively, .concat() does the same thing
            Numbers and Strings
                because Java uses the "+" operator for both numbers and Strings, you must be careful and consider the variable type that you are dealing with 
                numbers added to Strings act like Strings
            Special characters
                \' -> '
                \" -> "
                \\ -> \
                other common sequences:
                    \n : new line
                    \t : tab
                    \b : backspace
                    \r : carriage return
                    \f : form feed (page break)
        */

        // .length() returns the length of a String in characters
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The alphabet has " + txt.length() + " letters.\n");

        // .toUpperCase() and .toLowerCase() set the case of all characters in the String
        String hello = "Hello World";
        System.out.println(hello.toUpperCase()); // "HELLO WORLD"
        System.out.println(hello.toLowerCase() + "\n"); // "hello world"

        // .indexOf() returns the index (position) of the character or String in question
        // note that Java begins counting indexes at 0, so the first letter has index 0
        System.out.println("\"W\" appears at index " + hello.indexOf('W') + " in \"Hello World\"\n");

        // .charAt() returns the character at a specific index, effectively acting as the inverse of .indexOf()
        String greet = "Greetings!";
        System.out.println("The character at index 0 is " + greet.charAt(0)); // G
        System.out.println("The character at index 4 is " + greet.charAt(4) + "\n"); // t

        // .equals() returns "true" or "false" depending on whether or not two Strings are identical
        String txt1 = "Hello";
        String txt2 = "Hello";
        String txt3 = "Greetings";
        System.out.println(txt1.equals(txt2)); // true
        System.out.println(txt1.equals(txt3) + "\n"); // false

        // .trim() deletes whitespace at the beginning and end of a String
        // note that it does not trim extra whitespace between non-space characters, i.e. it does nothing to the three spaces between "Hello" and "World!"
        String helloLong = "     Hello   World!     ";
        System.out.println("[" + helloLong + "]"); // "[     Hello   World!     ]"
        System.out.println("[" + helloLong.trim() + "]\n"); // "[Hello   World!]"

        // concatenation can be done with the + operator or the .concat() method
        String first = "John";
        String last = "Doe";
        System.out.println(first + " " + last); // "John Doe"
        // note that .concat() does not add spaces
        System.out.println(first.concat(last)); // "JohnDoe"

        // you can use multiple .concat() methods in a row
        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        System.out.println(a.concat(b).concat(c) + "\n"); // "Java is fun!"

        // because concatenation and addition both use the + operator, there are certain rules pertaining to how Strings and numbers are treated
        // two numbers added result in a number
        int A = 20;
        int B = 30;
        int C = A + B; 
        System.out.println(C); // "50"

        // two Strings added (concatenated) result in a String
        String D = "20";
        String E = "30";
        String F = D + E; 
        System.out.println(F); // "2030"

        // a number added to a String is converted into a String, and then the two are concatenated
        int G = 20;
        String H = "30";
        String I = G + H; 
        System.out.println(I + "\n"); // "2030"

        // backslashes, double quotes, and single quotes in Strings can all be represented with an additional backslash before it
        // single quotes do not strictly need this, as they do not affect the denotation of Strings that use double quotes
        String msg = "\\We call ourselves \"Vikings\" from the North\\\n"; 
        System.out.println(msg); // "\We call ourselves "Vikings" from the North\"

    }

    static void math() {
        
        /*
        Math
            Math in Java is a class that contains many methods that expands Java's mathematical capabilities beyond its arithmetic and bitwise operators
            Math.max(x, y)
            Math.min(x, y)
            Math.pow(x, y)
            Math.sqrt(x)
            Math.abs(x)
            Rounding methods
                Math.round(x)
                Math.ceil(x)
                Math.floor(x)
            Random numbers
                Math.random()
                int myNum = (int)(Math.random() * 101); // random integer between 0 and 100
                Math.random() returns a double. To produce and int you need to cast it, as above
            Additional notes:
                to achieve an nthroot operation you need to use the Math.pow() method and provide a corresponding fraction for the exponent
        */

        int a = 2;
        int b = 6;
        int c = 8;
        int d = 9;
        int e = -4;

        System.out.println(Math.max(a, b)); // 6
        System.out.println(Math.min(c, d)); // 8
        System.out.println(Math.pow(b, a)); // 6^2 = 36
        System.out.println(Math.sqrt(d)); // sqrt(9) = 3
        System.out.println(Math.abs(e)); // |-4| = 4
        System.out.println(Math.round(5.5)); // 6
        System.out.println(Math.ceil(4.3)); // 5.0 -- always rounds up
        System.out.println(Math.floor(6.7)); // 6.0 -- always rounds down
        System.out.println((int)(Math.random() * 51) + "\n"); // random integer between 0 and 50

    }

    static void booleans() {

        /*
        Booleans
            Booleans are effectively bits, reading "true," or "false;" alternatively 0 or 1
            Boolean expressions
                comparison operators (<, >, <=, >=, ==) naturally return a boolean
                e.g. x = (7 <= 9) // x is true
            Results of boolean expressions can be stored in a boolean variable
            Logic gates
                booleans are what primarily interact with logic gates (&&, ||, !)
                logic gates between two boolean values return a boolean
        */

        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, becase x is greater than y
        System.out.println(x == 10); // returns true, because x does equal 10
        System.out.println((10 == 15) + "\n"); // returns false, because 10 does not equal 15

        // you can also store the result in a boolean variable
        boolean greater = x > y; // true
        System.out.println(greater + "\n"); // identical to System.out.println(x > y);

        boolean bool1 = true;
        boolean bool2 = true;
        boolean bool3 = false;
        boolean bool4 = true;

        System.out.println(bool1 && bool2); // true--both variables are true
        System.out.println(bool1 && bool3); // false--bool3 is false
        System.out.println(bool1 || bool3); // true--only one variable needs to be true, i.e. bool1
        System.out.println((bool3 || !bool4) + "\n"); // false--bool3 and the inverse (NOT) of bool4 are both false

    }

    static void scratch() {

        // experimentation with small, independent builds


    }

    // Java files tend to use a main() function, which is automatically run by the program
    public static void main(String[] args) {

        // execute desired methods, defined outside the main() function

        //variables();
        //operators();
        //strings();
        //math();
        booleans();

        //scratch();

    }
    
}

/*
credit to W3Schools (https://www.w3schools.com/java/ as of 09/18/2026) for tutorial and, in part, organization and examples.4
credit to Princeton University (https://introcs.cs.princeton.edu/java/11precedence/ as of 09/18/2026) for in-depth description on operator precedence, including explanation of precedence of bitwise operators

this file is under a Creative Commons Zero v1.0 Universal (CC0) license, and as such may be copied, modified, and distributed freely.
see https://creativecommons.org/publicdomain/zero/1.0/deed.en for more information
*/