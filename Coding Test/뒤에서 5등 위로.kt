class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer=num_list.sorted().slice(5 until num_list.size).toIntArray()
        
        return answer
    }
}