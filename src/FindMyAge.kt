import java.util.*

fun main(args:Array<String>) {

    println("Enter your DOB")
    var dob:Int =  readLine()!!.toInt()

    var year:Int = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int = year - dob

    println("Your Age is $age")
}