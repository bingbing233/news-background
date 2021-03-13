package com.example.news.dao;


public class News  {

    private Integer newsId;//新闻id（自动生成）
    private String newsTitle;//标题
    private String newsSum;//简介
    private String newsSource;//来源
    private String newsPublicTime;//发布时间
    private String newsContent;//新闻内容
    private String newsColumn;//栏目id
    private String newsCreator;//创建者id
    private String newsPublicState;//发布状态id

    public void setNewsColumn(String newsColumn) {
        this.newsColumn = newsColumn;
    }

    public void setNewsCreator(String newsCreator) {
        this.newsCreator = newsCreator;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsSum() {
        return newsSum;
    }

    public void setNewsSum(String newsSum) {
        this.newsSum = newsSum;
    }

    public String getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    public String getNewsPublicTime() {
        return newsPublicTime;
    }

    public void setNewsPublicTime(String newsPublicTime) {
        this.newsPublicTime = newsPublicTime;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsPublicState() {
        return newsPublicState;
    }

    public void setNewsPublicState(String newsPublicState) {
        this.newsPublicState = newsPublicState;
    }

    public String getNewsColumn() {
        return newsColumn;
    }

    public String getNewsCreator() {
        return newsCreator;
    }

}
