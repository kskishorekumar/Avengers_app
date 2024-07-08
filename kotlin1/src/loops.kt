fun main()
{
    for( i in 1..10)
    {
        println(i)
    }
    var i=1
    while(i<=10)
    {
        println(i)
        i++
    }
    val a= arrayOf("a","b","c")

    for(i in 0..a.size-1)
    {
        println("${a[i]}")
    }
    for(i in 0..100 step 10)
    {
        println(i)
    }
    for(i in 10 downTo 1 step 2)
    {
        println(i)
    }
}