package src

class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val impuestos: Double,
    var stock: Int) {

    fun actualizarStock(cantidad: Int): Boolean{
        if (cantidad < 0){
            println("No puedes actualizar el stock a un valor negativo.")
            return false
        } else {
            stock = cantidad
            println("Stock actualizado.")
            return true
        }
    }
}