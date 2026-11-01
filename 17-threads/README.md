# 17. Multithreading

Multithreading is the process of executing multiple threads concurrently within a program. It allows applications to perform multiple tasks efficiently and improves responsiveness and resource utilization.

## Topics Covered

* **Thread Basics** — Understanding threads and the main thread
* **Thread Creation** — Creating multiple concurrent threads using `Thread`
* **Thread Priority & Sleep** — Managing thread priorities (`setPriority`, `getPriority`) and `Thread.sleep()`
* **Runnable Interface** — `Runnable` vs `Thread` and Lambda expressions
* **Synchronization** — Race conditions, mutex, and `synchronized` keyword
* **Thread Lifecycle** — Thread states (`NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, `TERMINATED`)
* **Inter-Thread Communication** — Coordination using `wait()`, `notify()`, and `notifyAll()`
* **Executor Framework** — Efficient thread management using `ExecutorService` and Thread Pools

---

## Project Structure

```text
17-Multithreading/
│
├── threadBasics.java
├── threadCreation.java
├── threadPriorityAndSleep.java
├── runnableInterface.java
├── synchronization.java
├── threadLifecycle.java
├── interThreadCommunication.java
└── executorFramework.java
```

---

## Source Files

### 1. Thread Basics
| File | Description |
| ---- | ----------- |
| [threadBasics.java](threadBasics.java) | Introduction to threads, thread execution concepts, and the main thread |

### 2. Thread Creation & Multiple Threads
| File | Description |
| ---- | ----------- |
| [threadCreation.java](threadCreation.java) | Creating multiple concurrent threads by extending the `Thread` class |

### 3. Thread Priority & Sleep
| File | Description |
| ---- | ----------- |
| [threadPriorityAndSleep.java](threadPriorityAndSleep.java) | Setting thread priorities (`setPriority`, `getPriority`) and using `Thread.sleep()` |

### 4. Runnable Interface vs Thread
| File | Description |
| ---- | ----------- |
| [runnableInterface.java](runnableInterface.java) | Implementing `Runnable`, task vs thread separation, and Lambda expressions |

### 5. Synchronization & Race Condition
| File | Description |
| ---- | ----------- |
| [synchronization.java](synchronization.java) | Race conditions, thread safety, and synchronized methods/blocks |

### 6. Thread Lifecycle & States
| File | Description |
| ---- | ----------- |
| [threadLifecycle.java](threadLifecycle.java) | Understanding thread states (`NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, `TERMINATED`) |

### 7. Inter-Thread Communication
| File | Description |
| ---- | ----------- |
| [interThreadCommunication.java](interThreadCommunication.java) | Thread coordination using `wait()`, `notify()`, and `notifyAll()` |

### 8. Executor Framework
| File | Description |
| ---- | ----------- |
| [executorFramework.java](executorFramework.java) | Managing tasks using `ExecutorService` and Thread Pools |
