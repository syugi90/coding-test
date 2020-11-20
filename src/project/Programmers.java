//두개뽑아서 더하기 
import java.util.*; 

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> sumNumber = new TreeSet();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                sumNumber.add(numbers[i]+numbers[j]);
            }
        }
        
        answer = new int[sumNumber.size()];
        int index = 0;
        Iterator it = sumNumber.iterator();
        while(it.hasNext()){
            answer[index] = (int)it.next();
            index++;
        }
        return answer;
    }
}