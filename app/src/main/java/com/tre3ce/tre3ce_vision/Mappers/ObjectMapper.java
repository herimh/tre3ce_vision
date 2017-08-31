package com.tre3ce.tre3ce_vision.Mappers;

/**
 * Created by heriberto on 30/08/17.
 */

public class ObjectMapper {

    private String text = "";
    private int count = 0;

    public ObjectMapper(){

    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public void increment(){
        this.count ++;
    }

    public int count(){
        return count;
    }
}
