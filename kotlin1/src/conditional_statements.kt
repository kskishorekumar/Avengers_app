fun main()
{
    /*var a=1

    if(a>10)
    {
        print("hi")
    }
    else if(a<10)
    {
        print("hello")
    }
    else
    {
        print("bye")
    }*/

    var a=3
    when(a)
    {
        0->print("zero")
        1->print("one")
        2->print("two")
        3->println("three")
        else->print("no match")

    }

    when{
        a>0->print("great")
        a<0->print("low")
        else->print("dono")
    }

    when(5)
    {
        in 1..10->print("bt 1 to 10")
        in 11..20->print("bt 11 to 20")
        else->print("shit")
    }
}