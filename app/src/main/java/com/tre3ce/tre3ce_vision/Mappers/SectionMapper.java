package com.tre3ce.tre3ce_vision.Mappers;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heriberto on 30/08/17.
 */

public class SectionMapper {
    List<ObjectMapper> sections = new ArrayList<>();

    String text = "";
    int count = 0;

    public void add(String section){
        if (section.matches(".*\\d.*")) {
            for (int i=0; i<sections.size(); i++){
                if (sections.get(i).getText().equals(section)) {
                    sections.get(i).increment();
                    return;
                }
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setText(section);
            objectMapper.increment();
            sections.add(objectMapper);
        }
    }

    public String getBestOption(){
        for (int i=0; i<sections.size(); i++){
            Log.d("SECTION ITEM", sections.get(i).getText()+" - "+String.valueOf(sections.get(i).count()));

            if (sections.get(i).count() >= count){
                text = sections.get(i).getText();
                count = sections.get(i).count();
            }
        }

        return this.text;
    }
}
