package com.epam.mjc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSplitter {
    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        List<String> result = new ArrayList<>();
        String delimitersString = String.join("|", delimiters);
        String[] split = source.split("[" + delimitersString + "]");
        Collections.addAll(result, split);
        result = result.stream().filter(s -> s.length() > 0).collect(Collectors.toList());
        return result;
    }
}
