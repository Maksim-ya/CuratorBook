package controller;


import model.CuratorBook;
import model.Note;
import service.LocalService;
import view.Menu;

import java.util.Scanner;

public class CuratorBookController {
    private Menu menu = new Menu();
    private Scanner in = new Scanner(System.in);
    private LocalService localService = new LocalService();
    private CuratorBook curatorBook = new CuratorBook();
    private boolean b;


    public void run() {
        localService.changeLocal(chooseLanguage(menu, in));
        while (b=true) {
            chooseAction();
        }
    }

    public String chooseLanguage(Menu menu, Scanner in) {
        menu.showLangMenu();
        String language = in.next();
        in.nextLine();
        return language;

    }

    public void chooseAction() {
        menu.showMainMenu();
        int choise = in.nextInt();
        switch (choise) {
            default:
                Menu.printMenu(menu.WRONG_ENTER);
                break;
            case 1:
                Menu.printCuratorBook();
                break;
            case 2:
                addNote();
                break;
            case 3:
                System.exit(1);
                break;
            case 4:
                b=false;
                run();

        }
    }

    private void addNote() {
        String lastName = addLastName();
        String firstName = addFirstName();
        String birthDay = addBirthDay();
        String address = addAddress();
        String phoneNumber = addPhoneNumber();
        Note note = new Note(lastName, firstName, birthDay,
                address, phoneNumber);
        curatorBook.addNewNote(note);
        System.out.println("You successfully added new student in book.");
    }

    private String addPhoneNumber() {
        String phoneNumber;
        while (true) {
            Menu.printMenu(menu.ENTER_PHONENUMBER);
            phoneNumber = in.next();
            in.nextLine();
            if (!phoneNumber.matches(localService.getString(menu.PHONENUMBER_PATTERN))) {
                Menu.printMenu(menu.WRONG_ENTER);
            } else
                break;
        }
        return phoneNumber;
    }

    private String addAddress() {
        String address;
        while (true) {
            Menu.printMenu(menu.ENTER_ADDRESS);
            address = in.next();
            in.nextLine();
            if (!address.matches(localService.getString(menu.ADDRESS_PATTERN))) {
                Menu.printMenu(menu.WRONG_ENTER);
            } else
                break;
        }
        return address;
    }

    private String addBirthDay() {
        String birthDay;
        while (true) {
            Menu.printMenu(menu.ENTER_BIRTHDAY);
            birthDay = in.next();
            in.nextLine();
            if (!birthDay.matches(localService.getString(menu.BIRTHDAY_PATTERN))) {
                Menu.printMenu(menu.WRONG_ENTER);
            } else
                break;
        }
        return birthDay;
    }

    private String addFirstName() {
        String firstName;
        while (true) {
            Menu.printMenu(menu.ENTER_STUDENT_FIRSTNAME);
            firstName = in.next();
            in.nextLine();
            if (!firstName.matches(localService.getString(menu.FIRSTNAME_PATTERN))) {
                Menu.printMenu(menu.WRONG_ENTER);
            } else
                break;
        }
        return firstName;
    }

    public String addLastName() {
        String lastName;
        while (true) {
            Menu.printMenu(menu.ENTER_STUDENT_LASTNAME);
            lastName = in.next();
            in.nextLine();
            if (!lastName.matches(localService.getString(menu.LASTNAME_PATTERN))) {
                Menu.printMenu(menu.WRONG_ENTER);
            } else
                break;
        }
        return lastName;
    }
}
