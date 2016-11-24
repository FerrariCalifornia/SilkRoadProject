package com.cc.utility;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
public class MongoConn {
    public static void main(String[] args){
//        conn("logs");
    }

    public   MongoCollection<Document> conn(String mongodbTableName){
        try{
            // 杩炴帴鍒� mongodb 鏈嶅姟
            @SuppressWarnings("resource")
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // 杩炴帴鍒版暟鎹簱
            MongoDatabase mongoDatabase = mongoClient.getDatabase("Test");
            System.out.println("Connect to MongoDB successfully");
            MongoCollection<Document> collection = mongoDatabase.getCollection(mongodbTableName);
//            List<Document> foundDocument = collection.find().into(new ArrayList<Document>());
            return collection;
//            for (Document d: foundDocument
//                 ) {
//            System.out.println(d.get("ip")+"  "+d.get("res_type"));
//            }
        }catch(Exception e){

            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            return null;
        }
    }
}
