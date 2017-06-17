package com.eip.chapter19;

import java.util.*;
import java.util.regex.MatchResult;

/**
 * Created by sunilpatil on 5/2/17.
 */
public class Bootcamp {
    public static class MatchResult{
        public String winningTeam;
        public String losingTeam;

        public MatchResult(String winningTeam, String losingTeam) {
            this.winningTeam = winningTeam;
            this.losingTeam = losingTeam;
        }
    }

    public  boolean canTeamABeatTeamB(List<MatchResult> matchResultList, String teamA, String teamB){
        Set<String> visited = new HashSet<>();
        Map<String, Set<String>> graph = buildGraph(matchResultList);
        return dfs(graph, teamA,teamB,visited);
    }

    public Map<String, Set<String>> buildGraph(List<MatchResult> matchResultList){
        Map<String, Set<String>> result = new HashMap<>();
        for(MatchResult matchResult : matchResultList){
            Set loosingTeamSet = result.get(matchResult.winningTeam);
            if(loosingTeamSet == null){
                loosingTeamSet = new HashSet();
            }
            loosingTeamSet.add(matchResult.losingTeam);
        }
        return result;
    }

    public boolean dfs(Map<String, Set<String>> edgeMap, String current, String destination, Set<String> visited){
     if(current.equals(destination))
         return true;
     else if(!edgeMap.containsKey(current) || visited.contains(current))
         return false;
     visited.add(current);

     Iterator<String> loosingTeamIt = edgeMap.get(current).iterator();
     while (loosingTeamIt.hasNext()){
         String currentTeam = loosingTeamIt.next();
         return dfs(edgeMap,currentTeam,destination,visited);
     }
     return false;
    }

}
