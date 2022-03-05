class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0; i < skill_trees.length; i++){
            String s = skill_trees[i];
            for(int j = 0; j < skill_trees[i].length(); j++){
                String ch = String.valueOf(skill_trees[i].charAt(j));
                if(!skill.contains(ch)){
                    s = s.replace(ch,"");
                }
            }
            
            if(skill.indexOf(s) == 0) answer++;
        }
        
        return answer;
    }
}