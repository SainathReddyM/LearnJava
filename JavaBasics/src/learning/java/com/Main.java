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
     */
}