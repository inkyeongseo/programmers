class Solution {
    public String solution(String new_id) {    
        new_id = new_id.toLowerCase(); //1단계
        
        new_id = new_id.replaceAll("[^a-z0-9-_.]",""); //2단계
        
        //3단계
        while (new_id.contains("..")) {
            new_id = new_id.replace("..",".");   
        }
        
        //4단계
        new_id = new_id.replaceAll("^[.]|[.]$","");
        
        //5단계
        if(new_id.length() == 0){
            new_id += "a";
        }
        
        //6단계
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("^[.]|[.]$",""); //4단계 다시 실행
        }
        
        if(new_id.length() <= 2){
            char s = new_id.charAt(new_id.length()-1);
            
            while(new_id.length() < 3){
                new_id += String.valueOf(s);
            }
        }
        
        return new_id;
    }
}