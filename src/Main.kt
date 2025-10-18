
//when kullanımına bak biraz 163. ders
const val URL="www.google.com"//consts are not calculated during execution, only shows up while compiling
fun main(args: Array<String>) {
/*var name="Furkan"
when(val length=name.length){
    in 1..5->println("e")
    else->println("a")
}*/
/*var name= readln()
when(name[0]){
    in 'a'..'c'->println("hi abc")
    'ç','d','e'->println("hi çde")
    else->println("hello")
}*/
    //SEALED CLASSES
    //sealed classes can be used to check if an object is of a certain type or not
    //sealed classes cannot be instantiated
    //useful in expressions

    var veh1:Vehicle=BMW()
    decideVehicle(veh1)

    var reward:Reward=Kawasaki()
    getReward(reward)

    //NESTED CLASSES
    //Encapsulation
    val plane=Plane()
    plane.Engine().run()
    plane.drive()

    var pc=Computer()
    pc.bootUp()
}

//SEALED CLASSES
abstract class Plant()
sealed class Fruit:Plant()
class Apple:Fruit()
sealed class Vegetable:Plant()
class Potato:Vegetable()

fun getPlant():Plant = Apple()

abstract class Vehicle()

sealed class Car:Vehicle()
class BMW: Car()//WE NEED TO HAVE AN INSTANCE OF A CAR CUS SEALED CLASSES CANNOT BE INSTANTIATED
sealed class Bicycle:Vehicle()
class Sektor:Bicycle()
fun decideVehicle(obj:Vehicle):Vehicle{
    when(obj){
        is BMW -> println("its faster")
        is Sektor -> println("its healthier")
    }
    return obj
}

abstract class Reward()
sealed class Bike:Reward()
class Kawasaki:Bike()
sealed class Vacation:Reward()
class Hawaii:Vacation()
sealed class Gift:Reward()
class giftCard:Gift()


fun getReward(obj:Reward){
    when(obj){
        is Kawasaki -> println("Kawasaki is cool")
        is Hawaii -> println("Hawaii is cool")
        is giftCard -> println("Gift card is cool")
    }
}

//NESTED CLASS
class Plane{
    //private lara obje oluşturup ulaşabilirsin
    private var engine2=secondEngine()
    var speed=100
    var wings=4
    fun drive(){

        engine2.run()
    }
    inner class Engine(){
        val rpm=4500
        fun run(){
            println("Engine is running at $rpm rpm")
        }
    }
    private inner class secondEngine(){
        val rpm=4200
        fun run(){
            println("2nd engine is at $rpm")
        }
    }
}

class Computer(){
    private var opSystem=OS()
    fun bootUp(){
        println("Loading...")
        opSystem.startOS()
        println("Computer is on")

    }
    private inner class OS{
        fun startOS(){
            println("Starting the OS")
        }
    }
}