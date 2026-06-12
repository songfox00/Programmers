class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        
        if(ineq=="<"){
            if(eq=="="){
                if(n<=m)
                    answer=1
            }
            else{
                if(n<m)
                    answer=1
            }
        }
        else{
            if(eq=="="){
                if(n>=m)
                    answer=1
            }
            else{
                if(n>m)
                    answer=1
            }
        }
        
        return answer
    }
}