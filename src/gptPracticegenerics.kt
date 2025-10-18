abstract class Repository<T>{
    protected var data= mutableListOf<T>()
    abstract fun add(item:T)
    abstract fun remove(item:T)
    fun getAll():List<T>{
        return data.toList()
    }
}

class UserRepository: Repository<String>(){

    override fun add(item:String){
        if(data.contains(item)==false){
            data.add(item)
            println("$item added")
        }
        else if(data.contains(item)){
            println("$item already exists")
        }
    }
    override fun remove(item:String){
        if(data.contains(item)){
            data.remove(item)
            println("$item removed")
        }
        else{
            println("$item doesn't exist in the list")
        }
    }
}

fun main(args:Array<String>){

    val users = UserRepository()
    users.add("furkan")
    users.add("polat")
    users.add("furkan") // should not add duplicate

    println(users.getAll())

    users.remove("polat")
    println(users.getAll())


}