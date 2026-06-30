class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer=num_list
        var end_num: Int=answer[answer.size-1]
        var before_num: Int=answer[answer.size-2]
        if(end_num>before_num)
            answer+=end_num-before_num
        else
            answer+=end_num*2
        
        return answer
    }
}