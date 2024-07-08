fun main()
{
    val list1= listOf(1,2,3,4,5) //imutable list
    //list1[2]=2
    println( list1.indexOf(2))


    val list2= mutableListOf(1,2,3,4,5,6,7)//mutable
    list2.add(8)
    list2.add(2,10)//index first
    list2[0]=0
    list2.removeAt(2)
    val arr1= arrayOf(9,10,11)
    list2.addAll(arr1)
    println(list2)


    val arrlist1= arrayListOf(10,20,30)
    println(arrlist1)
}