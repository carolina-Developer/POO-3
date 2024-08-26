class Empleado( nombre: String,  apellido: String,  nroIdentificacion: String,  estadoCivil: String, var añoIncorporacion: String, var nroDespacho: Int): Persona(nombre,  apellido,  nroIdentificacion,  estadoCivil) {

    fun cambioDeEstadoCivil(nuevoEstado: String): String{
        this.estadoCivil = nuevoEstado
        return estadoCivil
    }

    fun reasignacionDespacho(nuevoDespacho: Int): Int{
        nroDespacho = nuevoDespacho
        return nroDespacho
    }

    override fun toString(): String {
        return "Empleado(añoIncorporacion='$añoIncorporacion', nroDespacho=$nroDespacho, estadoCivil=$estadoCivil)"
    }


}