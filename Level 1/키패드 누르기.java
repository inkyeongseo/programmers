class Solution {
    position left;
    position right;
    position numPos;
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 왼손 오른손 위치를 초기화
        left = new position(3,0);
        right = new position(3,2);
        
        
        //숫자를 누를 손가락 정하기
        for(int num : numbers){
            numPos = new position((num-1) /3 , (num-1) % 3);
            if(num == 0) numPos = new position(3,1);
            
            String finger = numPos.getfinger(hand);
            //정해진 손가락을 answer에 담고 손가락 위치 이동
            answer += finger;
            if(finger.equals("L")){
                left = numPos;
            }else{
                right = numPos;
            }
        }
        
        
        return answer;
    }
    
    class position{
        int row;
        int col;
        
        position(int row, int col){
            this.row = row;
            this.col = col;
        }
        public String getfinger(String hand){
            String finger = hand.equals("right")?"R":"L";
            
            if(this.col == 0){
                finger = "L";
            }else if(this.col == 2){
                finger = "R";
            }else{
                int leftDist = left.getDistance(this);
                int rightDist = right.getDistance(this);
                
                if(leftDist < rightDist){
                    finger = "L";
                }else if(leftDist > rightDist){
                    finger = "R";
                }
            }
            return finger;
        }
        public int getDistance(position p){
            return Math.abs(this.row - p.row)+Math.abs(this.col-p.col);
        }
    }
}