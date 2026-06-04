import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        
        var res1=(a.toString()+b.toString()).toInt()
        var res2=(b.toString()+a.toString()).toInt()
        
        answer=max(res1, res2)
        
        return answer
    }
}