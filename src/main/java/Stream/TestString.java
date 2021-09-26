package Stream;

public class TestString {
    public static void main(String[] args) {
        String a = new String("jcbdhbcasjkncjabskcnajsbhasbchydbasjxbashasnajksba");
        String[] array = a.split("a");
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
           sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
