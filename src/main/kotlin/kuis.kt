fun main (){
    val angka = intArrayOf(30,26,70,40,32,20,11,80)
    for(angka in angka){
        if (angka % 2 ==0){
            println("$angka angka genap")
        }
        else{
            println("$angka ganjil")
        }
    }
}