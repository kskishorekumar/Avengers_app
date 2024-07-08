import java.util.*

fun main()
{
    var char= arrayOf<Int>(1,2,3,4,5,6,7,8,9)
    var int= arrayOf<Int>(9,8,7,6,5,4,3,2,1)

    char=int
    val new= arrayOf('a',1,'b',2)

    println(new[0])
    println(new.get(0))

    new[0]="aa"

    println(new[0])
    println(new.size)

    println(Arrays.toString(new))
}