class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = arr.copyOf()
        var size: Int = arr.size
        
        if(size%2!=0){
            for(i in 0 until size step 2){
                answer[i]+=n
            }
        }
        else{
            for(i in 1 until size step 2){
                answer[i]+=n
            }
        }
        
        return answer
    }
}