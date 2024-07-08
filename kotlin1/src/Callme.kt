class Callme:MyInterface,NewInterface {

    override fun hello() {
        println("hello")
    }

    override fun greet() {
        println("hello da")
    }

    override fun thank() {
        println("Thankyou")
    }
}

fun main()
{
    val a=Callme()
    a.hello()
    a.greet()
    a.thank()
}

//for interface and new interface
