import java.util.ArrayList;
import java.util.List;

public class SearchOperation {

    public void search(String field, String value) {

        if (field.contains("1")) {
            System.out.printf("- %s 의 정보: \n", value);
            InfoDataBase.AllStudentInfo.get(value).forEach(System.out::println);
        } else {
            List<String> resultList = new ArrayList<>();
            for (String key : InfoDataBase.AllStudentInfo.keySet()) {
                List<String> valueList = InfoDataBase.AllStudentInfo.get(key);
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
