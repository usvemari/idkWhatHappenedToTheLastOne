fun main(args:Array<String>){
   /* var x=5
    println(x.multiply(43))

    println(x.betterValue)

    println(x.printName())
    var y=5.5
    var z="asda"
    println(y.printName())
    println(z.printName())
    var arrl1=arrayListOf(3,4,5,2,23,5,2,321,5,12,4,2)
    println(arrl1.amount())*/

    compObjectClass.Companion.inputX()
    compObjectClass.Companion.printme()
    String.Companion.printType()
    Double.Companion.printType()
}
//EXTENSION FUNCTION
fun Int.multiply(tmes:Int)=this.times(tmes)

//eşittir le return yapılmıyo
fun Int.printName():String {return "Ali"}
fun Double.printName():String {return "veli"}
fun String.printName():String {return "mali"}

fun ArrayList<Int>.amount():Int {
    var ctr:Int=0
    for(i in this.indices){
    ctr++
}
    return ctr
}

//EXTENSION PROPERTY
//????? var kullanamazsın diyo val kullanaiblirsin diyo ne alaka la
val Int.betterValue:Int
    get()=250

//COMPANION OBJECT EXTENSIONü
class compObjectClass{
    companion object{
        var x= readln()
    }
}
fun compObjectClass.Companion.inputX(){
    println("Enter the x value")
    compObjectClass.Companion.x= readln()
}
fun compObjectClass.Companion.printme(){
    println("Companion object printed ${compObjectClass.Companion.x}")
}
fun String.Companion.printType(){
    println("This object is a type of string")
}
fun Double.Companion.printType(){
    println("This object is a type of double")
}