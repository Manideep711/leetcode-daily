class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res=new ArrayList<>();
        for(String s:folder){
            if(res.isEmpty()){
                res.add(s);
            }
            else{
                String prev=res.get(res.size()-1);
                if(s.startsWith(prev)&& s.length()>prev.length()&& s.charAt(prev.length())=='/'){
                    continue;
                }
                else{
                    res.add(s);
                }
                
            }
        
        }
           return res; 
    }
}