package com.shinysponge.shinyspongescript;

public class CompiledLine {

    private final String line;

    public CompiledLine(String rawLine) {
        this.line = rawLine;
    }

    public boolean execute() {
        return true;
    }

}
