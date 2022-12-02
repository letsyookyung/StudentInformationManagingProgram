import java.util.HashMap;
import java.util.List;

public class PutOperation {

    public boolean checkDuplicate(String name) {
        if (InfoDataBase.allStudentInfo.containsKey(name)) {
            return false;
        }
        return true;
    }

    public void put(String name, List<String> infoList) {
        InfoDataBase.allStudentInfo.put(name, infoList);
        System.out.println(putPrintFormat.success);
        System.out.printf("%s : %s", name, InfoDataBase.allStudentInfo.get(name));

    }



}
