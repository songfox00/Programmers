class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        
        if(arr1.size < arr2.size)
            answer=-1
        else if(arr1.size > arr2.size)
            answer=1
        else{
            var sum1: Int=0
            var sum2: Int=0
            
            for(i in 0 until arr1.size){
                sum1+=arr1[i]
            }
            for(i in 0 until arr2.size){
                sum2+=arr2[i]
            }
            
            if(sum1<sum2)
                answer=-1
            else if(sum1>sum2)
                answer=1
            else
                answer=0
        }
        
        return answer
    }
}