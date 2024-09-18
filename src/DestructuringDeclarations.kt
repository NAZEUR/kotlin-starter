class DestructuringDeclarations {
    fun main(){
        val datauser = DataUser("nrohmen",17)

        val name = datauser.component1()
        val age = datauser.component2()

        println("My name is $name")
    }
}