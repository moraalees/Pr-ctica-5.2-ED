package src

import java.util.*

class Cheque(cantidad: Double, val nombre: String, val bancoProcedente: String, fecha: Date): Pago(cantidad, fecha) {

    override fun registrarPago() {
        println("Pago con cheque de $nombre del banco $bancoProcedente registrado por ${cantidad}€")
    }

}