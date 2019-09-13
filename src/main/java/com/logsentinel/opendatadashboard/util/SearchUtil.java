package com.logsentinel.opendatadashboard.util;

import com.logsentinel.opendatadashboard.data.Record;

import java.lang.reflect.Field;

public class SearchUtil {

    public static boolean fits(Record record, String keyWord){

        if(keyWord.equals("")){
            return true;
        }
        for (String kw : keyWord.toLowerCase().split(" ")) {
            if(record.getAction().toLowerCase().contains(kw)){return true;}
            if(record.getActorDisplayName().toLowerCase().contains(kw)){return true;}
            if(record.getDetails().toLowerCase().contains(kw)){return true;}
            if(record.getId().toLowerCase().contains(kw)){return true;}
        }

        return false;
    }


}