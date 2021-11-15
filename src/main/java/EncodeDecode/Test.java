package EncodeDecode;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String test = "颜锋";
        String db = Base64.encodeBase64String(test.getBytes( "utf-8" ));
        System.out.println("test" + db);
        System.out.println(new String(Base64.decodeBase64(db.getBytes()), "utf-8" ));
    }
}
