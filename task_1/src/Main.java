import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        List<Map<String, String>> tabl1 = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("Name", "Kirill");
        map1.put("Age", "26");
        map1.put("Post", "Middle java dev");
        map1.put("Pay", "150000 rub");
        Map<String, String> map2 = new HashMap<>();
        map2.put("Name", "Vitaly");
        map2.put("Age", "28");
        map2.put("Post", "Senior java automation QA");
        map2.put("Pay", "2000$");
        Map<String, String> map3 = new HashMap<>();
        map3.put("Name", "Aleksand");
        map3.put("Age", "31");
        map3.put("Post", "junior functional tester");
        map3.put("Pay", "50000 rub");
        Map<String, String> map4 = new HashMap<>();
        map4.put("Name", "Dementy");
        map4.put("Age", "35");
        map4.put("Post", "dev-ops");
        map4.put("Pay", "1500$");
        tabl1.add(map1);
        tabl1.add(map2);
        tabl1.add(map3);
        tabl1.add(map4);
        for (Map<String, String> map : tabl1) {
            if (Integer.parseInt(map.get("Age")) < 30) {
                System.out.println(map.get("Name"));
            }
        }
        for (Map<String, String> map : tabl1) {
            if (map.get("Pay").contains("rub")) {
                System.out.println(map.get("Name"));
            }
        }
        int sumage = 0;
        int avg;
        for (Map<String, String> map : tabl1) {
            sumage += Integer.parseInt(map.get("Age"));
            }
        avg = sumage/tabl1.size();
        System.out.println(avg);
    }

    }
