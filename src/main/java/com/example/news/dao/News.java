package com.example.news.dao;


public class News  {

    private Integer newsId;//新闻id（自动生成）
    private String newsTitle;//标题
    private String newsSum;//简介
    private String newsSource;//来源
    private String publicTime;//发布时间
    private String newsContent;//新闻内容
    private String column;//栏目id
    private String newsCreator;//创建者id
    private String publicState;//发布状态id

    public void setColumn(String column) {
        this.column = column;
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

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getPublicState() {
        return publicState;
    }

    public void setPublicState(String publicState) {
        this.publicState = publicState;
    }

    public String getColumn() {
        return column;
    }

    public String getNewsCreator() {
        return newsCreator;
    }

}
