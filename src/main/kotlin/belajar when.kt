fun main() {
    val nilai = 70

    when(nilai){
        100 -> print("sempurna")
        90,91,92,93,94,95,96,97,98,99 -> print("Sangat baik")
        in 80..89 -> print("baik")
        !in 0..100 -> print("nilai tidak valid")
        else -> print("cukup")
    }
}