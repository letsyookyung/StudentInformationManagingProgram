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
        PutOperation put = new PutOperation();
        ModifyOperation modify = new ModifyOperation();
        RemoveOperation remove = new RemoveOperation();
        SearchOperation search = new SearchOperation();
        PrintOperation print = new PrintOperation();

        while (!exitFlag) {

            System.out.println(PrintTextFormat.menuForm);
            operation = sc.nextLine();

            switch (operation) {
                case "0":
                    exitFlag = true;
                    break;
                case "1":
                    // name
                    name = getValidationList("name");
                    if (name == null) {break;}

                    boolean isEmpty = put.checkDuplicate(name);
                    if (!isEmpty) {
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
                    put.put(name, infoList);
                    break;
                case "2":
                    System.out.println(modifyPrintFormat.askName);
                    name = getValidationList("name");
                    if (name == null) {break;}
                    System.out.println(modifyPrintFormat.askField);
                    field = sc.nextLine();
                    System.out.println(modifyPrintFormat.askHow);
                    value = sc.nextLine();

                    modify.modify(name, field, value);
                    break;
                case "3":
                    System.out.println(removePrintFormat.askName);
                    name = getValidationList("name");
                    if (name == null) {break;}
                    remove.remove(name);
                    break;
                case "4":
                    System.out.println(searchPrintFormat.askField);
                    field = sc.nextLine();

                    switch (field) {
                        case ("1"):
                            value = getValidationList("name");
                            if (value == null) {break;}
                        case ("2"):
                            value = getValidationList("phoneNumber");
                            if (value == null) {break;}
                        case ("3"):
                            value = getValidationList("address");
                            if (value == null) {break;}
                        case ("4"):
                            value = getValidationList("email");
                            if (value == null) {break;}
                        case ("5"):
                            value = getValidationList("finalGrade");
                            if (value == null) {break;}
                    }
                    search.search(field, value);
                    break;
                case "5":
                    print.printAll();

                    System.out.println(printPrintFormat.askField);
                    operation = sc.nextLine();

                    if (operation.toLowerCase().contains("q")) {
                        exitFlag = true ;
                    } else {
                        print.printOption(operation);
                    }
            }


        }

    }

}

