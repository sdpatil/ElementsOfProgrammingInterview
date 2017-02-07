package com.eip.chapter6;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class Partitioner {

    public void partition(List<Levels> list, int levels) {
        Levels partition = Levels.values()[1];
        int smaller = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).ordinal() < partition.ordinal()) {
                Collections.swap(list, i, smaller++);
            }
        }
    }

    public void partition2(List<Levels> list, int levels) {
        int smaller = 0;

        for (int l = 1; l <= levels; l++) {
            Levels partition = Levels.values()[l];
            for (int i = smaller; i < list.size(); i++) {
                if (list.get(i).ordinal() < partition.ordinal()) {
                    Collections.swap(list, i, smaller++);
                }
            }
        }
    }
}
