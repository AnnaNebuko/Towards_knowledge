package org.example;

public class Info {
    private int d;
    private int h;
    private int m;
    private int id;
    private String st;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return "Info{" +
            "d=" + d +
            ", h=" + h +
            ", m=" + m +
            ", id=" + id +
            ", st='" + st + '\'' +
            '}';
    }
}
