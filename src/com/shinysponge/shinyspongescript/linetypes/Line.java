package com.shinysponge.shinyspongescript.linetypes;

import com.shinysponge.shinyspongescript.LineType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Line {

    LineType getType();

    boolean couldBeThis(String line);

    static boolean regexMatch(String text, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        return m.matches();
    }
}
