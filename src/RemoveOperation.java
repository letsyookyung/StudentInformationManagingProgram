public class RemoveOperation {

    public void remove(String name) {
        InfoDataBase.AllStudentInfo.remove(name);
        System.out.printf("\n%s 정보 삭제 완료! 다음에 만나요.", name);
    }
}
