package com.example.projetcv.ui.stage;

public class StageItem {


    String Ste,Content,Date;
    int userPhoto;

    public StageItem() {
    }


    public StageItem(String Stee, String content, String date, int userPhoto) {
        Ste = Stee;
        Content = content;
        Date = date;
        this.userPhoto = userPhoto;
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

    public void setUserPhoto(int userPhoto) {
        this.userPhoto = userPhoto;
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

    public int getUserPhoto() {
        return userPhoto;
    }
}
