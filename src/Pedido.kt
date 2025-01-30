package src

import java.util.Date

class Pedido(
    val id: Int,
    val fecha: Date,
    val estado: String,
    val cliente: Cliente,
    val productos: MutableMap<Producto, Int> = mutableMapOf()) {

    fun calcularTotal(): Double {
        var total = 0.0
        for ((producto, cantidad) in productos) {
            total += (producto.precio + producto.impuestos) * cantidad
        }
        return total
    }

    fun agregarProducto(producto: Producto, cantidad: Int){
        if (producto.stock >= cantidad) {
            productos[producto] = productos.getOrDefault(producto, 0) + cantidad
            println("Producto agregado al pedido.")
        } else {
            println("No hay suficiente stock para agregar $cantidad unidades de ${producto.nombre}")
        }
    }

}