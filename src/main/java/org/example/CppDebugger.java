package org.example;

/**
 * The CppDebugger class implements the Debugger interface to debug C++ code.
 */
public class CppDebugger implements Debugger{
    /**
     * Debugs C++ code.
     */
    @Override
    public void debug() {
        System.out.println("Debug Cpp code");
    }
}
