import java.util.*;

import static java.lang.String.valueOf;

public class PrintOperation {

    public void printAll() {
        System.out.println(printPrintFormat.field);
        iterateMap(InfoDataBase.allStudentInfo);
    }


    public void printOption(String option) {

        String option1, option2 ;

        try {
            option1 = option.split("-")[0];
            option2 = option.split("-")[1];

            System.out.println(printPrintFormat.field);
            switch (option1) {
                case "이름":
                    if (option2.equals("a")) {
                        Map<String, List<String>> sortedMap = new TreeMap<>(InfoDataBase.allStudentInfo);
                        iterateMap(sortedMap);
                    } else {
                        Map<String, List<String>> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
                        reverseSortedMap.putAll(InfoDataBase.allStudentInfo);
                        iterateMap(reverseSortedMap);
                    }
                    break;
                case "성적":

                    HashMap<String, List<String>> sortedMap = new LinkedHashMap<>();

                    List<String> list = new ArrayList<>();
                    for (Map.Entry<String, List<String>> entry : InfoDataBase.allStudentInfo.entrySet()) {
                        list.add(entry.getValue().get(1));
                    }
                    list.sort(new Comparator<String>() {
                        public int compare(String str, String str1) {
                            return (str).compareTo(str1);
                        }
                    });

                    if (!option2.equals("a")) {
                        list.sort(Collections.reverseOrder());
                    }

                    for (String str : list) {
                        for (Map.Entry<String, List<String>> entry : InfoDataBase.allStudentInfo.entrySet()) {
                            if (entry.getValue().get(1).equals(str)) {
                                sortedMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }

                    iterateMap(sortedMap);
            }

        } catch (Exception e) {
            System.out.println(printPrintFormat.retry);
        }
    }


    public static void iterateMap(Map<String, List<String>> map) {
        List<String> valueList;

        int i = 1;
        for (String key : map.keySet()) {
            valueList = InfoDataBase.allStudentInfo.get(key);
            String result2 = String.format("%-5s%-8s%-17s%-20s%-17s%-8s\n", valueOf(i), valueOf(key), valueOf(valueList.get(0)),
                    valueOf(valueList.get(1)), valueOf(valueList.get(2)), valueOf(valueList.get(3)));
            System.out.printf(result2);


            i += 1;
        }

    }

}

