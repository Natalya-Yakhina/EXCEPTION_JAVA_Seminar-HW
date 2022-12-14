package HW.HW3;

import HW.HW3.WrongException.WrongLoginException;
import HW.HW3.WrongException.WrongPasswordException;

import java.util.Scanner;

public class main {
    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        inputData();
        //        registration();
    }

    public static void inputData() throws WrongLoginException, WrongPasswordException {
        System.out.println("Введите логин: ");
        System.out.println("*** логин может содержать только латинские буквы, цифры и знак подчеркивания!");
        System.out.println("*** длинна логина не более 20 символов!");
        System.out.println("Ввод логин: ");
        String login = iScanner.nextLine();
        checkDataLogin(login);

        System.out.println("Введите пароль: ");
        System.out.println("*** пароль может содержать только латинские буквы, цифры и знак подчеркивания!");
        System.out.println("*** длинна пароля не более 20 символов!");
        System.out.println("Ввод пароль: ");
        String password = iScanner.nextLine();
        checkDataPassword(password);

        System.out.println("Подтвердите пароль: ");
        String confirmPassword = iScanner.nextLine();
        checkConfirmPas(password, confirmPassword);
        iScanner.close();
        System.out.println("Регистрация прошла успешно:))");
    }

    private static void checkDataLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Превышено количество символов(max = 20)");
        }
        if (!login.matches("(\\w+\\d+)|(\\d+\\w+)")) { // \w - любая цифра, буква, знак нижнего подчёркивания \d — цифра [0-9]
            throw new WrongLoginException("Логин содержит недопустимые значения");
        }
    }

    private static void checkDataPassword(String password) throws WrongPasswordException {
        if (password.length() > 20) {
            throw new WrongPasswordException("Превышено количество символов(max = 20)");
        }
        if (!password.matches("(\\w+\\d+)|(\\d+\\w+)")) { // \w - любая цифра, буква, знак нижнего подчёркивания \d — цифра [0-9]
            throw new WrongPasswordException("Пароль содержит недопустимые значения");
        }
    }

    private static void checkConfirmPas(String password, String confirmPassword) throws WrongPasswordException {
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Введенные пароли не совпадают!");
        }
    }
}

//    public static boolean registration() {
//        try {
//            inputData();
//            System.out.println("Регистрация успешно прошла)");
//            return true;
//        } catch (WrongLoginException | WrongPasswordException e) {
//            System.out.println(e.getMessage());
//            return false;
//        }
//    }
//}
