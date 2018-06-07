package com.shinysponge.shinyspongescript;

import com.shinysponge.shinyspongescript.blocks.Block;
import com.shinysponge.shinyspongescript.blocks.IfBlock;

import java.util.Arrays;
import java.util.List;

public class Compiler {

    private static List<Block> blocks = Arrays.asList(new IfBlock());

    private static CompiledLine lastLine;

    public static SSScript compile(String filename, List<String> lines) {
        System.out.printf("compiling %s...",filename);
        lines.forEach(System.out::println);
        for (int i = 0; i < lines.size(); i++) {
            processLine(i,lines.get(i));
        }
        return null;
    }

    private static void processLine(int i, String line) {



    }
}
