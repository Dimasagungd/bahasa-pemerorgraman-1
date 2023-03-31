fun main () {
    var dosen = arrayOf("hendra", "afrig", "bety", "hikmah", "farid", "hikmah", "null")
    for (nama in dosen) {
        print("$nama, ")
    }
    println()
    println(dosen[1])
    println(dosen.get(0))
    dosen[0] = "hendra kurniawan"
    dosen.set(4, "farid fauzi")

    for (nama in dosen) {
        print("$nama, ")
    }
    dosen = arrayOf("hello friends")
    println()

    for (nama in dosen) {
        print("$nama, ")
    }
}