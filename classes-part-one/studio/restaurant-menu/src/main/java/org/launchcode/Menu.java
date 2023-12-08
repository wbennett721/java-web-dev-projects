package org.launchcode;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}

