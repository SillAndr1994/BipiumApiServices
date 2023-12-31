package org.app.bipiumSearchDevice.models.catalogs;

import java.util.Map;

public class Catalog {
    private String name;
    private int id;
    private Map<String, String> fieldsValues;

    public Catalog(String name, int id, Map<String, String> fieldsValues) {
        this.name = name;
        this.id = id;
        this.fieldsValues = fieldsValues;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getFieldsValues() {
        return fieldsValues;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", fieldsValues=" + fieldsValues +
                '}';
    }
}
