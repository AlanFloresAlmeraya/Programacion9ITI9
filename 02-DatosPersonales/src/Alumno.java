/**
 * 
 * @author OsvaldoAlanFloresAlmeraya
 *
 */

public class Alumno {
	
	private String nombre;
	private String edad;
	private String telefono;
	private String domicilio;
	private String carrera;
	private String estatura;
	private String peso;
	private String email;
	private String cp;
	private String sexo;
	
	
	/**
	 * Este constructor sirve para que no ingresen a nuestro codigo
	 */
	public Alumno(){}
	/**
	 * 
	 * @param nombre regresa el valor de nombre
	 * @param edad regresa el valor de edad
	 * @param telefono regresa el valor de telefono
	 * @param domicilio regresa el valor de domicilio
	 * @param carrera regresa el valor de carrera
	 * @param estatura regresa el valor de estatura
	 * @param peso regresa el valor de estatura
	 * @param email regresa el valor de email
	 * @param cp  regresa el valor de cp
	 * @param sexo regresa el valor de sexo
	 */

	public Alumno(String nombre, String edad, String telefono, String domicilio, String carrera, String estatura,
			String peso, String email, String cp, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.carrera = carrera;
		this.estatura = estatura;
		this.peso = peso;
		this.email = email;
		this.cp = cp;
		this.sexo = sexo;
	}
    /**
     * 
     * @return el valor de nombre
     */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 	
	 * @param nombre manda este valor 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return el valor de edad
	 */
	public String getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad manda este valor
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return el valor de telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono manda este valor
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @return el valor de domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * 
	 * @param domicilio manda este valor
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	/**
	 * 
	 * @return valor de carrera
	 */
	public String getCarrera() {
		return carrera;
	}
	/**
	 * 
	 * @param carrera manda este valor
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	/**
	 * 
	 * @return el valor de estatura
	 */
	public String getEstatura() {
		return estatura;
	}
	/**
	 * 
	 * @param estatura manda este valor
	 */
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	/**
	 * 
	 * @return el valor de peso
	 */
	public String getPeso() {
		return peso;
	}
	/**
	 * 
	 * @param peso manda este valor
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}
	/**
	 * 
	 * @return el valor de email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email manda este valor
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return el calor de Cp
	 */
	public String getCp() {
		return cp;
	}
	/**
	 * 
	 * @param cp manda este valor
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	/**
	 * 
	 * @return el valor de Sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * 
	 * @param sexo manda este valor
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	
	

}
