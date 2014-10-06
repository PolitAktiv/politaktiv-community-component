package org.politaktiv.community.application;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.politaktiv.community.application.CommunityViewContainer;

public class CommunitySerializationUtil {
    
    
   public static CommunityViewContainer deserializeContainer( byte[] data) throws IOException, ClassNotFoundException {
        CommunityViewContainer c = null;
        if(data != null){
            ObjectInputStream ois = new ObjectInputStream( new ByteArrayInputStream(  data ) );
            c  = (CommunityViewContainer) ois.readObject();
            ois.close();
        }

        return c;
   }

    public static byte[] serializeContainer( CommunityViewContainer c ) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream( baos );
        oos.writeObject( c );
        oos.close();
        return  baos.toByteArray();
    }

}