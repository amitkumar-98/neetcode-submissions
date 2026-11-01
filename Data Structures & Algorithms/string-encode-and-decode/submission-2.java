class Solution {

    public String encode(List<String> strs) {
        StringBuilder  sb= new StringBuilder();
       for(String str:strs){
           sb.append(str.length()).append("#").append(str);
       }
       return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> result = new ArrayList<>();
       for(int i=0;i<str.length();i++){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+length+1);
            i=length + j;
            result.add(word);       
       }
        return result;   
    }
}
