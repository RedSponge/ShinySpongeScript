package com.shinysponge.shinyspongescript.linetypes;

import com.shinysponge.shinyspongescript.LineType;

public class VariableAssignment implements Line {

    @Override
    public LineType getType() {
        return LineType.VAR_ASSIGN;
    }

    @Override
    public boolean couldBeThis(String line) {
        return Line.regexMatch(line,"^.+\\s*=\\s*.+$");
    }
}
