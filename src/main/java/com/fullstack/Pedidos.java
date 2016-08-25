package com.fullstack;

import com.mongodb.*;
import com.mongodb.util.JSON;
import org.bson.types.ObjectId;

import javax.ws.rs.*;
import java.net.UnknownHostException;
import java.util.List;
import javax.ws.rs.core.Response;


/*
* Tutorial do mongo + java
* http://www.mkyong.com/tutorials/java-mongodb-tutorials/
*
* Tutorial JAX
* http://www.vogella.com/tutorials/REST/article.html
* */

@Path("/pedidos")
public class Pedidos
{

    @POST
    @Path("/")
    public Response insert( String json ) throws UnknownHostException {
        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        DB db = mongo.getDB("crud");
        DBCollection collection = db.getCollection("pedidos");

        DBObject dbObject = (DBObject) JSON.parse(json);

        collection.insert(dbObject);
        return Response.ok().entity(dbObject.toString()).type("application/json").build();
    }

    @GET
    @Path("/")
    public Response find() throws UnknownHostException {
        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        DB db = mongo.getDB("crud");
        DBCollection collection = db.getCollection("pedidos");

        DBCursor cursor = collection.find();
        List<DBObject> dbList = cursor.toArray();

        return Response.ok().entity(dbList.toString()).type("application/json").build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete( @PathParam("id") String id ) throws UnknownHostException {
        MongoClient mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("crud");
        DBCollection collection = db.getCollection("pedidos");
        
        BasicDBObject query = new BasicDBObject().append("_id", new ObjectId(id));
        DBObject removedObject = collection.findAndRemove(query);

        return Response.ok().entity(removedObject.toString()).type("application/json").build();
    }
}
