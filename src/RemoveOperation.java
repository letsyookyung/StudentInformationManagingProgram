public class RemoveOperation {

    public static void remove(String name) {
        InfoDataBase.allStudentInfo.remove(name);
        removePrintFormat.success(name);
    }
}
