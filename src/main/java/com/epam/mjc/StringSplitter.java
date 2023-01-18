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
        String delimitersString = String.join("|", delimiters);// переводим коллекцию в строку,
        // каждый элемен разделен '|': 1|e|4|g|w|5
        String[] split = source.split("[" + delimitersString + "]");// скобки нужны чтобы определить набор делителей
        // каждый из них подходит в качестве делителя для строки
        Collections.addAll(result, split);//добавляем все подстроки в лист
        result = result.stream().filter(s -> s.length() > 0).collect(Collectors.toList());//удаляем из листа
        //нулевые эелементы вроде ""
        return result;
    }
}
