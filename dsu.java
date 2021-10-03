/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* */
class Main
{
    static int [] par;
    static int[] rank;
	public static void main (String[] args) throws java.lang.Exception
	{
	    // I'm doing it manually , Not taking Input from user
	    //Given pairs will be used in DSU
      // 1,2
      // 1,3
      // 4,5
      // 6,7
      // 5,7
      par=new int[8];
      rank=new int[8];
      for(int i=0;i<8;i++){
          par[i]=i;
      }
      
                union(1,2);
                union(1,3);
                union(4,5);
                union(6,7);
                union(5,7);
                
            // for(int j:par) System.out.println(j);
     System.out.println("Leader of 1  "+find(1));
     System.out.println("Leader of 2  "+find(2));
     System.out.println("Leader of 3  "+find(3));
     System.out.println("Leader of 4  "+find(4));
     System.out.println("Leader of 5  "+find(5));
     System.out.println("Leader of 6  "+find(6));
     System.out.println("Leader of 7  "+find(7));
     //We'll get 2 Answer i) 2 & ii) 7 ... for given pairs there 
     //will be only 2 groups contaning leader 2 and 7
      
	} 
	static int find(int x){
	    if(x==par[x]) return x;
	    int temp=find(par[x]);
	    par[x]=temp;
	    return temp;
	}
	static void union(int x,int y){
	    int lx=find(x);
	    int ly=find(y);
	    if(lx!=ly){
	        if(rank[lx]>rank[ly]){
	            par[ly]=lx;
	        }
	        else if(rank[lx]>rank[ly]){
	            par[lx]=ly;
	        }
	        else {
	        par[lx]=ly;
	        rank[ly]++;
	    }
	    }
	    
	}
}
