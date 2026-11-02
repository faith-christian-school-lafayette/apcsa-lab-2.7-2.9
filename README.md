# Lab 2.7-2.9 — while Loops, for Loops, and Standard Algorithms

Six short methods in `LoopLab.java`, each one a piece of AccountSetup, the
school-account program from your Unit 2B notes. The instructions for each part
are in the comment block directly above the method, so read them there — this
page is just the map.

Plan on 30 to 45 minutes.

## What you will practice

- Writing a `while` loop that stops on its own, and spotting one that never
  does.
- Writing a `for` loop that runs exactly the right number of times.
- Peeling the digits off an integer with `% 10` and `/= 10`.
- The standard algorithms for a sum, a count, a minimum, and divisibility.

## Getting started

1. Open this folder in your editor.
1. Open `src/main/java/LoopLab.java`. That is the only file you change.
1. Work down the file. Each part is marked with a comment that starts with
   `TODO`; replace the placeholder line under it with your own code.

To run your program and see your output:

```sh
mvn -q compile exec:java
```

Your teacher will run a separate set of tests on your work when you turn it in.

## The parts

| Part | Method | What it is about |
| --- | --- | --- |
| 1 | `digitSum(int)` | a `while` loop that peels off digits |
| 2 | `hiddenPassword(String)` | a `for` loop, once per character |
| 3 | `countOddDigits(int)` | counting how often something is true |
| 4 | `smallestDigit(int)` | a minimum, and a safe starting value |
| 5 | `checkTotal(int)` | AccountSetup's check-digit loop |
| 6 | `isValidId(int)` | divisible by 10, and six digits |

## Before you turn it in

- [ ] Every placeholder line under a `TODO` has been replaced with real code.
- [ ] `mvn -q compile exec:java` runs without errors, and it finishes. If it
      hangs, a loop variable is never changing.
- [ ] `digitSum(7)` is 7, not 0, and `hiddenPassword("")` is `""`.
- [ ] `smallestDigit(777)` is 7. If it is 0, check the starting value.
- [ ] `checkTotal(482919)` is 40 and `isValidId(0)` is `false`.
- [ ] You did not rename any method, change any parameter list, or change any
      return type. The grader compiles against those exact signatures, so a
      rename means a zero even if your logic is perfect.

`main` is not graded, so you may change it however you like.

## Optional extension, not graded

Rewrite your Part 2 `for` loop as an equivalent `while` loop, then trace the
`for` loop on line 30 of AccountSetup for a student who types one bad ID and
then a good one. How many times does each part of its header run?
