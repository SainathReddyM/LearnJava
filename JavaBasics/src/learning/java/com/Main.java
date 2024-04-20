package learning.java.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /**
     * Java was created between 1990-1995 in sun microsystems.
     * It was initiated by bunch of people, the most prominent among them was James Gosling.
     *
     * The primary goal of creating java was to achieve platform independence. i.e , the ability to write code once
     * and run it everywhere
     * Before Java, it was common to create a bunch of executables of the given source code and distribute it. Executables
     * were hardware(machine specs) and software(OS) specific.
     * It was also not uncommon to see source code written differently to be machine specific.
     * This caused the code to be very platform dependent.
     *
     * How is Java different?
     * In Java, the source code(.java source files) is converted by the compiler to an intermediate format called byte code
     * (.class files) rather than to machine level code.
     * Java comes with a Runtime program that is machine specific, but it can run the byte code compiled on any machine.
     * .java files contain java code which the compiler compiles into bytecode in .class files(intermediate format).
     * The bytecode is run by the java runtime referred to as JVM(java virtual machine). This virtual machine sits on top
     * of the actual machine, and it understands the bytecode(.class files).
     *
     *
     * JDK, JRE and JVM.
     *
     * JDK -> JDK is the java development kit. It contains compiler and other tools required to build java applications.
     *        JDK is necessary only if you are planning to develop java applications. Not necessary to run java programs.
     *        JDK comes with runtime.
     * JRE -> JRE is the java runtime environment. Required to run java applications. JRE is different for different machines.
     *        JRE is language agnostic which means that it does not matter what language the code is written in (for example:
     *        java or groovy) as long as code is compiled into bytecode.
     *        Contains standalone JVM.
     * JVM -> Runs on a computer any program that's compiled to bytecode.
     *        It acts as an abstract "virtual" computer.
     *        It has bytecode loader, verifier and interpreter.
     *        Can convert byte code to machine specific code.
     *
     * Advantages of the Java bytecode model:
     * 1) Write once, run anywhere.
     * 2) Security-  JVM acts as a sandbox.
     *
     * Doesn't it make things slow as JVM is interpreting the code instead of running machine level code directly on the machine?
     * Java does few things to optimise processing. One of them is Just-in-time(JIT) compiler of java.
     * When JVM detects a piece of code that has to be run multiple number of times, it will convert that peice of code into machine
     * level code and run it to optimise performance.
     *
     * There are 3 ways to run java bytecode
     * 1) Interpret the intermediate bytecode directly.
     * 2) Just before executing, compile to native code (JIT compiler)
     * 3) Convert intermediate code fully to native code before executing.(AOT - Ahead of time compilation). This is available since
     *    java-9 only.
     *
     * 5 goals java was designed to meet
     * 1) It must be simple, object-oriented and familiar.
     * 2) It must be robust and secure.
     * 3) It must be architecture-neutral and portable.
     * 4) It must execute with high performance.
     * 5) It must be interpreted, threaded, and dynamic.
     *
     * Installing JDK
     * Best way to install jdk is from openjdk.org. Other versions like the oracle has licensing requirements.
     *
     *
     * sss
     */
}