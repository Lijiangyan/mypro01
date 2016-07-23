package com.my.entity;

/**
 * Created by LJ on 16/7/21.
 */
public class Option {
    private int id;
    private String title;
    private int score;
    private int seq;
    private Question question;

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", score=" + score +
                ", seq=" + seq +
                ", question=" + question +
                '}';
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
