package org.launchcode;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    private final ArrayList<MenuItem> MenuItems = new ArrayList<>();
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return MenuItems;
    }
}

