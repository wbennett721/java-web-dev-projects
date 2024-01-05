package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
    CD allEyesOnMe = new CD( "All Eyes on Me", true);
    CD invasionOfPrivacy = new CD( "Invasion of Privacy", true);
    DVD greysAnatomySeason1 = new DVD( "Greys Anatomy: Season 1");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        allEyesOnMe.spinDisc();
        invasionOfPrivacy.spinDisc();
        greysAnatomySeason1.spinDisc();

        System.out.println(allEyesOnMe);
        System.out.println(invasionOfPrivacy);
        System.out.println(greysAnatomySeason1);
    }
}