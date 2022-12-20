package Exercise4;

import java.util.Arrays;

public class News implements INews{

    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rateList = new int[3];

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("title = " + title + ", publishDate = " + publishDate + ", author = " + author +
                ", content = " + content + ", average rate = " + averageRate);
    }

    public float calculate() {
        Arrays.stream(rateList).forEach(value -> this.averageRate += value/3);
        return this.averageRate;
    }
}
