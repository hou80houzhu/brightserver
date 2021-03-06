package com.bright.util.file;

public abstract class JileEach {

    protected Object[] arguments;

    public JileEach(Object... args) {
        this.arguments = args;
    }

    public abstract boolean each(Jile file) throws Exception;
}
