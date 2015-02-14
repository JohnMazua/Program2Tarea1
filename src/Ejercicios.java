public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{
		if(numero%2==0) return true; //divide por 2 y si el restante es 0 es par (true)
		return false; // si no es impar (falso)
	}
	
	//devuelve "gratis" si lempiras es igual a 0
	//devuelve "barato" si lempiras es menor que 100
	//devuelve "normal" si lempiras es menor que 200
	//de lo contrario devuelve caro
	//nota: solo aceptan minusculas
	static String obtenerPrecio(int lempiras)
	{
		if(lempiras==0) return "gratis"; //si lempiras es 0 que diga es gratis
		else if(lempiras<100) return "barato"; // si es menor de 100 es barato
		else if(lempiras<200) return "normal"; // si es mayor de 100 pasa aca y si es menor de 200 es normal
		return "caro"; // si es mayor de 200 es caro.
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{
		if(num==1)return 1; // si num es 1 entonces que el factorial retorne 1
        else num=num*factorial(num-1); // si num no 1, ese numero se multiplica por el factorial de num -1
        return num;
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{
		return arr[pos]; // retorna la posicion de pos del arreglo arr
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila]; // retorna la columna y fila del arreglo arr
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x; // retorna el atributo x de mi_clase
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2(); // implementa la funcion getXPor2 de la variable mi_clase.
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y); // Llama la funcion getXMasY de la variable mi_clase
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if(num==1) return 1; // num es 1 regresa 1
		else if (num==0) return 0; // si num es 0 regresa 0
		return fibonacci(num-1) + fibonacci(num-2); // si no retorna la suma de la funcion fibonacci del numero -1 mas la funcion de fibonacci del numero -2
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 1 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if(num==0) return 1; // si num es 0 devulve 1
		else if(num==1) return 2; // si num es 1 devuelve 2
		return funcionRecursiva(num-1)*2+1; // y para cualquier otro numero num llama a la misma funcion donde numero es menos uno y multiplicado por 2 y luego se le suma 1
	}
	
	public static void main(String[] args)
	{

	}

}
