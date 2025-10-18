abstract class Shape{
    abstract fun getArea(size:Double):Double


}

class Circle:Shape(){
    override fun getArea(size:Double):Double {
        return  size*size*3.14.toDouble()
    }
}

class Square:Shape(){
    override fun getArea(size:Double):Double{
        return size*size.toDouble()
    }
}
//T is either square or circle so when you say T:Shape ; T of type Shape and shape:T is shape of type T
class Geometry<T:Shape>{
    fun display(shape:T,size:Double){
        println("${shape.getArea(size )}")
    }
}

fun main(args:Array<String>){
    val geo1=Geometry<Square>()
    geo1.display(Square(),5.0)
}