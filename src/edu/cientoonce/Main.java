package edu.cientoonce;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        int[] a =  new boolean[][5];
        int vacias=0;

        for(i=0;i<a.length;i++){
            System.out.println("Ingrese elemento "+(i+1)+" :");
            Scanner sc = new Scanner(System.in);
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            if( a[i]==false)
                vacias++;
        }
        System.out.println("Ctd. de butacas vacias: "+vacias);


    }
}
