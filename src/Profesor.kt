class Profesor(nombre: String, apellido: String, nroIdentificacion: String, estadoCivil:String, var departamento:String):Persona(nombre, apellido, nroIdentificacion, estadoCivil) {
    fun cambioDepartamento(nuevoDepartamento: String): String{
        departamento = nuevoDepartamento
        return  departamento
    }

    override fun toString(): String {
        return "Profesor(departamento='$departamento')"
    }


}