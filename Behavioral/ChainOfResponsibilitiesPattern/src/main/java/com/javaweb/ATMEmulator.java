package com.javaweb;


public class ATMEmulator {
    public static void main(String[] args) {
        NoteModule note10 = new Note10();
        NoteModule note20 = new Note20();
        NoteModule note50 = new Note50();
        NoteModule note100 = new Note100();
        NoteModule note200 = new Note200();

        note200.setNextModule(note100);
        note100.setNextModule(note50);
        note50.setNextModule(note20);
        note20.setNextModule(note10);

        note200.calculateMoney(410543);

    }

}

class Note {
    public static final int U10 = 10;
    public static final int U20 = 20;
    public static final int U50 = 50;
    public static final int U100 = 100;
    public static final int U200 = 200;
}

abstract class NoteModule {
    protected NoteModule next;

    public void setNextModule(NoteModule next) {
        this.next = next;
    }

    public abstract void calculateMoney(int money);

}

class Note10 extends NoteModule {

    public void calculateMoney(int money) {
        int count = money / Note.U10;
        int remind = money % Note.U10;
        if(count > 0){
            System.out.println("You have " + count + " notes of " + Note.U10 + " hruvnyas");
        }
        if(remind > 0 && next!= null){
            next.calculateMoney(remind);
        }
    }
}

class Note20 extends NoteModule {
    public void calculateMoney(int money) {
        int count = money / Note.U20;
        int remind = money % Note.U20;
        if(count > 0){
            System.out.println("You have " + count + " notes of " + Note.U20 + " hruvnyas");
        }
        if(remind > 0 && next!= null){
            next.calculateMoney(remind);
        }
    }
}

class Note50 extends NoteModule {
    public void calculateMoney(int money) {
        int count = money / Note.U50;
        int remind = money % Note.U50;
        if(count > 0){
            System.out.println("You have " + count + " notes of " + Note.U50 + " hruvnyas");
        }
        if(remind > 0 && next!= null){
            next.calculateMoney(remind);
        }
    }
}

class Note100 extends NoteModule {
    public void calculateMoney(int money) {
        int count = money / Note.U100;
        int remind = money % Note.U100;
        if(count > 0){
            System.out.println("You have " + count + " notes of " + Note.U100 + " hruvnyas");
        }
        if(remind > 0 && next!= null){
            next.calculateMoney(remind);
        }
    }
}

class Note200 extends NoteModule {
    public void calculateMoney(int money) {
        int count = money / Note.U200;
        int remind = money % Note.U200;
        if(count > 0){
            System.out.println("You have " + count + " notes of " + Note.U200 + " hruvnyas");
        }
        if(remind > 0 && next!= null){
            next.calculateMoney(remind);
        }
    }
}
