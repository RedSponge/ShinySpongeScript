package com.shinysponge.shinyspongescript.linetypes;

import com.shinysponge.shinyspongescript.LineType;

public class MethodTitle implements SSSLine {


    @Override
    public LineType getType() {
        return LineType.METHOD_TITLE;
    }

    @Override
    public boolean couldBeThis(String line) {
        return SSSLine.regexMatch(line,"^\\s*\\w+\\s*\\(.*\\)\\s*$");
    }
}
