package com.example.projetcv.ui.evenement;

public class EventItem {


    String Ste,Content,Date;


    public EventItem() {
    }


    public EventItem(String Stee, String content, String date) {
        Ste = Stee;
        Content = content;
        Date = date;

    }

    public void setSte(String Ste) {
        Ste = Ste;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setDate(String date) {
        Date = date;
    }



    public String getSte() {
        return Ste;
    }

    public String getContent() {
        return Content;
    }

    public String getDate() {
        return Date;
    }


}
