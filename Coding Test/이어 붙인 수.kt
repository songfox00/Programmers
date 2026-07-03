class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var oddnum: String=""
        var evennum: String=""
        
        for(i in 0 until num_list.size){
            if(num_list[i]%2==0)
                evennum+=num_list[i].toString()
            else
                oddnum+=num_list[i].toString()
        }
        
        answer=evennum.toInt()+oddnum.toInt()
        
        return answer
    }
}