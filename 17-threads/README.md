# 17. Multithreading

Multithreading is the process of executing multiple threads concurrently within a program. It allows applications to perform multiple tasks efficiently and improves responsiveness and resource utilization.

## Topics Covered

* **Thread Basics** — Understanding threads and the main thread
* **Thread Creation** — Creating threads using the `Thread` class
* **Runnable Interface** — Creating threads using `Runnable`
* **Thread Lifecycle** — Understanding thread states and transitions
* **Synchronization** — Managing shared resources and preventing race conditions
* **Inter-Thread Communication** — Using `wait()`, `notify()`, and `notifyAll()`
* **Executor Framework** — Efficiently managing and executing multiple threads

---

## Project Structure

```text
17-Multithreading/
│
├── threadBasics.java
│
├── creatingThread.java
├── threadClass.java
├── runnableInterface.java
│
├── threadLifecycle.java
│
├── synchronizationBasics.java
├── synchronizedMethod.java
├── synchronizedBlock.java
│
├── interThreadCommunication.java
├── waitMethod.java
├── notifyMethod.java
├── notifyAllMethod.java
│
├── executorFramework.java
├── executorService.java

```
---

## Source Files

### Thread Basics

| File                                                     | Description                                 |
| -------------------------------------------------------- | ------------------------------------------- |
| [threadBasics.java](17-Multithreading/threadBasics.java) | Introduction to threads and the main thread |

### Creating Threads

| File                                                               | Description                                       |
| ------------------------------------------------------------------ | ------------------------------------------------- |
| [creatingThread.java](17-Multithreading/creatingThread.java)       | Basic approach to creating threads                |
| [threadClass.java](17-Multithreading/threadClass.java)             | Creating a thread by extending the `Thread` class |
| [runnableInterface.java](17-Multithreading/runnableInterface.java) | Creating a thread using the `Runnable` interface  |

### Thread Lifecycle

| File                                                           | Description                                        |
| -------------------------------------------------------------- | -------------------------------------------------- |
| [threadLifecycle.java](17-Multithreading/threadLifecycle.java) | Understanding the lifecycle and states of a thread |

### Synchronization

| File                                                                       | Description                                         |
| -------------------------------------------------------------------------- | --------------------------------------------------- |
| [synchronizationBasics.java](17-Multithreading/synchronizationBasics.java) | Introduction to synchronization and race conditions |
| [synchronizedMethod.java](17-Multithreading/synchronizedMethod.java)       | Synchronizing an entire method                      |
| [synchronizedBlock.java](17-Multithreading/synchronizedBlock.java)         | Synchronizing a specific block of code              |

### Inter-Thread Communication

| File                                                                             | Description                                   |
| -------------------------------------------------------------------------------- | --------------------------------------------- |
| [interThreadCommunication.java](17-Multithreading/interThreadCommunication.java) | Introduction to communication between threads |
| [waitMethod.java](17-Multithreading/waitMethod.java)                             | Using `wait()` for thread coordination        |
| [notifyMethod.java](17-Multithreading/notifyMethod.java)                         | Using `notify()` to wake a waiting thread     |
| [notifyAllMethod.java](17-Multithreading/notifyAllMethod.java)                   | Using `notifyAll()` to wake waiting threads   |

### Executor Framework

| File                                                               | Description                            |
| ------------------------------------------------------------------ | -------------------------------------- |
| [executorFramework.java](17-Multithreading/executorFramework.java) | Introduction to the Executor Framework |
| [executorService.java](17-Multithreading/executorService.java)     | Managing tasks using `ExecutorService` |


