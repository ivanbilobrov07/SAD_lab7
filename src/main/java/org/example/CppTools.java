package org.example;

/**
 * The CppTools class implements the Tools interface to create C++ development tools.
 */
public class CppTools implements Tools{
    /**
     * Creates a C++ validator.
     *
     * @return a CppValidator
     */
    @Override
    public Validator createValidator() {
        return new CppValidator();
    }

    /**
     * Creates a C++ compiler.
     *
     * @return a CppCompiler
     */
    @Override
    public Compiler createCompiler() {
        return new CppCompiler();
    }

    /**
     * Creates a C++ debugger.
     *
     * @return a CppDebugger
     */
    @Override
    public Debugger createDebugger() {
        return new CppDebugger();
    }
}