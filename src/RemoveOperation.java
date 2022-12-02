public class RemoveOperation {

    public void remove(String name) {
        InfoDataBase.allStudentInfo.remove(name);
        removePrintFormat.success(name);
    }
}
