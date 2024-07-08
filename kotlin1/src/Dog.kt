import java.awt.Color

class Dog {

     var name: String="rotwheeler"
     var color: String="brown"

    fun eat() {
        println("${name} is eating")
    }

    fun bark() {
        println("${name} is barking")
    }


}
fun main(){
    val dog1=Dog()

    dog1.name="german shephard"
    dog1.color="black"
    println("name is ${dog1.name}")
    dog1.eat()
    dog1.bark()
}

data class Hotel(var name:String,var rating:Float)
