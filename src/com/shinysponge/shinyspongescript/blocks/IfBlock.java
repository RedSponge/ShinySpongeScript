package com.shinysponge.shinyspongescript.blocks;

import com.shinysponge.shinyspongescript.CompiledLine;
import com.shinysponge.shinyspongescript.LineType;
import com.shinysponge.shinyspongescript.linetypes.SSSLine;

public class IfBlock extends SSSBlock implements SSSLine {

    @Override
    public String getKey() {
        return "if";
    }

    @Override
    public boolean hasParenthesis() {
        return true;
    }

    @Override
    public SSSBlock mustBeBefore() {
        return null;
    }

    @Override
    public void parseParenthesis(CompiledLine line) {

    }

    @Override
    public LineType getType() {
        return LineType.BLOCK_TITLE;
    }

}
