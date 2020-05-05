package com.devops.abv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n1 = Integer.parseInt(br.readLine());
        Integer n2 = Integer.parseInt(br.readLine());

        System.out.println("Output for the addition is : "+addition(n1,n2));
    }

    public static Integer addition(Integer a,Integer b){
        return a+b;
    }
}
