package project;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        
        Boj boj = new Boj();
        Test ts = new Test();
        
        //2753번 윤년 
        //if(!getTest("2000",1,boj.q2753(2000))) return;
        //if(!getTest("1999",0,boj.q2753(1999))) return;
        
        //14681번 사분면 
         // if(!getTest("-12,5",2,boj.q14681(-12,5)))  return;
         // if(!getTest("12,5",1,boj.q14681(12,5))) return;
         // if(!getTest("-12,-5",3,boj.q14681(-12,-5))) return;
         // if(!getTest("12,-5",4,boj.q14681(12,-5))) return;
         
        //2884번 알람시계
        // if(!ts.getTest("10,10","9 25",boj.q2884(10,10))) return;
        // if(!ts.getTest("9,25","8 40",boj.q2884(9,25)))  return;
        // if(!ts.getTest("0,30","23 45",boj.q2884(0,30)))  return;
        // if(!ts.getTest("23,45","23 0",boj.q2884(23,45)))  return;
        // if(!ts.getTest("23,40","22 55",boj.q2884(23,40)))  return;
        // if(!ts.getTest("22,55","22 10",boj.q2884(22,55)))  return;
        // if(!ts.getTest("0,0","23 15",boj.q2884(0,0)))  return;
        
        //2739번 구구단
        //boj.q2739(2);
        
        // q15552 빠른 A+B
         // boj.q15552();     
	
		//2741번 N찍기
		//boj.q2741();
		
		//11021번 A+B-7
		//boj.q11021();
		
		//11022번 A+B-8
		//boj.q11022();
		
		//2438번 별찍기 
		//boj.q2438();
			
		//2459번 별찍기 2
		//boj.q2439();
		
		//10871 번 X보다 작은 수
		boj.q10871();
		
        System.out.println("================[완료!!]=======================");
   }

}
  


