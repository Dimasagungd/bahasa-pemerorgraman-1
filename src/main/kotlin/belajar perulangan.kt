fun main(){
    val array = 1..5
    for (angka in array) {
        println(angka)
    }

    val sandang = arrayOf("sendal,sepatu,baju")
    for (data in sandang) {
        println(data)
    }

    for (index in sandang.indices){
        println(sandang[index])
    }
}