import java.util.*;

import static java.lang.String.valueOf;

public class PrintOperation {

    public void printAll() {
        System.out.println(printPrintFormat.field);
        iterateMap(InfoDataBase.AllStudentInfo);
        }


    public void printOption(String option) {
        
        String option1 = null, option2 = null;

        try {
            option1 = option.split("-")[0];
            option2 = option.split("-")[1];
        } catch (Exception e) { System.out.println(printPrintFormat.retry);}


        switch (option1) {
            case "1":
                System.out.println(printPrintFormat.field);
                if (option2.equals("a")) {
                    Map<String, List<String>> sortedMap = new TreeMap<>(InfoDataBase.AllStudentInfo);
                    iterateMap(sortedMap);
                } else {
                    Map<String, List<String>> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
                    reverseSortedMap.putAll(InfoDataBase.AllStudentInfo);
                    iterateMap(reverseSortedMap);
                }
                break;

        }

    }

    public static void iterateMap(Map<String, List<String>> map) {
        List<String> valueList;

        int i = 1;
        for (String key : map.keySet()) {
            valueList = InfoDataBase.AllStudentInfo.get(key);
            String result2 = String.format("%-6s%-7s%-15s%-20s%-15s\n",valueOf(i), valueOf(key), valueOf(valueList.get(0)), valueOf(valueList.get(1)), valueOf(valueList.get(2)));
            System.out.printf(result2);


            i += 1;
        }

    }

}
