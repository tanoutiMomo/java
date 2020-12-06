package org.tanouti.desingpatterns.state;

public class BrushTool implements ITool {


    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("draw a line");
    }
}
