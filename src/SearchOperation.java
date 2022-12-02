import java.util.ArrayList;
import java.util.List;

public class SearchOperation {

    public void search(String field, String value) {

        if (field.contains("1")) {
            searchPrintFormat.success(value);
            InfoDataBase.allStudentInfo.get(value).forEach(System.out::println);
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
