
fun main (args:Array<String>) {

    println("---Math Calculator----")
    println("Enter Number#1")
    var num1:Float = readLine()!!.toFloat()
    println("Enter Number#2")
    var num2:Float = readLine()!!.toFloat()

    var sum:Float?
    sum = num1+num2
    println("Sum is:" + sum)



}