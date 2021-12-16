package com.library.hw18q4.entity;

public enum Language {
    ENGLISH(1),
    CHINESE(2),
    SPANISH(3),
    ARABIC(4),
    FARSI(5),
    FRENCH(6),
    RUSSIAN(7);

    private Integer num;

    Language(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
