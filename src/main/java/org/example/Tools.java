package org.example;

/**
 * The Tools interface represents a factory for creating development tools.
 */
public interface Tools {
    /**
     * Creates a validator.
     *
     * @return a Validator
     */
    Validator createValidator();
    /**
     * Creates a compiler.
     *
     * @return a Compiler
     */
    Compiler createCompiler();
    /**
     * Creates a debugger.
     *
     * @return a Debugger
     */
    Debugger createDebugger();
}
