open class Hospital (depname:String,dephead:String,depid:Int){
//
    init {
    println("The   $depname department is headed by $dephead and he  has the id $depid")
    }

}
class dental(depname:String,dephead:String,depid:Int ):Hospital(depname,dephead,depid ){

}
class surgery(depname:String,dephead:String,depid:Int ):Hospital(depname,dephead,depid ){

}
class general(depname:String,dephead:String,depid:Int ):Hospital(depname,dephead,depid){

}
fun main(){
val den =dental("Dental","Dr Kamau",1)
 val sur =surgery("Surgery","Dr King",2)
val gen = general("General","Dr Obby",3)
}