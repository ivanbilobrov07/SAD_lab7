package org.example;

public class CppTools implements Tools{
    @Override
    public Validator createValidator() {
        return new CppValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new CppCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new CppDebugger();
    }
}