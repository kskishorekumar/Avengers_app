/*class Animal{

    var name:String

    constructor(name:String) // only secondary constructor
    {
        this.name=name
    }
}*/

class Animal(var color:String)
{
    var name: String? = null

    constructor(color: String,name: String): this(color)//both primary and secondary constructor
    {
        this.name=name
    }
}
fun main()
{
    val dog1=Animal("brown") //only primary constructor called
    val dog2=Animal("Black","rot") //both primary and secondary constructor called
}

//both primary and secondary constructor is a rare case so no need to byheart