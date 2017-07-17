package com.eip.chapter11;

import java.util.*;

/**
 * This question asks given billions of stars and their x,y,z distance from earth find 10 closest. You can find
 * how far a start is from earth using Math.sqrt( x* x  + y*y + z*z).
 *
 * Basic issue is to make sure that you dont run out of RAM, so we read one star value at a time insert it into PQ
 * if PQ size is more than the desired size remove the farthest in the PQ and so on
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
