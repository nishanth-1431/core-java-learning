# Core Java Notes: Exception Handling & Modern Streams
*Date: October 29, 2026*

## 1. Exception Handling Best Practices
- **Checked Exceptions:** Inherit from `Exception` (excluding `RuntimeException`). Must be caught or declared in `throws`.
- **Unchecked Exceptions:** Inherit from `RuntimeException` (e.g., `NullPointerException`, `IllegalArgumentException`).
- **Try-With-Resources:** Introduced in Java 7; automatically closes resources implementing `AutoCloseable`:
  ```java
  try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
      return br.readLine();
  }
  ```

## 2. Java Stream API Key Operations
- **Intermediate Operations (Lazy):**
  - `.filter(predicate)` — filters elements based on a condition.
  - `.map(function)` — transforms each element into another object.
  - `.sorted()` — sorts stream elements.
- **Terminal Operations (Eager):**
  - `.collect(Collectors.toList())` — accumulates stream elements into a list.
  - `.forEach(consumer)` — performs an action for each element.
  - `.count()` — returns the number of elements in the stream.
