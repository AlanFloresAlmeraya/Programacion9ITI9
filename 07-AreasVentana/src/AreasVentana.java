/**
 * 
 * @author Flores Almeraya Osvaldo Alan
 *
 */
public class AreasVentana {
	/**
	 * 
	 * @param lado Es el parametro uqe recibira para hacer los calculos 
	 * @return la operacion para sacar el perimetro del cuadrado
	 */
	public int cuadrado(int lado, int ladoC){
		return lado * ladoC;
}
	/**
	 * 
	 * @param lado1 Recibe el parametro del primer lado 
	 * @param lado2 Recibe el parametro del segundo lado
	 * @return la operacion para sacar el perimetro del rectangulo
	 */
	public int rectangulo(int lado1, int lado2){
		return lado1 * lado2 ;
	}
	/**
	 * 
	 * @param ladoT Recibe el parametro del primer lado 
	 * @return La operacion para sacar el prerimetro del triangulo Equilatero
	 */
	public int trianguloEquilatero(int ladoT, int ladoT2){
		return (ladoT * ladoT2) / 2;
	}
	/**
	 * 
	 * @param ladoE Recibe el parametro del primer lado
	 * @param ladoE2 Recibe el parametro del segundo lado
	 * @param ladoE3 Recibe el parametro del tercer lado
	 * @return La operacion para sacar el perimetro del triangulo Escaleno
	 */
	public int trianguloEscaleno (int ladoE, int ladoE2){
		return (ladoE * ladoE2) / 2;
	}
	/**
	 * 
	 * @param ladoE Recibe el parametro del primer lado
	 * @param ladoE2 Recibe el parametro del segundo lado
	 * @param ladoE3 Recibe el parametro del tercer lado
	 * @return La operacion para sacar el perimetro del triangulo Isosceles
	 */
	public int trianguloIsosceles (int ladoE, int ladoE2){
		return (ladoE * ladoE2) / 2;
	}
	/**
	 * 
	 * @param diametro Recibe el parametro del diametro 
	 * @return La operacion para sacar el perimetro del circulo
	 */
	public int circulo (double radio){
		double pi=3.1416;
		return (int) (pi * (radio * radio));
	}
}