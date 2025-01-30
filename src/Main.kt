package src

import java.text.SimpleDateFormat
import java.util.Date

fun main(){
    val cliente = Cliente("77497602E", "Cristian", "Morales Canosa")
    val producto1 = Producto(4, "Calcetines", "Un par de calcetines Nike", 3.99, 1.5, 300)
    val producto2 = Producto(2, "Mouse", "Mouse inalámbrico", 50.0, 5.0, 10)

    val formato = SimpleDateFormat("dd/MM/yyyy")
    val fecha1: Date = formato.parse("13/01/25")!!
    val fechaCaduca: Date = formato.parse("24/7/2031")

    val pedido = Pedido(1, fecha1, "pdte", cliente)
    pedido.agregarProducto(producto1, 3)
    pedido.agregarProducto(producto2, 1)

    producto2.actualizarStock(1000)

    println("Total del pedido: ${pedido.calcularTotal()}€")

    val pago = Tarjeta(1305.0, 774242482, fechaCaduca, "VISA", fecha1)
    pago.registrarPago()
}