

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
