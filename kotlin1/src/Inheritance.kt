open class Animals(var legs:Int,var color:String)  //parent class
{
    fun eat()
    {
        println("Eat")
    }
    fun sleep()
    {
        println("Sleep")

    }
    open fun sounds()
    {
        println("I make sounds")
    }
}
class Dogs(legs: Int,color: String):Animals(legs, color)//child
{
    /*fun bark()
    {
        println("bark")
    }*/
    override fun sounds() {
        println("I bark")
    }

}
class Cat(legs: Int,color: String):Animals(legs,color)//child
{
    /*fun fur()
    {
        println("purr")
    }*/

    override fun sounds() {
        println("I purrr")
    }
}
//refer main_func