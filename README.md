# InsertionSort
Estructura de datos
Algoritmo: <br /> 
 <br /> 
public int[] sort(int[] array){ <br /> 
        int anterior; <br /> 
        int actual; <br /> 
        for (int i = 1; i < array.length; i++) { <br /> 
            actual = array[i]; <br /> 
            anterior = i - 1; <br /> 
            while(((anterior) >=0) && (actual<array[anterior])){ <br /> 
                array[anterior + 1] = array[anterior]; <br /> 
                anterior--; <br /> 
            } <br /> 
            array[anterior+1] = actual;
        } <br /> 
        sorted=array; <br /> 
        return sorted; <br /> 
    } <br /> 
     <br /> 
- Ve el video en Youtube https://youtu.be/ePBXuAK-GFM donde explico el funcionamiento del algoritmo. 
