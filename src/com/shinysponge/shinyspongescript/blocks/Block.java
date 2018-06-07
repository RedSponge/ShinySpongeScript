package com.shinysponge.shinyspongescript.blocks;

import com.shinysponge.shinyspongescript.CompiledLine;
import com.shinysponge.shinyspongescript.linetypes.Line;

public abstract class Block {

    public abstract String getKey();

    public abstract boolean hasParenthesis();

    public abstract Block mustBeBefore();

    public abstract void parseParenthesis(CompiledLine line);

    public boolean couldBeThis(String line) {
        return Line.regexMatch(line,String.format("^\\s*%s\\s*",getKey()) + (hasParenthesis() ? "\\(+.*\\)+\\s*" : ""));
    }

}
