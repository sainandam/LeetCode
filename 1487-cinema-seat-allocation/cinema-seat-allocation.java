class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans=2*n;
        HashMap<Integer,Set<Integer>>map=new HashMap<>();

        for(int []seat:reservedSeats){
            int row=seat[0];
            int col=seat[1];
            map.putIfAbsent(row,new HashSet<>());
            map.get(row).add(col);
            
        }
        
        for(int row:map.keySet()){
            Set<Integer>seat=map.get(row);

            boolean left=true;
            boolean middle=true;
            boolean right=true;
            for(int i=2;i<=5;i++){
                if(seat.contains(i)){
                    left=false;
                    break;
                }
            }
            for(int i=4;i<=7;i++){
                if(seat.contains(i)){
                    middle=false;
                    break;
                }
            }
            for(int i=6;i<=9;i++){
                if(seat.contains(i)){
                    right=false;
                    break;
                }
            }
            int families;
            if(left&&right){
                families=2;
            }
            else if(left||middle||right){
                families=1;
            }
            else{
                families=0;
            }
            ans-=(2-families);
        }
        return ans; 
    }
}