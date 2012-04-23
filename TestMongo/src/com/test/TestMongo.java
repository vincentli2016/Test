package com.test;

import java.net.UnknownHostException;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class TestMongo {
	
	
	public static void main(String[] args) {
		try {
			Mongo m = new Mongo("localhost");
			DB db = m.getDB("test");
			Set<String> colls = db.getCollectionNames();
			for(String s : colls) {
				System.out.println(s);
			}
			DBCollection coll = db.getCollection("foo");
			BasicDBObject doc = new BasicDBObject();
			doc.put("tf", 1222);
			doc.put("zze", 333);
			doc.put("ee", 44);
			coll.insert(doc);
			
			
			
//			DBCollection coll = db.getCollection("a");
//			
//			BasicDBObject doc = new BasicDBObject();
//			doc.put("a", 1222);
//			doc.put("a", 333);
//			doc.put("a", 44);
//			coll.insert(doc);
//			DBObject mydoc = coll.findOne();
//			System.out.println(mydoc);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
	}
}
