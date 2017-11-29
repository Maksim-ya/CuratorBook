package model;


public class CuratorBook {
    private static Note [] curatorBook = new Note[40];

    public Note[] getCuratorBook() {
        return curatorBook;
    }
    int cursor=-1;

    public void addNewNote(Note note){
        curatorBook[++cursor]=note;
    }


}
