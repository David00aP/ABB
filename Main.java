public class Main
{
         public static void main(String[] args){
		ABB arbol = new ABB();

		Nodo raizArbolABB = arbol.regresaRaiz();
		//25, 8, 29, 38, 27
		arbol.insertarValor(25);
		arbol.insertarValor(8);
		arbol.insertarValor(29);
		arbol.insertarValor(38);
		arbol.insertarValor(27);
		System.out.println("");
		
		arbol.muestraAcostado(0, arbol.regresaRaiz());
		
                System.out.println("");
                arbol.inOrden(arbol.regresaRaiz());
                System.out.println("recorrido inorden ");
                
                arbol.preOrden(arbol.regresaRaiz());
                System.out.println("recorrido preorden ");
                
                arbol.postOrden(arbol.regresaRaiz());
                System.out.println("recorrido postorden ");
                
                //Comprobar si el nodo se elimino
                arbol.eliminarNodo(29);
                arbol.inOrden(arbol.regresaRaiz());
                System.out.println("recorrido inorden ");
                
                arbol.muestraAcostado(0, arbol.regresaRaiz());
	}
}
