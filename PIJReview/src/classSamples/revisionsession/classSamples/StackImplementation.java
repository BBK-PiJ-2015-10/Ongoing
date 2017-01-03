package classSamples.revisionsession.classSamples;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackImplementation<E> implements Stack1<E> {

    private ArrayList<E> stack;

    public StackImplementation() {
        stack = new ArrayList<E>();
    }

    public void push(E obj) {
        stack.add(obj);
    }

    public E pop() {
        if (stack.isEmpty())
            throw new EmptyStackException();
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public E peek() {
        E item = pop();
        push(item);
        return item;
    }
	
}
