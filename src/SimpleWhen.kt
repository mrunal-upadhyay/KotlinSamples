
fun main (args:Array<String>) {

    var n1:Int = 5

    when(n1) {

        1,2 -> {
            print("Value is 1 or 2")
        }

        in 10..30 -> {
            print("Value is in range 10 - 30")
        }

        !in 2..30 -> {
            print("Value is not in range 2 - 30")
        }

        else -> {
            print("Value not in any range")
        }

    }
}