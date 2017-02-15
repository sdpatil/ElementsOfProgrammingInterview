package com.eip.chapter11;

import java.util.*;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class KClosestStars {
    private static class Star implements Comparable<Star>{
        private double x, y, z;

        public Star(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distance(){
            return Math.sqrt( x* x  + y*y + z*z);
        }

        public int compareTo(Star o) {
            return Double.compare(this.distance(), o.distance());
        }
    }

    public List<Star> findClosestKStars(int k, Iterator<Star> stars){
        PriorityQueue<Star> maxHeap = new PriorityQueue<Star>(k, Collections.<Star>reverseOrder());
        while(stars.hasNext()){
            Star star = stars.next();
            maxHeap.add(star);
            if(maxHeap.size() == k+1)
                maxHeap.remove();
        }

        List<Star> orderedStars = new ArrayList<Star>(maxHeap);
        Collections.sort(orderedStars);
        return orderedStars;
    }
}
