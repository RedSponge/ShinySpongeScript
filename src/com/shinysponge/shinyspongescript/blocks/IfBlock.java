package com.shinysponge.shinyspongescript.blocks;

import com.shinysponge.shinyspongescript.CompiledLine;
import com.shinysponge.shinyspongescript.LineType;
import com.shinysponge.shinyspongescript.linetypes.Line;

public class IfBlock extends Block implements Line {

    @Override
    public String getKey() {
        return "if";
    }

    @Override
    public boolean hasParenthesis() {
        return true;
    }

    @Override
    public Block mustBeBefore() {
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
