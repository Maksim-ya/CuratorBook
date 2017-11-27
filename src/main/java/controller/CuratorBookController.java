package controller;


import model.CuratorBook;
import service.LocalService;
import view.Menu;


import java.util.Scanner;

public class CuratorBookController {
    private Menu menu=new Menu();
    private Scanner in= new Scanner(System.in);
    private LocalService localService=new LocalService();
    private  CuratorBook curatorBook = new CuratorBook();


    public  void run() {
        localService.changeLocal(chooseLanguage(menu,in));
        curatorBook.addNote();
        chooseAction();
    }

    public String chooseLanguage(Menu menu,Scanner in) {
        menu.showLangMenu();
        String language = in.nextLine();
        return  language;

    }
    public void chooseAction(){
        menu.showMainMenu();
        Byte choise = in.nextByte();
        switch (choise) {
            default:
               Menu.printMenu(menu.WRONG_ENTER);
                break;
            case 1:
               Menu.printCuratorBook();
                break;
            case 2:
                break;
            case 3:
                System.exit(1);
                break;
        }
    }
}
