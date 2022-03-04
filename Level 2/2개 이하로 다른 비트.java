class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            String num = Long.toString(numbers[i],2);
            if(numbers[i] % 2 == 0){
                answer[i] = numbers[i]+1;
            }else{
                if(!num.contains("0")){
                    num = "10" + num.substring(1,num.length());
                    answer[i] = Long.parseLong(num,2);
                }else{
                    int last = num.lastIndexOf("0");
                    num = num.substring(0,last) + "10" + num.substring(last+2,num.length()) ;
                    answer[i] = Long.parseLong(num,2);
                }
            }
        }
        
        return answer;
    }
}