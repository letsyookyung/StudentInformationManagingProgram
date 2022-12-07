import java.util.ArrayList;
import java.util.List;

public class SearchOperation {

    public static void search(String field, String value) {

        if (field.contains("1")) {
            if (!PutOperation.checkDuplicate(value)) {
                System.out.println(putPrintFormat.retryName);
            } else {
                searchPrintFormat.success(value);
                InfoDataBase.allStudentInfo.get(value).forEach(System.out::println);
            }
        } else {
            List<String> resultList = new ArrayList<>();
            for (String key : InfoDataBase.allStudentInfo.keySet()) {
                List<String> valueList = InfoDataBase.allStudentInfo.get(key);
                for (String checkValue : valueList) {
                    if (checkValue.equals(value)) {
                        resultList.add(key);
                    }
                }
            }
                System.out.println(resultList);
        }
    }

}

