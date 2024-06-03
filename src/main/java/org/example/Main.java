package org.example;

public class Main {
    public static void main(String[] args) {
        Tools tools = new JavaTools();

        Validator validator = tools.createValidator();
        Debugger debugger = tools.createDebugger();
        Compiler compiler = tools.createCompiler();

        validator.validate();
        debugger.debug();
        compiler.compile();
    }
}