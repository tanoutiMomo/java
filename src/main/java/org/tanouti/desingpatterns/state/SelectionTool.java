package org.tanouti.desingpatterns.state;


public class SelectionTool implements ITool {


    @Override
    public void mouseUp() {
        System.out.println("selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a rush rectangle");
    }
}
