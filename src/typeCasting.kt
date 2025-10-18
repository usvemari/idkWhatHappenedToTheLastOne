import kotlin.random.Random

fun main(args:Array<String>){
    val animals=randomAnimalsGPT(10)
    for(animal in animals){
        when(animal){
            is Cat-> animal.purr()
            is Dog-> animal.bark()
            is Bird-> animal.chirp()
        }
    }

}

abstract class Animal()

class Cat:Animal(){
    fun purr(){
        println("purrr")
    }
}

class Dog:Animal(){
    fun bark(){
        println("bark bark")
    }
}
class Bird:Animal(){
    fun chirp(){
        println("chirp chirp")
    }
}

fun randomAnimals(size:Int):ArrayList<Animal>{
    var animalList=ArrayList<Animal>(size)
    for(i in 0 until size){
        val animal =if (Random.nextBoolean()) Cat() else Dog()//bura iyiymiş sarar
        animalList.add(animal)
    }
        return animalList
}
fun randomAnimalsGPT(size:Int):ArrayList<Animal>{
    var animalList=ArrayList<Animal>(size)
    for(i in 0 until size){
        val random=Random.nextInt(10)
        val animal=if(random<=6) Cat() else if(random>7) Dog() else Bird()
        animalList.add(animal)
    }
    val catCount=animalList.count{it is Cat}
    val dogCount=animalList.count{it is Dog}
    println("Added ${animalList.count{it is Bird}} times birds")
    println("Added $dogCount times dogs")
    println("added $catCount times cats")
    return animalList
}