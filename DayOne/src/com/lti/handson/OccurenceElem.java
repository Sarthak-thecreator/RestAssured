package com.lti.handson;
import java.util.*;
public class OccureenceElem
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values");
		int a[]=new int[10];
		int fr[]=new int[10];
		int i,j,visited=-1;
		for(i=0;i<10;i++) {
			a[i]=s.nextInt();
		}
		for(i=0;i<10;i++) {
			int count=1;
			for(j=i+1;j<10;j++) {
				if(a[i]==a[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
				fr[i]=count;
			
		}
		for(i=0;i<10;i++) {
			if(fr[i]!=visited) {
			System.out.println(a[i]+" | "+fr[i]);
		}}
		

	}

}