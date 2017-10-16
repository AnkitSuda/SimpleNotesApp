package example.androidgrid.simplenotesapp;

/**
 * Created by SUDA on 08-09-2017.
 */

public class NoteModel {

    public String noteTitle;
    public String noteTime;

    public NoteModel() {

    }

    public NoteModel(String noteTitle, String noteTime) {
        this.noteTitle = noteTitle;
        this.noteTime = noteTime;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(String noteTime) {
        this.noteTime = noteTime;
    }
}
