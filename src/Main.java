import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    static List<String> validationList = null;
    static boolean exitFlag = false;
    static String  operation=null, name=null, phoneNumber = null, address = null, email = null, finalGrade = null;
    static String field, value = null;


    public static String getValidationList(String field) {

        validationList = putPrintFormat.isValidData(2, field);
        if (!Boolean.parseBoolean(validationList.get(0))) {
            return value = null;
        } else {
            value = validationList.get(1);
            return value;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (!exitFlag) {

            System.out.println(CommonUse.menuForm);
            operation = sc.nextLine();

            switch (operation) {
                case "0":
                    exitFlag = true;
                    break;
                case "1":
                    // name
                    name = getValidationList("name");
                    if (name == null) {break;}

                    if (PutOperation.checkDuplicate(name)) {
                        System.out.println(putPrintFormat.alreadyExist);
                        break;}

                    // phone number
                    phoneNumber = getValidationList("phoneNumber");
                    if (phoneNumber == null) {break;}

                    // address
                    address = getValidationList("address");
                    if (address == null) {break;}

                    //email
                    email = getValidationList("email");
                    if (email == null) {break;}

                    //grade
                    finalGrade = getValidationList("finalGrade");
                    if (finalGrade == null) {break;}

                    List<String> infoList = new ArrayList<>(Arrays.asList(phoneNumber, address, email, finalGrade));
                    PutOperation.put(name, infoList);
                    break;
                case "2":
                    System.out.println(modifyPrintFormat.askName);
                    name = getValidationList("name");
                    if (name == null) {break;}

                    if (!PutOperation.checkDuplicate(name)) {
                        System.out.println(putPrintFormat.retryName);
                        break;}

                    System.out.println(modifyPrintFormat.askField);
                    field = sc.nextLine();

                    if (!modifyPrintFormat.keyWordCheckList.contains(field)) {
                        System.out.println(modifyPrintFormat.retry);
                        break;
                    }

                    System.out.println(modifyPrintFormat.askHow);
                    value = sc.nextLine();

                    ModifyOperation.modify(name, field, value);
                    break;
                case "3":
                    System.out.println(removePrintFormat.askName);
                    name = getValidationList("name");
                    if (name == null) {break;}

                    if (!PutOperation.checkDuplicate(name)) {
                        System.out.println(putPrintFormat.retryName);
                        break;}

                    RemoveOperation.remove(name);
                    break;
                case "4":
                    System.out.println(searchPrintFormat.askField);
                    field = sc.nextLine();

                    switch (field) {
                        case ("이름"):
                            value = getValidationList("name");
                            if (value == null) {break;}

                            if (!PutOperation.checkDuplicate(name)) {
                                System.out.println(putPrintFormat.retryName);
                                break;}

                            break;
                        case ("전화번호"):
                            value = getValidationList("phoneNumber");
                            if (value == null) {break;}
                            break;
                        case ("집주소"):
                            value = getValidationList("address");
                            if (value == null) {break;}
                            break;
                        case ("이메일"):
                            value = getValidationList("email");
                            if (value == null) {break;}
                            break;
                        case ("성적"):
                            value = getValidationList("finalGrade6️⃣");
                            if (value == null) {break;}
                            break;
                    }
                    SearchOperation.search(field, value);
                    break;
                case "5":
                    PrintOperation.printAll();

                    System.out.println(printPrintFormat.askField);
                    operation = sc.nextLine();

                    if (operation.toLowerCase().contains("q")) {
                        break;
                    } else {
                        PrintOperation.printOption(operation);
                    }
            }


        }

    }

}

