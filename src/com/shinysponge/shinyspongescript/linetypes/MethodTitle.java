package com.shinysponge.shinyspongescript.linetypes;

import com.shinysponge.shinyspongescript.LineType;

public class MethodTitle implements Line {


    @Override
    public LineType getType() {
        return LineType.METHOD_TITLE;
    }

    @Override
    public boolean couldBeThis(String line) {
        return Line.regexMatch(line,"^\\s*\\w+\\s*\\(.*\\)\\s*$");
    }
}
