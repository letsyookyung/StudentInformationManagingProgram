import java.util.HashMap;
import java.util.List;

public class ModifyOperation {

    public void modify(String name, String field, String value){
        String priorValue;

        switch (field) {
            case "전화번호":
                priorValue = InfoDataBase.AllStudentInfo.get(name).get(0);
                InfoDataBase.AllStudentInfo.get(name).set(0, value);
                System.out.printf("\n변경 완료!\n%s : %s -> %s", field, priorValue, value);
                break;
            case "집주소":
                priorValue = InfoDataBase.AllStudentInfo.get(name).get(1);
                InfoDataBase.AllStudentInfo.get(name).set(1, value);
                System.out.printf("\n변경 완료!\n%s : %s -> %s", field, priorValue, value);
                break;
            case "이메일":
                priorValue = InfoDataBase.AllStudentInfo.get(name).get(2);
                InfoDataBase.AllStudentInfo.get(name).set(2, value);
                System.out.printf("\n변경 완료!\n%s : %s -> %s", field, priorValue, value);
                break;
            default:
                System.out.println("\n변경하고자 하는 항목을 정확히 입력해주세요.");
        }
    }


}
