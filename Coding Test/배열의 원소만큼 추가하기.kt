class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        for(i in 0 until arr.size){
            for(j in 0 until arr[i]){
                answer.add(arr[i])
            }
        }
        
        return answer.toIntArray()
    }
}