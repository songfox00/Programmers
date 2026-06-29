class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var len: Int = included.size
        var num: Int = a
        
        for(i in 0 until len){
            if(included[i])
                answer += a+d*i
        }
        
        return answer
    }
}