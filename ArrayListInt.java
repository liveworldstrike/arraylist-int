import java.util.Arrays;
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //Array para guardar los numeros enteros 
    private int[]listaElementos;
    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        listaElementos = new int[0];
    }

    /**
     * añade un elemento a la colección al final
     */
    public void add(int elemento)
    {
        int size = listaElementos.length;
        // crea una lista temporal .    
        int[] listaTemporal = new int [size + 1];
        for(int a = 0; a< size; a++)
        {
            // guardan todos los elementos de la lista principal en la temporal.
            listaTemporal[a] = listaElementos[a];
        }
        listaTemporal[size] = elemento;
        //le damos a la lista principal el valor de la segunda
        listaElementos = listaTemporal;
    }

    /**
     * añade un elemento a la colección en la posición especificada
     * Si el valor de index no es válido, entonces no hace nada.
     * elementos añadidos se desplazan una posición.
     */
    public void add(int index, int elemento)
    {
        int size = listaElementos.length;
        // crea una lista temporal .    
        int[] listaTemporal = new int [size + 1]; 
        int a = 0;
        if ((index <= size) && (index >= 0))
        {
            for(; a < index; a++)
            {
                listaTemporal [a] = listaElementos [a];
            }
            listaTemporal[index] = elemento;
            for(int cont = a; cont < size; cont++)
            {
                listaTemporal[cont + 1] = listaElementos[cont];
            }
            listaElementos = listaTemporal;
        }
    }
   
    /**
    * vacía la colección.
    */
    public void clear()
    {
        listaElementos = new int[0];
    }   
    
    /**
     * devuelve true si la colección contiene ese elemento
     * false en cualquier otro caso.
     */
    public boolean contains(int elemento)
    {
        boolean contiene = false;
        int  a = 0;
        while (a < listaElementos.length && !(contiene))
        {
            if(listaElementos[a] == elemento)
            {
                contiene = true;
            }
            a++;
        }
        return contiene;
    }
    
    /**
     * devuelve el elemento existente en la posición indicada
     * si no es valido -1
     */
    public int get(int index)
    {
        int elemento = -1;
        if((index < listaElementos.length) && (index >= 0))
        {
            elemento = listaElementos[index];
        }
        return elemento;
    }
    
    /**
     * reemplaza el elemento en la posición index con el valor de element
     * sino es valido no hace nada .
     */
    public void set(int index, int element)
    {
        
        if((index < listaElementos.length) && (index >= 0))
        {
            listaElementos[index] = element;
        }
    
    }
    
    /**
     * devuelve el indice en el que aparece la primera ocurrencia del elemento especificado 
     * -1 si no existe en la lista 
     */
    public int indexOf(int elemento)
    {
        boolean existe = false;
        int a = 0;
        int index = -1;
        while((a < listaElementos.length) && !(existe))
        {
            if(listaElementos[a] == elemento)
            {
                index = a;
                existe = true;
            }
            a++;            
        }
        return index;
        
    }
    
    /**
     * devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean nadaEnLaLista = false;
        if(listaElementos.length == 0)
        {
            nadaEnLaLista = true;
        }
        return nadaEnLaLista;
        
    }
}

