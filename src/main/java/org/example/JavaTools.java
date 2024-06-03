package org.example;

public class JavaTools implements Tools{
    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }
}
