import java.util.LinkedHashMap;
import java.util.Map;

public class Collection {

public static void main (String... args){

    Map<String, String> allInfo = new LinkedHashMap<>();

    allInfo.put("Street Address", "2342 Main Street");
    allInfo.put("City", "Santa Clarita");
    allInfo.put("State", "CA");
    allInfo.put("Zip", "91387");

    System.out.println((allInfo.values()));


}
}
