import jdk.swing.interop.SwingInterOpUtils

class customer (text:String="Bonjour", Cus_name:String="Sir/Madam") {
    val greet: String
    val name: String

    init {
        greet = text
        name = Cus_name


        println("$greet $name")


    }


}
    fun main(){
        val cust1 = customer("HELLO THERE","Mr john Doe")
        val cust2= customer()
            val cust3= customer("Good morning","Mr H")

    }


