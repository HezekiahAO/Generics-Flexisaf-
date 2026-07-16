# Java Generics Practice

Hi! This repo is dedicated to learning and practicing **generics and generic types in Java**, using small, focused examples. Each example follows the same core pattern which is:

> Loop through a collection → check each element against a property → count how many match.

## Projects

### 1. Odd Numbers (`oddno.java`)
Counts how many numbers in an `ArrayList<Integer>` are odd.
- Core check: `n % 2 != 0`
- Demonstrates: `ArrayList<Integer>`, the diamond operator `<>`, and the for-each loop (`for (int n : numbers)`).

### 2. Prime Numbers (`isPrime` method)
Counts how many numbers in a list are prime.
- Core check: try dividing by every number from `2` up to `√n`; if nothing divides evenly, it's prime.
- Demonstrates: `Math.sqrt(n)`, classic `for` loops with explicit boundary conditions, and why Java doesn't need the `+1` trick Python's `range()` requires.

### 3. Palindromes (`Palindrome.java`)
Counts how many words in an `ArrayList<String>` are palindromes (read the same forwards and backwards).
- Core check: manually reverse the string by walking backward through it with `word.charAt(i)`, then compare with `word.equals(reversed)`.
- Demonstrates: `String.length()`, `String.charAt(i)`, and why Java requires `.equals()` instead of `==` to compare string contents.

### 4. Anagrams (`Anagram.java`)
Counts how many word-pairs in an `ArrayList<String[]>` are anagrams of each other.
- Core check: convert both words to `char[]` arrays, sort them, and compare with `Arrays.equals(...)`.
- Demonstrates: `String.toCharArray()`, `Arrays.sort(...)`, `Arrays.equals(...)` (and why array `.equals()` doesn't work the way string `.equals()` does), and storing arrays as elements inside an `ArrayList`.

## Key Concepts Covered in this implemetations 

- **Generics**: `ArrayList<Integer>`, `ArrayList<String>`, `ArrayList<String[]>` — one class (`ArrayList<T>`) reused safely across different types.
- **Type inference**: the diamond operator `new ArrayList<>()` lets Java infer the generic type from the declared variable type.
- **Primitives vs. objects**: why generics require wrapper types like `Integer` instead of raw `int`.
- **Loops**: Java's classic `for` loop vs. the for-each loop, and how both differ from Python's `for ... in` / `range()`.
- **String handling**: `.length()`, `.charAt(i)`, `.equals()`, and `.toCharArray()`.
- **Array comparison**: why `Arrays.equals()` exists as a separate utility method.
