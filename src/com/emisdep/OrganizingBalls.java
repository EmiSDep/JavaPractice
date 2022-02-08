package com.emisdep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrganizingBalls{

public static String organizingContainers(List<List<Integer>>container){
        // Write your code here
        // Keep count of ball type and container count..
        //The first line contains an integer , the number of containers (rows) and ball types (columns).
        // Get the sum of each row/columns
        // check if the two containers are equal
        //sort
        List<Integer> containerCount=new ArrayList<>();
        List<Integer> ballType=new ArrayList<>();
        for(int i=0;i<container.size();i++){

        int containerRows=0;
        int ballColumns=0;

        for(int j=0;j<container.size();j++){
        containerRows+=container.get(i).get(j);
        ballColumns+=container.get(j).get(i);
        }
        containerCount.add(containerRows);
        ballType.add(ballColumns);
        }

        Collections.sort(containerCount);
        Collections.sort(ballType);

        if(ballType.equals(containerCount)){
        return"Possible";
        }

        return"Impossible";

        }
        }