package ru.Translator;

import java.util.List;

public interface Insert {
    void Add(List<String> Key, List<String> Value);
    boolean ValidKey(String key);
    boolean ValidValue(String value);
    boolean Skinwalker();
}