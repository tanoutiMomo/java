package org.tanouti.oop.basics.polymorphism;

public abstract class UIControl {

    public void enable() {
        System.out.println(this.toString() + "Enabled");
    }

    public abstract void draw();
}
