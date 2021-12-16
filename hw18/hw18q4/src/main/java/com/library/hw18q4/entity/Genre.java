package com.library.hw18q4.entity;

public enum Genre {
    ROMANCE(1),
    MYSTERY(2),
    FANTASY(3),
    HORROR(4),
    RELIGIOUS(5),
    BIOGRAPHY(6);

    private Integer num;

    Genre(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
