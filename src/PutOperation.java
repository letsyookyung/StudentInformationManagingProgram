import java.util.HashMap;
import java.util.List;

public class PutOperation {

    public static boolean checkDuplicate(String name) {
        return InfoDataBase.allStudentInfo.containsKey(name);
    }

    public static void put(String name, List<String> infoList) {
        InfoDataBase.allStudentInfo.put(name, infoList);
        System.out.println(putPrintFormat.success);
        System.out.printf("%s : %s", name, InfoDataBase.allStudentInfo.get(name));

    }



}
