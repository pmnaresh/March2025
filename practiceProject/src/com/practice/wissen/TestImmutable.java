package com.practice.wissen;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class Immutable {
    private final String name;
    private final Map<String, String> mp;

    public Immutable(String name, Map<String, String> mp) {
        this.name = name;
        // Defensive copy and make unmodifiable
        this.mp = Collections.unmodifiableMap(new HashMap<>(mp));
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMp() {
        return mp;
    }
}

public class TestImmutable {
    public static void main(String[] args) {
        Map<String, String> original = new HashMap<>();
        original.put("key1", "value1");

        Immutable obj = new Immutable("Test", original);
        System.out.println(obj.getName()); // Test
        System.out.println(obj.getMp());   // {key1=value1}

        // Try to modify original map
        original.put("key2", "value2");
        System.out.println(obj.getMp());   // Still {key1=value1}

        // Try to modify map from getter
        obj.getMp().put("key3", "value3"); // Throws UnsupportedOperationException
    }
}


