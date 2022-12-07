import java.util.HashMap;
import java.util.List;

public class ModifyOperation {

    public static void modify(String name, String field, String value){
        String priorValue = null;
        int index =0;

        switch (field) {
            case "전화번호":
                priorValue = InfoDataBase.allStudentInfo.get(name).get(0);
                break;
            case "집주소":
                priorValue = InfoDataBase.allStudentInfo.get(name).get(1);
                index =1;
                break;
            case "이메일":
                priorValue = InfoDataBase.allStudentInfo.get(name).get(2);
                index =2;
                break;
            case "기말성적":
                priorValue = InfoDataBase.allStudentInfo.get(name).get(3);
                index =3;
                break;
        }
        InfoDataBase.allStudentInfo.get(name).set(index, value);
        modifyPrintFormat.success(field, priorValue, value);
    }


}
