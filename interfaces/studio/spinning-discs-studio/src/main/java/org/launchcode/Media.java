package org.launchcode;

import java.util.ArrayList;

public abstract class Media extends BaseDisc implements Rewritable {

    private double capacity;
    private final ArrayList<File> files = new ArrayList<>();

    public Media(String name, String discType, int spinRate, double capacity) {
        super(name, discType, spinRate);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Capacity: " + capacity + " MB" + newline +
                "Space Used: " + getSpaceUsed() + " MB" + newline +
                "Available Space: " + getSpaceAvailable() + " MB" + newline;
    }


        public String getFormattedFileList (String header){
            StringBuilder fileList = new StringBuilder();
            String newline = System.lineSeparator();
            if (!files.isEmpty()) {
                fileList.append(newline).append(header).append(":");
                for (File file : files) {
                    fileList.append(newline).append("\t").append(file);
                }
            }
            return fileList.toString();
        }
        public boolean fileIsPresent (File file){
            if (getFiles().contains(file)) {
                return true;
            } else {
                System.out.println("The file does not exist on this " + getDiscType() + ".");
                return false;
            }
        }

         public String getSpaceUsed() {
             StringBuilder total = new StringBuilder(String.valueOf(0));
             for (File file : files) {
                 total.append(file.getSize());

             }
             return total.toString();
         }

            public double getSpaceAvailable () {
            if (capacity == 0) return 0;
            return capacity;

        }
    }
