import java.util.*;

public class CommonUse {

    public static String menuForm = "\n\n------------------\n" +
                                        " 메뉴의 번호 입력하세요.\n" +
                                        "  1. 학생 정보 등록\n" +
                                        "  2. 학생 정보 수정\n" +
                                        "  3. 학생 정보 삭제\n" +
                                        "  4. 학생 정보 검색\n" +
                                        "  5. 학생 정보 출력\n" +
                                        "  0. 프로그램  종료\n" +
                                        "------------------\n";

    public static String name = "➤➤➤ 이름 (ex.이유경):";
    public static String namePattern = "^[가-힣]{2,5}$";
    public static String phoneNumber = "➤➤➤ 전화번호 (ex. 010-6255-7065):";
    public static String phoneNumberPattern = "\\d{3}-\\d{4}-\\d{4}";
    public static String address = "➤➤➤ 집주소 (ex. 경기도 고양시 일산동구) :";
    public static String addressPattern = "^[가-힣]{1,5}\\s[가-힣]{1,5}\\s[가-힣]{1,5}$";

    public static String email = "➤➤➤ 이메일 : (ex. yookyung.lee@outlook.kr)";
    public static String emailPattern = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";

    public static String finalGrade = "➤➤➤ 기말 성적 : \nex. A+, A0, A- (단, A~D까지 입력 가능) ";
    public static String finalGradePattern = "[A-D+0-]{1,2}$";

    public static String retry = "\uD83D\uDE4F 형식에 맞춰 입력해주세요 \uD83D\uDE4F \n";

    public static String retryName = "\uD83D\uDE4F 해당하는 정보가 없습니다 \uD83D\uDE4F \n";

    static String nothing = "--------------------------------------------------------------------------------------";
    public static String field = String.format("%s\n%-5s%-8s%-15s%-20s%-20s%-8s\n%s", nothing, "번호", "이름", "전화번호", "집주소", "이메일", "성적", nothing);


    public static List<String> keyWordCheckList = new ArrayList<>(Arrays.asList("이름", "전화번호", "집주소", "이메일","성적", "a", "b"));

    public static List<String> isValidData(int iteration, String field) {

        Scanner sc = new Scanner(System.in);
        String input = null, pattern = null;

        for (int i = 0; i <= iteration; ++i) {

            switch (field) {
                case "name":
                    System.out.println(name);
                    pattern = namePattern;
                    break;
                case "phoneNumber":
                    System.out.println(phoneNumber);
                    pattern = phoneNumberPattern;
                    break;
                case "address":
                    System.out.println(address);
                    pattern = addressPattern;
                    break;
                case "email":
                    System.out.println(email);
                    pattern = emailPattern;
                    break;
                case "finalGrade":
                    System.out.println(finalGrade);
                    pattern = finalGradePattern;
                    break;
            }

            input = sc.nextLine();
            if (!input.matches(Objects.requireNonNull(pattern))) {
                System.out.println(retry);
            } else {
                return Arrays.asList("true", input);
            }
        }
    return Arrays.asList("false", input);
    }
}


class putPrintFormat extends CommonUse {

    public static String alreadyExist = "➤➤➤ 이미 등록되어 있는 이름입니다.\n";

    public static String success = "➤➤➤ 등록 완료! ";

}


class modifyPrintFormat extends CommonUse {

    public static String askName = "➤➤➤ 수정하고 싶은 학생의 이름을 입력하세요.";

    public static String askField = "➤➤➤ 전화번호/집주소/이메일/성적 중 어떤 항목을 수정하고 싶습니까?";

    public static String askHow = "➤➤➤ 어떻게 변경할까요?";

    public static void success(String field, String priorValue, String value) {
        System.out.printf("➤➤➤ 변경 완료! \n%s : %s -> %s", field, priorValue, value);
    }


}

class removePrintFormat extends CommonUse {

    public static String askName = "➤➤➤ 삭제하고 싶은 학생의 이름을 입력하세요.";

    public static void success(String name){
        System.out.printf("➤➤➤ %s 정보 삭제 완료! 다음에 만나요 \uD83D\uDC4B",name);
    }

}

class searchPrintFormat extends CommonUse {

    public static String askField = "➤➤➤ 이름/전화번호/집주소/이메일/성적 중 어떤 항목으로 검색 하고 싶은가요? \n(단, 이름 선택 시 관련 학생의 정보를 제공하지만, 이 외의 항목은 학생 이름을 제공합니다.)";

    public static void success(String value){
        System.out.printf("- %s 의 정보: ", value);
    }
}

class printPrintFormat extends CommonUse {

    public static String askField = "\n➤➤➤ 특정 필드 기준으로 정렬하여 보고 싶으면, 특정 필드와 정렬방법을 지정해주세요. 만약, 원하지 않는다면 Q를 눌러주세요." +
                                    "\nex) 이름-b (이름/성적 - a.오름차순 b.내림차순)";


}