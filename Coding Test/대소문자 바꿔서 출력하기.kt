fun main(args: Array<String>) {
    val s1 = readLine()!!
    var answer=""
    
    for(i in 0 until s1.length){
        if(s1[i]-'a'>=0){
            answer+=s1[i]-32
        }
        else
            answer+=s1[i]+32
    }
    
    print(answer)
}