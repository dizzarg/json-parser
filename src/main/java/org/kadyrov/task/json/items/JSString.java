package org.kadyrov.task.json.items;

public class JSString extends JSElement {

    private String value;

    public JSString() {}

    public JSString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("\"%s\"", value);
    }

}
