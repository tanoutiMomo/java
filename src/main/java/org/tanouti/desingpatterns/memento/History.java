package org.tanouti.desingpatterns.memento;

import java.util.Stack;

public class History {

    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public  EditorState pop() {
        return states.pop();
    }
}
