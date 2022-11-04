package hacs;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Heli Vachhani
 * @version 1.0
 */

import java.util.*;

public class ListIterator implements Iterator<Object> {
    private ArrayList<Object> theList;
    private int currentNumber = -1;

    public ListIterator() {

    }

    public ListIterator(ArrayList<Object> list) {
        theList = list;
    }

    public ArrayList<Object> getTheList() {
        return theList;
    }

    @Override
    public boolean hasNext() {
        return currentNumber < theList.size() - 1;
    }

    @Override
    public Object next() {
        if (hasNext() == true) {
            currentNumber++;
            return theList.get(currentNumber);
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        theList.remove(currentNumber);
    }
}