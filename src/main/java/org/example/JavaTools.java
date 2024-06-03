package org.example;

/**
 * The JavaTools class implements the Tools interface to create Java development tools.
 */
public class JavaTools implements Tools{
    /**
     * Creates a Java validator.
     *
     * @return a JavaValidator
     */
    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }

    /**
     * Creates a Java compiler.
     *
     * @return a JavaCompiler
     */
    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    /**
     * Creates a Java debugger.
     *
     * @return a JavaDebugger
     */
    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }
}
