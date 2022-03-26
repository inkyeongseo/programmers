import java.util.*;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        recursive("",numbers); //재귀함수 , 모든 조합의 숫자 찾기
        
        int answer = 0;
        //소수 개수 찾기
        Iterator<Integer> it = numberSet.iterator();

        while (it.hasNext()){

            int number = it.next();
            if(isPrime(number)) answer++;
        }
        
        return answer;
    }
    
    public void recursive(String comb, String others){
        //현재 조합 넣기
        if(!comb.equals("")) numberSet.add(Integer.valueOf(comb));
        
        //남은 숫자 중 하나 더하기
        for(int i = 0; i < others.length(); i++){
            recursive(comb + others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
        
    }
    
    public boolean isPrime(int num){
        //0,1은 소수가 아님
        if(num == 0 || num == 1) return false;
        
        //이 외에 값 계산
        int lim = (int)Math.sqrt(num);
        for(int i = 2; i <= lim; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}


//참고 <https://www.youtube.com/watch?v=pF368QqdQb4>