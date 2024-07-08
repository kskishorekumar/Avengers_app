fun main()
{
    val a=1
    val b=0
    try {
        print(a/b)
    }
    catch(e:Exception)
    {
        println(e)
    }
    finally {
        println("bye")
    }
    nullpointer()
    removenull()
}
fun nullpointer()
{
    var nullvalue: String?=null
    println(nullvalue)
    println(nullvalue?.length ?:"this is a null value")
}
fun removenull()
{
    val nulllist1= listOf(1,2,3,null)
    println("${nulllist1.filterNotNull()}")
}