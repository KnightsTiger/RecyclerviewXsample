package com.xsample.recyclerviewxsample;

public class ListItem {
    String Head;
    String description;

    public ListItem(String head, String description) {
        Head = head;
        this.description = description;
    }

    public String getHead() {
        return Head;
    }

    public String getDescription() {
        return description;
    }

    public void setHead(String head) {
        Head = head;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
