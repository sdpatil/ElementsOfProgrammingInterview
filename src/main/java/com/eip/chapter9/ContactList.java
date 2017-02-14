package com.eip.chapter9;

import java.util.HashSet;
import java.util.List;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class ContactList {
    public List<String> names;

    ContactList(List<String> names){
        this.names = names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactList that = (ContactList) o;

        return new HashSet(names).equals(new HashSet(((ContactList) o).names));
    }

    @Override
    public int hashCode() {
        return new HashSet(names).hashCode();
    }
}
