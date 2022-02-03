class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] num = new int[3];
        int count = -1;

        for(int i = 0; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);

            if(ch >= '0' && ch <= '9'){
                if(ch == '0' && dartResult.charAt(i-1) == '1'){
                    answer = 10;
                    num[count] = 0;
                }else{
                    answer = Character.getNumericValue(ch);
                    count++;
                }
            }else{
                switch(ch){
                    case 'S':
                        num[count] = (int)Math.pow(answer,1);
                        break;
                    case 'D':
                        num[count] = (int)Math.pow(answer,2);
                        break;
                    case 'T':
                        num[count] = (int)Math.pow(answer,3);
                        break;
                    case '*':
                        if(count > 0) num[count-1] = num[count-1] * 2;
                        num[count] = num[count] * 2;
                        break;
                    case '#':
                        num[count] = num[count] * (-1);
                        break;
                }
                
            }

        }
        
        return num[0]+num[1]+num[2];
    }
}