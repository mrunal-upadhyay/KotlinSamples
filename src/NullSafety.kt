
fun main(args:Array<String>){

    var name:String? // ? indicates that variable name can be null
    name = "mrunal" // if ? was not there you cannot set name = null
    print(name!!) //  !! indicates null-safety that means that the method print cannot accept null values of name. If it encounters it then it throws an error.
}