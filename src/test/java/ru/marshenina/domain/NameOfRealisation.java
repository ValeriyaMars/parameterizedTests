package ru.marshenina.domain;

public enum NameOfRealisation {

    JAVA_SCRIPT_REALISATION("Реализация на JavaScript"),
    PHP_SCRIPT_REALISATION("Реализация на PHP");

    private String desc;

    NameOfRealisation(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
