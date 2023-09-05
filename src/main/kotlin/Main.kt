// Lady lorena Gomez Forero
// 702526

open class Persona(val nombre: String, val apellidos: String, val numeroIdentificacion: String,var estadoCivil: String) {
    override fun toString(): String {
        return "Nombre: $nombre $apellidos, Doc: $numeroIdentificacion, Estado Civil: $estadoCivil"
    }
       fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
        estadoCivil = nuevoEstadoCivil
    }
}
class Estudiante( nombre: String, apellidos: String, numeroIdentificacion: String, estadoCivil: String,var cursoMatriculado: String) : Persona(nombre, apellidos, numeroIdentificacion, estadoCivil) {

    override fun toString(): String {
        return super.toString() + ", Curso Matriculado: $cursoMatriculado"
}

    fun matricularEnCurso(nuevoCurso: String) {
        cursoMatriculado = nuevoCurso
    }
}
class Profesor(nombre: String, apellidos: String, numeroIdentificacion: String, estadoCivil: String,var departamento: String) : Persona(nombre, apellidos, numeroIdentificacion, estadoCivil) {

    override fun toString(): String {
        return super.toString() + ", Departamento: $departamento"
    }

    fun cambiarDepartamento(nuevoDepartamento: String) {
        departamento = nuevoDepartamento
    }
}
class PersonaServicio(nombre: String, apellidos: String,numeroIdentificacion: String,estadoCivil: String,var seccionAsignada: String) : Persona(nombre, apellidos, numeroIdentificacion, estadoCivil) {

    override fun toString(): String {
        return super.toString() + ", Sección Asignada: $seccionAsignada"
    }

    fun cambiarSeccion(seccionNueva: String) {
        seccionAsignada = seccionNueva
    }
}
fun main() {

    val estudiante = Estudiante("Daira", "Gomez", "1007658654", "Comprometida", "Danza")
    val profesor = Profesor("Jhon", "Alvarez", "4567897", "Comprometido", "Diseño")
    val personal = PersonaServicio("Luis", "Jimenez", "9998759", "Casado", "Sala de juntas  ")

    estudiante.cambiarEstadoCivil("Soltera")

    profesor.cambiarDepartamento("Ingles")

    estudiante.matricularEnCurso("Folclor")

    personal.cambiarSeccion("Biblioteca")

    println(estudiante.toString())
    println(profesor.toString())
    println(personal.toString())
}



