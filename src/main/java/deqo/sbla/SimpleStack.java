package deqo.sbla;

import deqo.sbla.Item;

import java.util.EmptyStackException;

/**
 * Created by 21200697 on 04/11/2016.
 */
public interface SimpleStack {
    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}
