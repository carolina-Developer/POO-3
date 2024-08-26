class Estudiante(nombre: String, apellido: String, nroIdentificacion: String, estadoCivil: String, var cursoMatriculado: String): Persona(nombre, apellido, nroIdentificacion, estadoCivil)  {
    fun matriculaNueva(nuevaMatricula: String) : String{
        cursoMatriculado = nuevaMatricula
        return cursoMatriculado
    }

    override fun toString(): String {
        return "Estudiante(cursoMatriculado='$cursoMatriculado')"
    }


}