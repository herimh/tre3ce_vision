package com.tre3ce.tre3ce_vision.Mappers;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heriberto on 30/08/17.
 */

public class ElectorKeyMapper {
    List<ObjectMapper> electorKeys = new ArrayList<>();

    public void add(String name){
            for (int i=0; i<electorKeys.size(); i++){
                if (electorKeys.get(i).getText().equals(name)){
                    electorKeys.get(i).increment();
                    return;
                }
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setText(name);
            objectMapper.increment();

            electorKeys.add(objectMapper);
    }

    public String getBestOption(){
        String text = "";
        int count = 0;

        for (int i=0; i<electorKeys.size(); i++){
            Log.d("EKEY", electorKeys.get(i).getText()+" - "+String.valueOf(electorKeys.get(i).count()));

            if (electorKeys.get(i).getText().length() == 18){
                if (text.length()< 18 || (text.length() == 18 && electorKeys.get(i).count() >= count)){
                    text = electorKeys.get(i).getText();
                    count = electorKeys.get(i).count();
                }
            }else {
                if (text.length() != 18 && electorKeys.get(i).count() >= count){
                    text = electorKeys.get(i).getText();
                    count = electorKeys.get(i).count();
                }
            }
        }

        return text;
    }
}
