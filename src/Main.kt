import java.security.Principal

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

        val empleados = Empleado("Juan", "Prieto", "10005612545", "Casado", "2024", 16)
        val estudiante = Estudiante("Leidy", "Gamarra", "1000620156", "Soltera", "Ciencias")
        val profesor = Profesor("William", "shakespeare", "1000620156", "Soltero", "Ingenieria")
        val personalServicio = personalServicio("Maicol", "Yordan", "1999765145", "Separado", "Baños")

        var flag: Boolean = true
        var opc : Int
b¿
        do {
            println("""
                    Seleccione una de las siguientes opciones:
                    1. cambiar estado civil
                    2. reasignar despacho
                    3. matricula nueva
                    4. cambiar departamento
                    5. trasladar seccion
                    6.salir
            """.trimIndent())
                opc = readln().toInt()
                when(opc){
                        1 -> {
                                println(empleados.toString())
                                println("Ingrese el nuevo estado civil")
                                var nuevoEstado: String
                                nuevoEstado = readln().toString()
                                empleados.cambioDeEstadoCivil(nuevoEstado)
                                println("Se asigno un nuevo estado civil")
                                println(empleados.toString())
                        }
                        2 -> {
                                println(empleados.toString())
                                println("Ingrese el nuevo despacho")
                                var nuevoDespacho: Int
                                nuevoDespacho = readln().toInt()
                                empleados.reasignacionDespacho(nuevoDespacho)
                                println("Se asigno un nuevo despacho")
                                println(empleados.toString())
                        }
                        3 -> {
                                println(estudiante.toString())
                                println("Ingrese la nueva matricula")
                                var nuevaMatricula: String
                                nuevaMatricula = readln().toString()
                                estudiante.matriculaNueva(nuevaMatricula)
                                println("Se asigno una nueva matricula")
                                println(estudiante.toString())
                        }
                        4 -> {
                                println(profesor.toString())
                                println("Ingrese el nuevo departamento")
                                var nuevoDepartamento: String
                                nuevoDepartamento = readln().toString()
                                profesor.cambioDepartamento(nuevoDepartamento)
                                println("Se asigno un nuevo departamento")
                                println(profesor.toString())
                        }
                        5 -> {
                                println(personalServicio.toString())
                                println("Ingrese el nuevo traslado de la seccion")
                                var nuevoTraslado: String
                                nuevoTraslado = readln().toString()
                                personalServicio.trasladoSeccion(nuevoTraslado)
                                println("Se asigno un nuevo traslado")
                                println(personalServicio.toString())
                        }
                        6 -> {
                                println("Saliendo del sistema ...")
                                flag = false
                        }

                }


        }while (flag)


}
/*
        println("Ingrese el nombre")
        var nombre = readln().toString()
        println("Ingrese el apellido")
        var apellido = readln().toString()
        println("Ingrese el nro.Identificacion")
        var nroIdentificacion = readln().toString()
        println("Ingrese el estado civil")
        var estadoCivil = readln().toString()

        println("Ingrese el año de incorporacion")
        var añoIncorporacion = readln().toString()
        println("Ingrese el nro de despacho")
        var despacho = readln().toInt()

        println("Ingrese el curso matriculado")
        var cursoMatriculado = readln().toString()

        println("Ingrese el nombre del departamento")
        var departamento = readln().toString()

        println("Ingrese la seccion")
        var seccion = readln().toString()
* */