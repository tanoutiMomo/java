package org.tanouti.oop.basics.inheritance;
// inheritance
// is mechanism for reusing code, all the common behavior have to be in common class.
// to avoid duplicate code on all these class

public class Main {

    public static void main(String[] args) {
        // textBox
        // Button
        // checkBox
        TextBox textBox = new TextBox();
        Button button = new Button();

        textBox.enable();
        button.disable();
        // enable()
        // focus()
        // setPosition()
    }


}
