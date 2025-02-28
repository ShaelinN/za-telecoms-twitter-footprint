package GroupProject.WebInterface.controllers;

import GroupProject.WebInterface.model.Database;
import org.neo4j.driver.Record;

import java.util.HashMap;
import java.util.List;
/**
 * common location for queriers that need a count to obtain that count as a string out of the neo4j Records list
 * */
class CountHandler {
    public static String getCountFromTemplateKey(String templateKey, HashMap<String, Object> params){

        String result;

        try {
            List<Record> records = Database.instance().query(templateKey,params);
            result = records.get(0).get(0)+"";

        }
        catch (Exception e){
            e.printStackTrace();
            result = "-1";
        }

        return result;
    }}
