import java.util.HashMap;
import java.util.List;


public class InfoDataBase {

     static HashMap<String, List<String>> AllStudentInfo = new HashMap<>();

     public static HashMap<String, List<String>> getDB(){
         return AllStudentInfo;
     }
    public static void update(HashMap<String, List<String>> map) {
        AllStudentInfo = map;
    }


}
