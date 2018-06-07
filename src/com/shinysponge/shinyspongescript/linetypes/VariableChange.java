package com.shinysponge.shinyspongescript.linetypes;

import com.shinysponge.shinyspongescript.LineType;

public class VariableChange extends VariableAssignment {

    @Override
    public LineType getType() {
        return LineType.VAR_CHANGE;
    }
}
