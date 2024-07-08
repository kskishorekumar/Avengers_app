class Dog1(var name: String,var color: String){

    fun eat()
    {
        println("${name} is eatting")
        println("${color}")
    }

}
fun main()
{
    val dogs1=Dog1("rot","black")
    dogs1.eat()

    val dogs2=Dog1("german","brown")
    dogs2.eat()
}