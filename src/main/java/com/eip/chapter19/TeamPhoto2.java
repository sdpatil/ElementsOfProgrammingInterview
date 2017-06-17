package com.eip.chapter19;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class TeamPhoto2 {
    public static class GraphVertex{
        String label;
        public GraphVertex(String label) {
            this.label = label;
        }
        List<GraphVertex> edgeList = new ArrayList<>();
        boolean visited = false;
        int maxDistance =1;
    }

    public int findLargestNumberOfTeams(List<GraphVertex> G){
        Deque<GraphVertex> deque = buildTopologicalOrder(G);
        return findLongestPath(deque);
    }

    public Deque<GraphVertex> buildTopologicalOrder(List<GraphVertex> vertex){
            Deque<GraphVertex> orderedVertices= new LinkedList<>();
            for(GraphVertex g: vertex){
                DFS(g, orderedVertices);
            }
            return orderedVertices;
    }

    public void DFS(GraphVertex cur, Deque<GraphVertex> orderVertices){
        cur.visited = true;
        for(GraphVertex next : cur.edgeList){
            if(!next.visited)
                DFS(next, orderVertices);
        }
        orderVertices.addFirst(cur);
    }

    public int findLongestPath(Deque<GraphVertex> q){
        int maxDistance = 0;
        while (!q.isEmpty()){
            GraphVertex u = q.peekFirst();
            maxDistance = Math.max(maxDistance, u.maxDistance);
            for(GraphVertex v: u.edgeList){
                v.maxDistance = Math.max(v.maxDistance,u.maxDistance+1);
            }
            q.removeFirst();
        }
        return maxDistance;
    }


}
