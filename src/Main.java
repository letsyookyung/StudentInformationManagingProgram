import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PutOperation put = new PutOperation();
        ModifyOperation modify = new ModifyOperation();
        RemoveOperation remove = new RemoveOperation();
        SearchOperation search = new SearchOperation();
        PrintOperation print = new PrintOperation();
//        PrintTextFormat format = new PrintTextFormat(); //질문

        boolean exitFlag = false;
        String operation, name, phoneNumber, address, email;
        String field, value = null;


        while (!exitFlag) {

            System.out.println(PrintTextFormat.menuForm);

            operation = sc.nextLine();

            switch (operation) {
                case "0":
                    exitFlag = true;
                    break;
                case "1":
                    System.out.println(putPrintFormat.name);
                    name = sc.nextLine();

                    boolean isEmpty = put.checkDuplicate(name);
                    if (isEmpty) {
                        System.out.println(putPrintFormat.phoneNumber);
                        phoneNumber = sc.nextLine();
                        System.out.println(putPrintFormat.address);
                        address = sc.nextLine();
                        System.out.println(putPrintFormat.email);
                        email = sc.nextLine();

                        List<String> infoList = new ArrayList<>(Arrays.asList(phoneNumber, address, email));

                        put.put(name, infoList);
                    } else {
                        System.out.println(putPrintFormat.alreadyExist);
                    }
                    break;
                case "2":
                    System.out.println(modifyPrintFormat.askName);
                    System.out.println(modifyPrintFormat.name);
                    name = sc.nextLine();
                    System.out.println(modifyPrintFormat.askField);
                    field = sc.nextLine();
                    System.out.println(modifyPrintFormat.askHow);
                    value = sc.nextLine();

                    modify.modify(name, field, value);
                    break;
                case "3":
                    System.out.println(removePrintFormat.askName);
                    name = sc.nextLine();
                    remove.remove(name);
                    break;
                case "4":
                    System.out.println(searchPrintFormat.askField);
                    field = sc.nextLine();

                    switch (field) {
                        case ("1"):
                            System.out.println(searchPrintFormat.name);
                            value = sc.nextLine();
                            break;
                        case ("2"):
                            System.out.println(searchPrintFormat.phoneNumber);
                            value = sc.nextLine();
                            break;
                        case ("3"):
                            System.out.println(searchPrintFormat.address);
                            value = sc.nextLine();
                            break;
                        case ("4"):
                            System.out.println(searchPrintFormat.email);
                            value = sc.nextLine();
                            break;
                    }
                    search.search(field, value);
                    break;
                case "5":
                    print.printAll();

                    System.out.println(printPrintFormat.askField);
                    operation = sc.nextLine();

                    if (operation.toLowerCase().contains("q")) {
                        break;
                    } else {
                        print.printOption(operation);
                    }
                    break;
                default :
                    System.out.println(PrintTextFormat.retry);
            }


            }

    }

}

