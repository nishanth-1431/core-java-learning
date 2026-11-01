# 19 - File Handling

Reading from and writing to files on disk. Useful when you want data to persist even after the program closes.

## Topics Covered

- **Reading a text file line by line**
- **Writing and appending to a file**
- **File class** — checking if a file exists, getting file info
- **Handling file-related exceptions** (`FileNotFoundException`, `IOException`)

---

## Project Structure

```text
19-file-handling/
│
├── readingFiles.java
├── writingAndAppending.java
├── fileClassBasics.java
└── handlingExceptions.java
```

---

## Source Files

### 1. Reading Files
| File | Description |
| ---- | ----------- |
| [readingFiles.java](readingFiles.java) | Reading a text file line by line using `BufferedReader` and `FileReader` |

### 2. Writing and Appending
| File | Description |
| ---- | ----------- |
| [writingAndAppending.java](writingAndAppending.java) | Writing and appending data to a file using `FileWriter` |

### 3. File Class Basics
| File | Description |
| ---- | ----------- |
| [fileClassBasics.java](fileClassBasics.java) | Checking if a file exists, getting file info using the `File` class |

### 4. Handling Exceptions
| File | Description |
| ---- | ----------- |
| [handlingExceptions.java](handlingExceptions.java) | Handling file-related exceptions such as `FileNotFoundException` |
