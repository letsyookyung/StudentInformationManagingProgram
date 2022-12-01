import java.util.HashMap;
import java.util.List;

public class PutOperation {

    public boolean checkDuplicate(String name) {
        if (InfoDataBase.AllStudentInfo.containsKey(name)) {
            return false;
        }
        return true;
    }

    public void put(String name, List<String> infoList) {
        InfoDataBase.AllStudentInfo.put(name, infoList);
        System.out.println(putPrintFormat.success);
        System.out.printf("%s : %s", name, InfoDataBase.AllStudentInfo.get(name));

    }



}
