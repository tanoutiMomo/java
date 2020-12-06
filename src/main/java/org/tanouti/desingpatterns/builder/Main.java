package org.tanouti.desingpatterns.builder;

public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile.MobileBuilder("samsung", "s8")
                        .setCameraPixel(50)
                        .setEnabled5G(true)
                        .setRam(200)
                        .setTouchScreenAvailable(true)
                        .build();
        mobile.printDetails();
    }
}
