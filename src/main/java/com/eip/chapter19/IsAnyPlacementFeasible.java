package com.eip.chapter19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class IsAnyPlacementFeasible {
        public static class GraphVertex{ // Store vertex along with its distance from start of BFS
            public int d = -1;
            public String label;
            public List<GraphVertex> edges = new ArrayList<>();
            public GraphVertex(String label) {
                this.label = label;
            }
            @Override
            public String toString() {
                return "{" +
                        "d=" + d +
                        ", label='" + label + '\'' +
                        ", edges=" + edges +
                        '}';
            }
        }

        public boolean isAnyPlacementFeasible(List<GraphVertex> graphVertices){
            // Assuming the graph is not connected go through all vertices to check
            // if they can be divied into 2 parts
            for(GraphVertex g: graphVertices){
                if(g.d ==-1) // Means this vertex is not discovered yet
                    g.d = 0;
                if(!BFS(g))
                    return false;
            }
            return true;
        }
        // Basic assumption is that 2 edges that have same ancestor cannot be at same distance from BFS source
        // If they are then they cannot be split into 2 parts
        public boolean BFS(GraphVertex s){
            Queue<GraphVertex> q = new LinkedList<>();
            q.add(s);
            while (!q.isEmpty()){
                for(GraphVertex t: q.peek().edges){
                    if(t.d == -1){
                        t.d = q.peek().d+1;
                        q.add(t);
                    }else if(t.d == q.peek().d){
                        return false;
                    }
                }
                q.remove();
            }
            return true;
        }
    }

