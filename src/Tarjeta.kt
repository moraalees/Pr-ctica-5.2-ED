package src

import java.util.Date

class Tarjeta(cantidad: Double, val numero: Int, val fechaCaducidad: Date, val tipo: String, fecha: Date): Pago(cantidad, fecha) {

    override fun registrarPago() {
        println("Pago con tarjeta de tipo $tipo registrado por \$${cantidad}")
    }

}