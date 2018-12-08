import java.util.ArrayList;
import java.util.Collections;

public class Prueba_Java {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(4);
		numeros.add(-9);
		numeros.add(32);
		numeros.add(-1);
		
		System.out.println(numeros.toString());
		Collections.sort(numeros);		//MergeSort
		System.out.println(numeros.toString());
		
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Luke");
		nombres.add("Leia");
		nombres.add("Anakyn");
		nombres.add("Obi-> Wan kenobi");
		
		ArrayList<String> copiaNombres = (ArrayList<String>) nombres.clone();
		System.out.println(nombres.toString());
		Collections.sort(nombres);
		System.out.println(nombres.toString());
		
		System.out.println("\n---------- Ordenamiento en Orden Inverso");
		System.out.println(copiaNombres.toString());
		Collections.sort(copiaNombres, Collections.reverseOrder());
		System.out.println(copiaNombres.toString());
		
		System.out.println("\n=========================================");
		class Alumno implements Comparable<Alumno>{
			String numControl;
			Integer edad;
			public Alumno(String numControl, int edad) {
				this.numControl = numControl;
				this.edad = edad;
			}
			@Override
			public String toString() {
				return "Alumno [numControl=" + numControl + ", edad=" + edad + ", getClass()=" + getClass()
						+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
			/*@Override
			public int compareTo(Alumno arg0) {
				return numControl.compareTo(arg0.numControl);
			}*/
			public int compareTo(Alumno arg0) {
				return edad.compareTo(arg0.edad);
			}
		}//class Alumno
		
		Alumno a1 = new Alumno("17", 20);
		Alumno a2 = new Alumno("1", 1);
		Alumno a3 = new Alumno("7", 56);
		Alumno a4 = new Alumno("878", 30);
		Alumno a5 = new Alumno("3", 7);
		
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		
		System.out.println(alumnos.toString());
		//ORDENAR LOS ALUMNOS
		Collections.sort(alumnos);
		System.out.println(alumnos.toString());
		System.out.println(Collections.binarySearch(numeros, -1));
		
		//TAREA: ALICAR binary Search En Collection Alumnos
		
	}

}