package com.amanbatra.restaurant_ecom.models;



public class Item extends Team {
    private String title;
    private String message;
    private Team team;

    public Item(Team team, String title, String message) {
        this.title = title;
        this.message = message;
        this.team=team;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
    public Team getTeam()
    {
        return team;
    }
}
