package com.eip.chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class DeadlockDetection {
    public static class GraphVertex {
        public static enum Color {
            WHITE, GRAY, BLACK
        }

        public GraphVertex(String lable) {
            this.lable = lable;
        }
        public String lable;
        public Color color = Color.WHITE;
        public List<GraphVertex> edges = new ArrayList<>();
        @Override
        public String toString() {
            return "{" +
                    "lable='" + lable + '\'' +
                    ", color=" + color +
                    ", edges=" + edges +
                    '}';
        }
    }

    /**
     * Find cycle in directed graph will detect cycle if A->B->C->D->A
     * @param G
     * @return
     */
    public boolean isDeadlocked(List<GraphVertex> G) {
        for (GraphVertex current : G) {
            if (current.color == GraphVertex.Color.WHITE && hasCycle(current))
                return true;
        }
        return false;
    }

    // Before you start exploring a vertex mark it as Gray, after you done recursing mark it as black.
    // If we find gray (Node under process or visited already then that means there is a cycle)
    public boolean hasCycle(GraphVertex current) {
        if (current.color == GraphVertex.Color.GRAY)
            return true;
        current.color = GraphVertex.Color.GRAY;
        for (GraphVertex nextVertex : current.edges) {
            if (nextVertex.color != GraphVertex.Color.BLACK)
                return hasCycle(nextVertex);
        }
        current.color = GraphVertex.Color.BLACK;
        return false;
    }

    public boolean hasCycle2(GraphVertex current,boolean[] visited) {
        current.color = GraphVertex.Color.GRAY;
        for (GraphVertex nextVertex : current.edges) {
            if (nextVertex.color != GraphVertex.Color.BLACK)
                return hasCycle(nextVertex);
        }
        current.color = GraphVertex.Color.BLACK;
        return false;
    }
}
