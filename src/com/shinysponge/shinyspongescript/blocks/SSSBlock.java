package com.shinysponge.shinyspongescript.blocks;

import com.shinysponge.shinyspongescript.CompiledLine;
import com.shinysponge.shinyspongescript.linetypes.SSSLine;

public abstract class SSSBlock {

    public abstract String getKey();

    public abstract boolean hasParenthesis();

    public abstract SSSBlock mustBeBefore();

    public abstract void parseParenthesis(CompiledLine line);

    public boolean couldBeThis(String line) {
        return SSSLine.regexMatch(line,String.format("^\\s*%s\\s*",getKey()) + (hasParenthesis() ? "\\(+.*\\)+\\s*" : ""));
    }

}
