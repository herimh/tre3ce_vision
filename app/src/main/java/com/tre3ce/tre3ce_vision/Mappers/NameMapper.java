package com.tre3ce.tre3ce_vision.Mappers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heriberto on 30/08/17.
 */

public class NameMapper {
    List<ObjectMapper> names = new ArrayList<>();

    String text = "";
    int count = 0;

    public NameMapper(){

    }

    public void addName(String name){
        for (int i=0; i<names.size(); i++){
            if (names.get(i).getText().equals(name)){
                names.get(i).increment();

                return;
            }
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setText(name);
        objectMapper.increment();

        names.add(objectMapper);

    }

    public String[] getBestOption(){
        for (int i=0; i<names.size(); i++){
            if (names.get(i).count() >= count){
                this.text = names.get(i).getText();
                this.count = names.get(i).count();
            }
        }

        if (text.equals("")){
            return null;
        }

        return text.split("_");
    }
}
