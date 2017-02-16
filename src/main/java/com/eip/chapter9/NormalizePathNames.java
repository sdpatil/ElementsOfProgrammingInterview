package com.eip.chapter9;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class NormalizePathNames {

    public String shortestEquivalentPath(String path){
        if(path.equals(""))
            throw new IllegalArgumentException("Empty String is not a legal path");

        Deque<String> pathNames = new LinkedList<String>();
        if(path.startsWith("/"))
            pathNames.addFirst("/");


        for(String token : path.split("/")){
            if(token.equals("..")){
                if(pathNames.isEmpty() || pathNames.peekFirst().equals("..")){
                    pathNames.addFirst(token);
                }else{
                    if(pathNames.peekFirst().equals("/")){
                        throw new IllegalArgumentException("Path error, trying to go up root " + path);
                    }
                }
                pathNames.removeFirst();
            }else if(!token.equals(".") && !token.isEmpty()){
                pathNames.addFirst(token);
            }
        }

        StringBuffer result = new StringBuffer();
        if(!pathNames.isEmpty()){
            Iterator<String> it = pathNames.descendingIterator();
            String prev = it.next();
            result.append(prev);
            while(it.hasNext()){
                if(!prev.equals("/")){
                    result.append("/");
                }
                prev = it.next();
                result.append(prev);
            }

        }
        return result.toString();
    }

    public String shortestEquivalentPath2(String path){
        StringBuffer returnPath = new StringBuffer();
        boolean isAbsolutePath = false;
        if(path.startsWith("/"))
            returnPath.append("/");

        Stack<String> dirStack = new Stack<String>();
        String[] tokens = path.split("/");

        for(int i = 0 ; i < tokens.length; i++){
            String currentToken = tokens[i];
            System.out.println(currentToken);
            if(currentToken.equals(".."))
                dirStack.pop();
            else if(currentToken.equals(".") || currentToken.trim().length() == 0){
                System.out.println("Cant change anything");
            }else
                dirStack.push(currentToken);
        }

        Stack<String> stack2 = new Stack<String>();
        while(!dirStack.isEmpty())
            stack2.push(dirStack.pop());

        while(!stack2.isEmpty()) {
            returnPath.append(stack2.pop());
            if(!stack2.isEmpty())
                returnPath.append("/");
        }

        return returnPath.toString();
    }
}
