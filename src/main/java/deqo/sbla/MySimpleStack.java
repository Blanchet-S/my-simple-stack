package deqo.sbla;

import java.util.EmptyStackException;

/**
 * Created by 21200697 on 04/11/2016.
 * un commentaire répondant a léxigence #3
 */
public class MySimpleStack implements SimpleStack {
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
