package src

import java.util.Date

class Pedido(
    val id: Int,
    val fecha: Date,
    val estado: String,
    val productos: MutableMap<Producto, Int> = mutableMapOf()) {

    fun calcularTotal(): Double {
        var total = 0.0
        for ((producto, cantidad) in productos) {
            total += (producto.precio + producto.impuestos) * cantidad
        }
        return total
    }
}