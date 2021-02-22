package com.example.news.dao;


public class News  {

    private Integer newsId;//新闻id（自动生成）
    private String newsTitle;//标题
    private String newsSum;//简介
    private String newsSource;//来源
    private String publicTime;//发布时间
    private String newsContent;//新闻内容
    private Integer newsFormatId;//版式id
    private Integer columnId;//栏目id
    private Integer newsCreatorId;//创建者id
    private Integer stateId;//状态id
    private Integer publicStateId;//发布状态id
    private Integer orderId;//顺序id


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

    public Integer getNewsFormatId() {
        return newsFormatId;
    }

    public void setNewsFormatId(Integer newsFormatId) {
        this.newsFormatId = newsFormatId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getNewsCreatorId() {
        return newsCreatorId;
    }

    public void setNewsCreatorId(Integer newsCreatorId) {
        this.newsCreatorId = newsCreatorId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getPublicStateId() {
        return publicStateId;
    }

    public void setPublicStateId(Integer publicStateId) {
        this.publicStateId = publicStateId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsTitle='" + newsTitle + '\'' +
                ", newsSum='" + newsSum + '\'' +
                ", newsContent='" + newsContent + '\'' +
                '}';
    }
}
