package view;


import model.CuratorBook;
import service.LocalService;

public class Menu implements ILanguage, IComandMenu {

    private static CuratorBook curatorBook = new CuratorBook();
    private static LocalService localService = new LocalService();

    public static void print(String phrase) {
        System.out.println(phrase);
    }

    public static void printMenu(String phrase) {
        System.out.println(localService.getString(phrase));
    }

    public static void printCuratorBook() {
        print(ALL_STUDENTS);
        for (int i = 0; i < curatorBook.getCuratorBook().length; i++) {
            if (curatorBook.getCuratorBook()[i] != null)
                System.out.println(curatorBook.getCuratorBook()[i]);
        }
        System.out.println("_____________________________________________");
    }

    public void showLangMenu() {
        print(SelectEnglish);
        print(SelectUkranian);
        print(SelectRussian);
    }

    public void showMainMenu() {
        printMenu(WATCH_ALL_STUDENTS);
        printMenu(ADD_STUDENT);
        printMenu(EXIT);
        printMenu(SELECT_LANGUAGE);
    }
}
