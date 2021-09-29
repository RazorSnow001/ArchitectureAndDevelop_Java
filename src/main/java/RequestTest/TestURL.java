package RequestTest;

public class TestURL {
    /*how to append a url with string ? */
    public static void main(String[] args) {
        String PAGE_ID = "2";
        String provinceCode = "226";
        String body = "{\n" +
                "  \"pageId\":" + "\"" + PAGE_ID + "\"" + ",\n" +
                "  \"productCode\":" + "\"" + "500000050004" + "\"" + ",\n" +
                "  \"provinceCode\":" + "\"" + provinceCode + "\"" + ",\n" +
                "  \"orderType\":" + 1 + "\n" +
                "}";

        String test = "{\n" +
                "  \"pageId\":" + "\"" + PAGE_ID + "\"" + ",\n" +
                "  \"productCode\":" + "\"" + "500000050004" + "\"" + ",\n" +
                "  \"provinceCode\":" + "\"" + provinceCode + "\"" + ",\n" +
                "  \"orderType\":" + 1 + "\n" +
                "}";
        System.out.println(body);
    }
}
