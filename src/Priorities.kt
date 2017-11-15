/* Operator Precedence

1. ()
2. ++ | -- before the var
3. ^
4. * | /
5. + | -
6. =
7. ++ | -- after the variable

 */

fun main (args:Array<String>) {

    var num1:Int = 10
    var num2:Int = 10

    var result1:Int?

    result1 = num1+num2-3

    println("Result1:$result1")

    var result2 = num1+++num2

    println("Result2:$result2")

    var result3 = ++num1+num2

    print("Result3:$result3")
}