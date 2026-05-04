class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer=num_list.sorted().slice(0 until 5).toIntArray()
        
        return answer
    }
}