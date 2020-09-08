package project;

public class Test {
    public boolean getTest(String input, int output, int result){
        
        Boj boj = new Boj();
        
        if(result == output){
        System.out.println("Test 성공! input : "+input);
           return true;  
        }
        
        System.out.println("Test 실패! input : "+input+" output : "+output +" result : "+result);
        return false; 
        
    }
    
    public boolean getTest(String input, String output, String result){
        
        Boj boj = new Boj();
        
        if(result.equals(output)){
        System.out.println("Test 성공! input : "+input);
           return true;  
        }
        
        System.out.println("Test 실패! input : "+input+" output : "+output +" result : "+result);
        return false; 
        
    }
}