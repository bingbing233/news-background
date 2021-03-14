package com.example.news.dao;

public class NewsContent {
    private int newsContentId;
    private int newsId;
    private String newsContentText;
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

    public String getNewsContentText() {
        return newsContentText;
    }

    public void setNewsContentText(String newsContentText) {
        this.newsContentText = newsContentText;
    }

    public String getNewsPicUrl() {
        return newsPicUrl;
    }

    public void setNewsPicUrl(String newsPicUrl) {
        this.newsPicUrl = newsPicUrl;
    }

    @Override
    public String toString() {
        return "NewsContent{" +
                "newsContentId=" + newsContentId +
                ", newsId=" + newsId +
                ", newsContent='" + newsContentText + '\'' +
                ", newsPicUrl='" + newsPicUrl + '\'' +
                '}';
    }
}
