package org.launchcode;

public class File {

    private final String name;
    private final String size;

    public File(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return name + " - " + size + " MB";

    }
}
