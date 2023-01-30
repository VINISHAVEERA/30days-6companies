// class Solution {
//     public boolean hasAllCodes(String s, int k) {
//           if(s.length() < k){
//             return false;
//         }

//         HashSet<String> set = new HashSet<>();

//         for(int i=0;i<=s.length() - k ;i++){

//             set.add(s.substring(i, i+k));
//         }return set.size() == Math.pow(2, k);

//         // if(set.size() == Math.pow(2, k)){
//         //     return true;
//         // }
//         // return false;
//     }
// }

// class Solution{
//     public boolean hasAllcodes(String s,int k){
//         if(s.length()<k){
//             return false;
//         }

//         HashSet<String> set = new HashSet<>();
//         for(int i=0;i<=s.length-k;i++){
//             set.add(s.substring(i,i+k));
//         }return set.size() == Math.pow(2,k);
      
// }
// }

class Solution {
    public boolean hasAllCodes(String s, int k) {
          if(s.length() < k){
            return false;
        }

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<=s.length() - k ;i++){

            set.add(s.substring(i, i+k));
        }return set.size() == Math.pow(2, k);
    }
}