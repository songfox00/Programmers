class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        
        for(i in 0 until num_str.length){
            answer+=num_str[i].code - '0'.code
        }
        
        return answer
    }
}