package org.example;

/**
 * The CppCompiler class implements the Compiler interface to compile C++ code.
 */
public class CppCompiler implements Compiler{
    /**
     * Compiles C++ code.
     */
    @Override
    public void compile() {
        System.out.println("Compile Cpp code");
    }
}
