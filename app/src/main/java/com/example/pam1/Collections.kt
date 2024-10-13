

fun ContohList() {
    println("=== List ===")
    // List Read-Only

    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam list mutable
    shape.add("Circle")
    println(shape)

    // menghapus data dari list mutable
    shape.remove( "Triangle")
    println(shape)

    // mengubah data di dalam list mutable
    shape[0] ="Oval"
    println(shape)

    //  list read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak meiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// set read-only menggunakan set0f
// set mutable menggunakan mutableSetOf

fun ContohSet() {
    println()
    println("=== Set ===")

    // set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam set Mutable
    shape.add("Rectangle")
    print(shape)

    // menghapus data ke dalam set mutable
    shape.add("Rectangle")
    println(shape)

    // menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    // set read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// Map adalah kumpulan data yang disusun dalam pasangan key-value
// map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// map read-only menggunakan mapOf
//map mutable menggunakan mutableMapOf

fun ContohMap() {
    println()
    println("=== Map ===")

    //map read-only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1,"Square" to 2,"Triangle" to 3)
    println(shape)

    // menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data dari map mutbale
    shape.remove("Circle")
    println(shape)

    // mengubah data di dalam map mutable
    shape["Square"] = 5
    print(shape)

    //map read-only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}