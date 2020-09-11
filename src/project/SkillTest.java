package project;

import java.util.*;

public class SkillTest {
	
	//===============================================================	
	// 2020-09-11 (금)
    //===============================================================
	
	/*
	* 프로그래머스 - 1단계 체육복찾아주기 (N)
	* 전체 학생수 n 
	* 체육복을 잃어버린 학생수 lost
	* 여벌의 체육복이있는 학생수 reserve
	* 체육수업을 받을수있는 학생수 리턴 (없으면 -1 리턴)
	* (여벌의 체육복이 있는 학생도 체육복을 잃어버릴수잇다)
	*/

	public int skillTest0911(int n, int[] lost, int[] reserve){
		System.out.println("======= input : "+n+" "+Arrays.toString(lost)+" "+Arrays.toString(reserve));
		
		int answer = 0;
		int count = 0;
		
		Arrays.sort(reserve);
		Arrays.sort(lost);
		
		for(int i=0; i<reserve.length; i++){
			for(int j=0; j<lost.length; j++){
				if(lost[j] == reserve[i]){
					lost[j] = -1;
					reserve[i] = -1; 
				}
			}
		}
		
		for(int i=0; i<lost.length; i++){
			int lostN = lost[i]; 
			 if(lostN == -1){
				 break; 
			 }
			
			for(int j=0; j<reserve.length; j++){
				if(lostN-1 == reserve[j] || lostN+1 == reserve[j]){
					reserve[j] = -1;
					lost[i] = -1; 
					break; 
				}
			}
		}

		for(int i=0; i<lost.length; i++){
			if(lost[i]>-1) count++;
		}
		answer = n - count; 

		return answer;
	}

}