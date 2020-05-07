package com.devops.abv;

import jdk.nashorn.internal.ir.IdentNode;

import javax.xml.crypto.dom.DOMCryptoContext;
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

        System.out.println("Output for the Subtraction is : "+subtraction(n1,n2));

        System.out.println("Output for the Multiplication is : "+multiplication(n1,n2));

        System.out.println("Output for the Multiplication is : "+division(Double.valueOf(n1),Double.valueOf(n2)));
    }

    public static Integer addition(Integer a,Integer b){
        return a+b;
    }

    public static Integer subtraction(Integer a,Integer b){ return a-b;}

    public static Integer multiplication(Integer a,Integer b){ return a*b;}

    public static Double division(Double a, Double b){ return a/b;}
}
