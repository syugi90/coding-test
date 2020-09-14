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

		//boj.q10951();
		
		//21110번 더하기 사이클 
		// if(!ts.getTest("26" ,4,boj.q1110(26))) return; 
		// if(!ts.getTest("55" ,3,boj.q1110(55))) return; 
		// if(!ts.getTest("1"  ,60,boj.q1110(1))) return; 
		// if(!ts.getTest("0"  ,1,boj.q1110(0))) return; 
		
		boj.q5543();
		
			
		//스킬테스트
		// SkillTest st = new SkillTest();
		// if(!ts.getTest("", 5 , st.skillTest0911(5, new int[]{2,3}, new int[]{1,4}))) return;
		// if(!ts.getTest("", 4 , st.skillTest0911(5, new int[]{1,5}, new int[]{2,3}))) return;
		// if(!ts.getTest("", 4 , st.skillTest0911(5, new int[]{2,3}, new int[]{5,3}))) return;
		// if(!ts.getTest("", 5 , st.skillTest0911(5, new int[]{2,4}, new int[]{3,1}))) return;
		// if(!ts.getTest("", 5 , st.skillTest0911(5, new int[]{2,4}, new int[]{1,3}))) return;
		// if(!ts.getTest("", 4 , st.skillTest0911(5, new int[]{1,2,5}, new int[]{3,4}))) return;
		
		
		
		
		System.out.println("================[완료!!]=======================");
   }

}
  


