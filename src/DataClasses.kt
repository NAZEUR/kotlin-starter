class User(val name: String, val age : Int){
    override fun toString(): String {
        return "user(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main(){
    val user = User("nrohmen",17)
    val datauser = DataUser("nrohmen",17)
    val datauser2 =DataUser("nrohmen",17)
    val datauser3 = DataUser("dimas",18)

    println(user)
    println(datauser)
    println(datauser.equals(datauser2))
    println(datauser.equals(datauser3))
}