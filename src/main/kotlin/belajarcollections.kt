fun main(){
    val hari =
listOf("senin","selasa","rabu","kamis",null,null,"senin")
println(hari)
println(hari[0])
println(hari.get(2))

val harimutable =
    mutableListOf("senin","selasa","rabu","kamis",null,null,"senin")
    println(harimutable)
    harimutable[4] = "jum'at"
    harimutable.set(5,"sabtu")
    println(harimutable)

    harimutable.removeAt(6)
    println(harimutable)
    harimutable.add("minggu")
    println(harimutable)
}