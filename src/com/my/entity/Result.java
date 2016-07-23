package com.my.entity;

/**
 * Created by LJ on 16/7/21.
 */
public class Result {
    private int id;
    private String description;
    private int startScore;
    private int endScore;
    private Suite suite;

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", startScore=" + startScore +
                ", endScore=" + endScore +
                ", suite=" + suite +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartScore() {
        return startScore;
    }

    public void setStartScore(int startScore) {
        this.startScore = startScore;
    }

    public int getEndScore() {
        return endScore;
    }

    public void setEndScore(int endScore) {
        this.endScore = endScore;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }
}
