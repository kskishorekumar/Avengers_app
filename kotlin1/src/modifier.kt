//for visibility modifier file

//refer visibility_function

fun main()
{
    val a=sum(10,10)

    val b=div(10,10)

    val pro= Product()

    //pro.product(5,5)//error

}

class Product
{
    protected fun product(a:Int,b:Int)=a*b
}