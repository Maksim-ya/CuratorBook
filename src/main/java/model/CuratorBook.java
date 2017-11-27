package model;


public class CuratorBook {
    private static Note [] curatorBook = new Note[40];

    public Note[] getCuratorBook() {
        return curatorBook;
    }

    public void addNote(){
        Note note0 = new Note("Sidorov", "Petia","01-01-2000",
                "067484853","frunze");
        Note note1 = new Note("Sidorov", "Petia","01-01-2000",
                "067484853","frunze");
        curatorBook[1]=note1;
        curatorBook[0]=note0;
    }


}
