/**
 * AP CSA Lab 2.7-2.9 - while Loops, for Loops, and Standard Algorithms
 *
 * Fill in the body of each method in LoopLab below. Do not rename anything,
 * do not change the parameter lists, and do not change the return types. The
 * grader compiles against these exact signatures.
 *
 * Every part is a piece of AccountSetup, the school-account program from your
 * Unit 2B notes (Appendix A). The student ID rules are the same ones:
 *
 *     a student ID has six digits, 100000 through 999999
 *     it must also pass the check-digit test: go through the digits from
 *     right to left, double every second digit, take 9 off any doubled
 *     digit over 9, and add them all up -- the ID passes if that total is
 *     divisible by 10
 *
 * Each part tells you which lines of AccountSetup it matches, so you can look
 * back at them.
 *
 * Two lines you will use again and again, from AccountSetup lines 43 and 53:
 *
 *     rest % 10     the last digit of rest
 *     rest /= 10    drop that last digit
 *
 * Run the program with:  mvn -q compile exec:java
 * Or from your IDE, just run main.
 */
public class LoopLab
{
    // ---------------------------------------------------------------
    // PART 1: a while loop that peels off digits
    //
    // Return the sum of the digits of n. n is never negative.
    //
    // Use the shape of AccountSetup lines 38-55, without the doubling:
    //
    //     int rest = n;
    //     while (rest > 0)
    //     {
    //         ... add rest % 10 to a total ...
    //         rest /= 10;
    //     }
    //
    // A while loop checks its Boolean expression before each iteration of
    // the body, including the first. While it is true the body runs; as soon
    // as it is false the loop ends. If it is false the very first time, the
    // body runs zero times -- so digitSum(0) is 0 without any special case.
    //
    // Example: digitSum(507)    is 12   (7 + 0 + 5)
    // Example: digitSum(482919) is 33
    // Example: digitSum(0)      is 0
    //
    // Careful, two traps from the notes. Leave out rest /= 10 and rest never
    // changes, so rest > 0 is always true: an INFINITE LOOP. Write
    // while (rest > 9) and the loop stops one digit early -- the leftmost
    // digit is never added. That is an OFF BY ONE error.
    // ---------------------------------------------------------------
    public static int digitSum(int n)
    {
        // TODO Part 1: peel digits off with % 10 and /= 10 in a while loop
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 2: a for loop that runs once per character
    //
    // Return a String of stars, one * for every character in password.
    //
    // AccountSetup lines 175-179:
    //
    //     String hidden = "";
    //     for (int k = 0; k < password.length(); k++)
    //     {
    //         hidden += "*";
    //     }
    //
    // A for loop header has three parts: the initialization (int k = 0),
    // the Boolean expression (k < password.length()), and the update (k++).
    // The initialization runs once. Then the expression is checked, the body
    // runs, the update runs, and the expression is checked again, until it
    // is false. k is the LOOP CONTROL VARIABLE.
    //
    // Example: hiddenPassword("Tiger2025") is "*********"  (9 stars)
    // Example: hiddenPassword("Go4Broke")  is "********"   (8 stars)
    // Example: hiddenPassword("")          is ""
    //
    // Careful: k <= password.length() runs the body one time too many and
    // gives one extra star. Starting at 0 and stopping BEFORE the length is
    // exactly length times.
    // ---------------------------------------------------------------
    public static String hiddenPassword(String password)
    {
        // TODO Part 2: add one "*" per character in a for loop
        return "";
    }

    // ---------------------------------------------------------------
    // PART 3: count how often a criterion is met
    //
    // Return how many of the digits of id are odd. id is positive.
    //
    // This is the standard algorithm to determine the frequency with which a
    // specific criterion is met. Start a count at 0 before the loop, and
    // inside the loop add 1 to it only when the criterion is true:
    //
    //     if (... the digit is odd ...)
    //     {
    //         count++;
    //     }
    //
    // A digit is odd when dividing it by 2 leaves a remainder of 1. Use the
    // same digit-peeling loop as Part 1.
    //
    // Example: countOddDigits(482919) is 3   (9, 1 and 9)
    // Example: countOddDigits(2468)   is 0
    // Example: countOddDigits(13579)  is 5
    //
    // Careful: count++ adds ONE for each odd digit. Adding the digit itself,
    // count += digit, is a sum, not a count -- 482919 would give 19.
    // ---------------------------------------------------------------
    public static int countOddDigits(int id)
    {
        // TODO Part 3: count the odd digits with count++ inside an if
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 4: find a minimum
    //
    // Return the smallest digit of id. id is positive.
    //
    // This is the standard algorithm to determine a minimum. Keep the
    // smallest value seen so far in a variable, and replace it whenever you
    // find a smaller one:
    //
    //     if (digit < smallest)
    //     {
    //         smallest = digit;
    //     }
    //
    // The hard part is the STARTING value. It must be a value that the first
    // real digit is sure to replace, or that is a real digit itself. Two good
    // choices: start at 9, the largest a digit can be, or start at id % 10,
    // the first digit you look at.
    //
    // Example: smallestDigit(482919) is 1
    // Example: smallestDigit(777)    is 7
    // Example: smallestDigit(908)    is 0
    //
    // Careful: starting smallest at 0 is the trap from the notes. No digit is
    // ever less than 0, so smallest never changes and every answer is 0. A
    // start of 0 is safe for a LARGEST digit, never for a smallest one.
    // ---------------------------------------------------------------
    public static int smallestDigit(int id)
    {
        // TODO Part 4: keep the smallest digit seen so far
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 5: the check-digit total
    //
    // Return the check-digit total for id, exactly as AccountSetup lines
    // 38-55 compute it. id is never negative.
    //
    //     int rest = id;
    //     int position = 1;
    //     int total = 0;
    //     while (rest > 0)
    //     {
    //         int digit = rest % 10;
    //         if (position % 2 == 0)
    //         {
    //             digit *= 2;
    //             if (digit > 9)
    //             {
    //                 digit -= 9;
    //             }
    //         }
    //         total += digit;
    //         rest /= 10;
    //         position++;
    //     }
    //
    // position counts the digits from the RIGHT, starting at 1, so the
    // digits at positions 2, 4 and 6 are the ones that get doubled.
    //
    // Example: checkTotal(482919) is 40
    //          digits right to left:  9   1   9   2   8   4
    //          after doubling:        9   2   9   4   8   8
    // Example: checkTotal(482917) is 38
    // Example: checkTotal(59)     is 10   (9, then 5 doubled is 10, minus 9)
    //
    // Careful: start position at 1, not 0, or the wrong digits get doubled.
    // And do not skip digit -= 9: a doubled 5 must count as 1, not 10.
    // ---------------------------------------------------------------
    public static int checkTotal(int id)
    {
        // TODO Part 5: the check-digit loop from AccountSetup lines 38-55
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 6: evenly divisible, and in range
    //
    // Return true if id is a valid student ID, and false otherwise.
    //
    // AccountSetup line 57:
    //
    //     validId = id >= 100000 && id <= 999999 && total % 10 == 0;
    //
    // An integer n is evenly divisible by d when n % d == 0. That is the
    // standard divisibility algorithm. Call your own checkTotal from Part 5
    // to get the total.
    //
    // Example: isValidId(482919)  is true    (total 40)
    // Example: isValidId(482917)  is false   (total 38)
    // Example: isValidId(0)       is false   (total 0 IS divisible by 10,
    //                                         but 0 is not six digits)
    //
    // Careful: the divisibility test alone is not enough. Plenty of numbers
    // with fewer or more than six digits have a total divisible by 10. All
    // three conditions must be true.
    // ---------------------------------------------------------------
    public static boolean isValidId(int id)
    {
        // TODO Part 6: six digits AND a total divisible by 10
        return false;
    }

    // ---------------------------------------------------------------
    // Run this to see your own work. The grader does not test main, so you
    // may change it freely while you experiment.
    // ---------------------------------------------------------------
    public static void main(String[] args)
    {
        System.out.println("digitSum(507)               = " + digitSum(507));
        System.out.println("hiddenPassword(\"Tiger2025\") = " + hiddenPassword("Tiger2025"));
        System.out.println("countOddDigits(482919)      = " + countOddDigits(482919));
        System.out.println("smallestDigit(482919)       = " + smallestDigit(482919));
        System.out.println("checkTotal(482919)          = " + checkTotal(482919));
        System.out.println("checkTotal(482917)          = " + checkTotal(482917));
        System.out.println("isValidId(482919)           = " + isValidId(482919));
        System.out.println("isValidId(482917)           = " + isValidId(482917));
    }
}
