import javax.xml.crypto.Data

fun main(args:Array<String>){
    var house=Box<String>()
    house.addItem("kalem")
    house.show()
    val greyBox=Box<Grey>()

    greyBox.addItem(Grey())
    greyBox.show()
    val paper1= Paper<Int,Float>()
    paper1.display(23,543.5F)

    val prac1=Practice<Int>()
    prac1.toSTR(12)
    var prac2=Practice2<Int>()
    prac2.toStr(1421531231)
    var prac23=Practice2<Array<Float>>()
    prac23.toStr(arrayOf(23.4F,232.2F,23.3F))

    var appJuice=appleJuice()
    var kid1=Kid<appleJuice>()
    kid1.drink(appJuice)
    var exArr= listOf("2","3","4","5","6","7")
    var exerc=exerciseTC<List<String>>()
    exerc.iterateThrough(exArr)

    val container=DataContainer<Int>()
    container.addItem(20)
    container.addItem(10)
    container.addItem(30)
    container.showAll()
    val stats=container.Stats()
    stats.printStats()
}
class Grey{}
class Box<T>{
    var item=""
    fun addItem(itemInput:T) {
        item=itemInput.toString()
    }
    fun show(){
        println(item)
    }
}

class Paper<T,U>{
    fun display(item:T,item2:U){
        println(item)
        println(item2)
    }
}

class Practice<T>{
    fun lenCalc(text:T):Int{
        return  text.toString().length
    }
    fun toSTR(text:T){
        println(lenCalc(text))
        println(text.toString())
    }
}

class Practice2<T>{
    fun toStr(teext:T){
        println("your input is: ${teext.toString()}")
    }
}
//TYPE CONSTRAINTS
abstract class Juice{
    abstract fun make()
}
class appleJuice:Juice(){
    override fun make() {
        println("Making the appleJuice")
    }
}

class Kid<juicy:Juice>{
    fun drink(juicy:Juice){
        println("Drinking the $juicy")
    }
}

abstract class Drink{
    abstract fun make()
}
class EnergyDrink:Drink(){
    override fun make() {
        println("Making the energy drink")
    }
}
class Me<drinky:Drink>{
    fun drink(drinky:Drink){
        println("Drinking the $drinky")
    }
}
//EXERCISE
class exerciseTC<x:Collection<String>>{
    fun iterateThrough(collection: x){
        for(item in collection){
            println(item)
        }
    }
}

class DataContainer<T>{
    private val items = mutableListOf<T>()
    fun addItem(item:T){
        items.add(item)
    }
    fun showAll(){
        for (item in items){
            println(item)
        }
    }


    inner class Stats{
        fun printStats(){
            println(items.size)
            println(items.first())
            println(items.last())
        }
    }
}