package com.eip.chapter9;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class NormalizePathNames {

    /**
     * Problem:- Given a path expression build the path name
       Solution:- Use a stack to create path name
     */
    public String shortestEquivalentPath(String path){
        if(path.equals(""))
            throw new IllegalArgumentException("Empty String is not a legal path");

        Stack<String> pathNames = new Stack<>();
        if(path.startsWith("/"))
            pathNames.push("/");


        for(String token : path.split("/")){
            // If the current token is .. then pop first element from the stack
            if(token.equals("..")){
                // If current stack is empty or starts with .. then its is ok to push .. on stack
                if(pathNames.isEmpty() || pathNames.peek().equals("..")){
                    pathNames.push(token);
                }else{
                    if(pathNames.peek().equals("/")){
                        throw new IllegalArgumentException("Path error, trying to go up root " + path);
                    }
                }
                //Remove current element
                pathNames.pop();
            }else if(!token.equals(".") && !token.isEmpty()){
                pathNames.push(token);
            }
        }
        // Since now stack holds paths in proper oder build the path string
        StringBuffer result = new StringBuffer();
        if(!pathNames.isEmpty()){
            Iterator<String> it = pathNames.iterator();
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
