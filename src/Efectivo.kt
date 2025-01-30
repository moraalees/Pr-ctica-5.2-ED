package src

import java.util.*

class Efectivo(cantidad: Double, val tipoMoneda: String, fecha: Date): Pago(cantidad, fecha) {

    override fun registrarPago() {
        println("Pago en efectivo con moneda $tipoMoneda registrado por \$${cantidad}")
    }

}