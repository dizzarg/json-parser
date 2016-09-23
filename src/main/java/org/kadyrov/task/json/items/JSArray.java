package org.kadyrov.task.json.items;

import java.util.ArrayList;
import java.util.List;

public class JSArray extends JSElement {

    List<JSElement> elements;

    public JSArray() {
        this(new ArrayList<JSElement>());
    }

    public JSArray(List<JSElement> list) {
        elements = list;
    }

    public int size(){
        return elements.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (JSElement element : elements) {
            sb.append(element.toString());
            sb.append(",");
        }
        if(elements.size()>0) {
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }

    public JSElement get(int i) {
        return elements.get(i);
    }

}
