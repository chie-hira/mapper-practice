package com.mapper.mapperpractice;

public class NameResponse {
    private int id;
    private String name;
//    Nameクラスをダイレクトに返さないでResponse用にクラスを用意して決められたデータだけ返す
    public NameResponse(Name name){
        this.id = name.getId();
        this.name = name.getName();
    }
}
