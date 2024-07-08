
//data class in dog.kt at last
fun main()
{
    var res1=Hotel("kannappa",4.0f)
    var res2=Hotel("KMS",3.0f)
    var list1= mutableListOf(res1,res2)

    for(i in list1)
    {
        println(i)
    }
    if(res1==res2)
    {
        println("same")
    }
    else
    {
        println("Different")
    }

}