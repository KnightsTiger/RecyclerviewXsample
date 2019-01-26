package com.xsample.recyclerviewxsample;

public class ListItem {
    String Head;
    String description;
    String imageUrl;

    public ListItem(String head, String description, String imageUrl) {
        Head = head;
        this.description = description;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }
}
