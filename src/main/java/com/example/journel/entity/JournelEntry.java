package com.example.journel.entity;

public class JournelEntry {
    private long journelId;
    private String title;
    private String content;

    public long getJournelId() {
        return journelId;
    }

    public void setJournelId(long journelId) {
        this.journelId = journelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
