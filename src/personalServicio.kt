class personalServicio(nombre: String, apellido: String, nroIdentificacion: String, estadoCivil:String, var seccion: String) : Persona(nombre, apellido, nroIdentificacion, estadoCivil){
    fun trasladoSeccion(nuevaSeccion: String): String{
        seccion = nuevaSeccion
        return seccion
    }

    override fun toString(): String {
        return "personalServicio(seccion='$seccion')"
    }


}