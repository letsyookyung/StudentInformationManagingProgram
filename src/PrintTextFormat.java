
public class PrintTextFormat {

    public static String menuForm = "\n\n------------------\n" +
                                        " 메뉴의 번호 입력하세요.\n" +
                                        "  1. 학생 정보 등록\n" +
                                        "  2. 학생 정보 수정\n" +
                                        "  3. 학생 정보 삭제\n" +
                                        "  4. 학생 정보 검색\n" +
                                        "  5. 학생 정보 출력\n" +
                                        "  0. 프로그램  종료\n" +
                                        "------------------\n";

    public static String name = ">>>>>>>>> 이름 :";
    public static String phoneNumber = ">>>>>>>>> 전화번호 :";
    public static String address = ">>>>>>>>> 집주소 :";
    public static String email = ">>>>>>>>> 이메일 :";

    public static String retry = ">>>>>>>>> 형식에 맞춰 입력해주세요.\n";

    static String nothing = "------------------------------------------------------------------------------";
    public static String field = String.format("%s\n%-5s%-8s%-15s%-20s%-15s\n%s",nothing, "번호", "이름", "전화번호", "집주소", "이메일", nothing);
}

class putPrintFormat extends PrintTextFormat {

    public static String alreadyExist = "이미 등록되어 있는 이름입니다.\n";

    public static String success = ">>>>>>>>> 등록 완료!";

}


class modifyPrintFormat extends PrintTextFormat {

    public static String askName = ">>>>>>>>> 수정하고 싶은 학생의 이름을 입력하세요.";

    public static String askField = ">>>>>>>>> 전화번호/집주소/이메일 중 어떤 항목을 수정하고 싶습니까?";

    public static String askHow = ">>>>>>>>> 어떻게 변경할까요?";

}

class removePrintFormat extends PrintTextFormat {

    public static String askName = ">>>>>>>>> 삭제하고 싶은 학생의 이름을 입력하세요.";


}

class searchPrintFormat extends PrintTextFormat {

    public static String askField = ">>>>>>>>> 어떤 항목으로 검색 하고 싶은가요? \n(1.이름 2.전화번호 3.집주소 4.이메일)";

}

class printPrintFormat extends PrintTextFormat {

    public static String askField = "\n>>>>>>>>> 특정 필드 기준으로 정렬하여 보고 싶으면, 특정 필드와 정렬방법을 지정해주세요. (ex. 1-a)" +
                                    "\n          (1.이름 2.성적 / a.오름차순 b.내림차순)" +
                                    "\n          만약, 원하지 않는다면 Q를 눌러주세요.";

}