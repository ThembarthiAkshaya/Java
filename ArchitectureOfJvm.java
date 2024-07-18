package com.apjfsa;

/*now i am writing a java program to describe the architecture of JVM*/
public class ArchitectureOfJvm {
//creating main method
	public static void main(String[] args) {
		System.out.println("1.The Java Virtual Machine (JVM) is an essential part of the Java platform");
		System.out.println("2.It serves as an intermediary between Java bytecode and the underlying hardware.");
		System.out.println(
				"3.JVM is a runtime engine that executes Java bytecode, which is the compiled form of Java source code.");
		System.out.println("4.It allows Java programs to run on any device or operating system that supports the JVM.");
		System.out.println("5.The JVM is designed to be platform-independent");
		System.out.println(
				"6.It consists of several components, including the Class Loader, Runtime Data Areas, Execution Engine, and Native Interface.");
		System.out.println(
				"7.Class Loader subsystem is responsible for loading class files from the file system or network and saving them into memory for execution.");
		System.out.println("8.The Runtime Data Areas include the Method Area, Heap, Java Stack, and PC Register");
		System.out.println(
				"9.The Execution Engine interprets bytecode and executes instructions, either using an interpreter or through Just-In-Time (JIT) compilation");
		System.out.println("10.JIT compilation translates frequently executed bytecode into native machine code");
		System.out.println(
				"11.JVM's Garbage Collector manages memory by reclaiming unused objects and freeing up memory space, ensuring efficient memory usage and preventing memory leaks.");
		System.out.println("12.Developers can customize JVM behavior using command-line options and tuning parameters");
		System.out.println(
				"13. It acts as a bridge between Java's platform-independent code and the underlying operating system and hardware");
		System.out.println("14. the JVM is a virtual machine that provides an environment for running Java programs.");
		System.out.println(
				"15.Overall, the JVM's architecture plays a crucial role in making Java a portable, secure, and efficient programming platform");
	}
}
