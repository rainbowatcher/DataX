package com.clubsheep.datax.plugin.writer;

public enum WriteType {
    JSON("json"),
    TEXT("text");

    private String name;

    WriteType(String name) {
        this.name = name;
    }
}