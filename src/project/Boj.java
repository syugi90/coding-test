package project;

public class Boj{

    //===============================================================
    // 2020-09-08 (화)
    //===============================================================
    
    //2753번 윤년 
    public int q2753(int num){
        if((num%4 == 0 && num%100 != 0) || num%400 == 0){
            return 1; 
        }
        return 0;
        
    }
    
    //14681번 사분면 
    public int q14681(int x, int y){
        
        if(x > 0 && y > 0){
            return 1;
        }else if(x < 0 && y > 0){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else if(x > 0 && y < 0){
            return 4;
        }
        
        return 0;
        
    }
    
    //2884번 알람시계
    public String q2884(int H, int M){
        
        int setTime = 45;
        
        if(M < setTime){
            M += 60;
            H--;
        
        }
        M -= setTime;
        
        if(H < 0){
            H = 23;
        } 
        
        String result = H+" "+M;
        return result;
    }
}