package org.app.bipium.models.catalogs;

import java.util.Map;

public class Catalog {
    private String name;
    private int id;
    private Map<String, Integer> fieldsValues;

    public Catalog(String name, int id, Map<String, Integer> fieldsValues) {
        this.name = name;
        this.id = id;
        this.fieldsValues = fieldsValues;
    }

    public int getId() {
        return id;
    }

}