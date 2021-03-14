package com.example.news.dao;

public class NewsContent {
    private int newsContentId;
    private int newsId;
    private String newsContent;
    private String newsPicUrl;

    public int getNewsContentId() {
        return newsContentId;
    }

    public void setNewsContentId(int newsContentId) {
        this.newsContentId = newsContentId;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsPicUrl() {
        return newsPicUrl;
    }

    public void setNewsPicUrl(String newsPicUrl) {
        this.newsPicUrl = newsPicUrl;
    }
}
