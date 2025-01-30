package src

import java.util.Date

abstract class Pago(val cantidad: Double, val fecha: Date) {

    abstract fun registrarPago()

}