package com.eip.chapter19;

import java.util.*;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class CloneAGraph {
    public static class GraphVertex{
        public int label;
        public List<GraphVertex> edges;

        public GraphVertex(int label) {
            this.label = label;
            this.edges = new ArrayList<>();
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GraphVertex that = (GraphVertex) o;
            if (label != that.label) return false;
            return edges != null ? edges.equals(that.edges) : that.edges == null;
        }
        @Override
        public int hashCode() {
            int result = label;
            result = 31 * result + (edges != null ? edges.hashCode() : 0);
            return result;
        }
        @Override
        public String toString() {
            return "{" +
                    "label=" + label +
                    ", edges=" + edges +
                    '}';
        }
    }

    public GraphVertex cloneGraph(GraphVertex g){
        if(g == null)
            return null;

        Queue<GraphVertex> queue = new LinkedList<>();
        queue.add(g);
        Map<GraphVertex, GraphVertex> map =new HashMap<>();
        map.put(g,new GraphVertex(g.label));
        while (!queue.isEmpty()){
            GraphVertex current = queue.poll();
            for(GraphVertex edge: current.edges){
                GraphVertex clonedVertex = map.get(edge);
                if(clonedVertex  == null){
                    clonedVertex = new GraphVertex(edge.label);
                    map.put(edge,clonedVertex);
                    queue.add(edge);
                }
                map.get(current).edges.add(clonedVertex);
            }
        }
        return map.get(g);
    }
}
