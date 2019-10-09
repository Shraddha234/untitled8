package main;

import java.util.Scanner;

public class LED {
    private String colour_name;
    private boolean working;
    public LED(String colour_name,boolean working){
        this.colour_name=colour_name;
        this.working=working;
    }

    public String getColour_name() {
        return colour_name;
    }

    public boolean isWorking() {
        return working;
    }

    public void setColour_name(String colour_name) {
        this.colour_name = colour_name;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

}
