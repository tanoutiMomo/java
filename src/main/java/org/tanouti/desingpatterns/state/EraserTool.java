package org.tanouti.desingpatterns.state;

public class EraserTool implements ITool {


    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }
}
