// 1. Contar la cantidad de operaciones elementales que realizan los siguientes
// programas.

int ultimo1 (vector v) {
    return v[ v.size() - 1 ]; // 4
}
int ultimo2 (vector v) {
int i = v.size();               // 3
return v[ i - 1 ];              // 3
}
int ultimo3 (vector v) {
int i = 0;                      // 2
while ( i < v.size() ) {        // 2
i ++;                           // 2
}
return v[ i - 1 ];              // 3
}

//4n + 15

// 2. Calcular el tiempo de ejecución de peor caso (en notación O grande) de los
// siguientes programas con respecto al tamaño de los secuencias de entrada.
// Recordar que tanto la lectura como la escritura de un elemento en un vector
// tiene tiempo de ejecución perteneciente a O(1).
void f1 (vector &vec) {
i = vec.size() / 2;
while ( i >= 0 ){
    vec [ vec.size () / 2 - i ] = i;
    vec [ vec.size () / 2 + i ] = i;
    i - -;
}
}
O(n)


void f2 (vector &vec) {
i = 0;
while ( i < 10000){
    vec [ vec.size() / 2 - i ] = i ;
    vec [ vec.size() / 2 + i ] = i ;
    i ++;
}
}
O(1)


int f3 (vector &v1, int e) {
int i = 0;
while ( v1[ i ] != e ){
    i ++;
}
return i;
}
O(n)


void f4 (vector &vec) {
int rec = 0;
int max_iter = 1000;
if (max_iter > vec.size()) {
    max_iter = vec . size ();           //O(1)
}
for (int i =0; i < max_iter; i++) {         
    for(int j =0; j < max_iter ; j++) {
        res += vec [ i ] * vec [ j ];
    }
}}
O(1)


void f5 (vector &v1 , vector &v2) {
vector res ();
for (int i =0; i < v1.size (); i ++){
    res.push_back (v1[ i ]);                    // O(n)
}
for (int i =0; i < v2.size (); i ++){
    res.push_back (v2[ i ]);                    // O(n)
}
return res ;
}
O(n)



[1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 5, 5, 5]

// 3. 

int mesetaMasLarga (vector &v) {
int i = 0;          2
int maxMeseta = 0;  2
int meseta;         1
while ( i < v.size () ) {        2n
    int j = i + 1;               3n
    while ( j < v.size () && v [ i ] == v [ j ]) {         6n
        j ++;                                              2n
    }
    meseta = j - i;                 2n
    i = j;                          1n
    if ( meseta > maxMeseta ) {     1n
        maxMeseta = meseta ;        1n
    }
}
return maxMeseta ;                  1
}

// b) Calcular el tiempo de ejecución de peor caso de este programa en función
// del tamaño del vector.


// Cant Operaciones
18n + 6






// BUSQUEDA BINARIA
int busquedaBinaria(vector<int> v, int e){
    int inicio = 0;
    int fin = v.size() - 1;
    while(inicio <= fin){
        int medio = (inicio + fin)/2;
        if(v[medio] == e){return medio}
        else if(v[medio] > e){fin = medio - 1}
        else {inicio = medio + 1};
    }
    return -1;
}
// O(log2(n))
int busquedaBinaria(vector<int> v, int e){
    int inicio = 0;
    int fin = v.size()-1;
    while(inicio <= fin){
        int medio = (inicio + fin) / 2;
        if(v[medio] == e){return medio;}
        else if(v[medio] < e){inicio = medio + 1;}
        else{fin = medio - 1;}
    }

    return -1;
}


// BUSQUEDA BINARIA CON MATRIZ
pair<int, int> busquedaBinariaMatriz(vector<vector<int>> v, int e){
    int n = v.size();       // cantidad de filas
    int m = v[0].size();    // cantidad de columnas
    int inicio = 0;
    int fin = n*m -1;
    while(inicio <= fin){
        int medio = (inicio + fin)/2;
        int fila = medio / m;
        int col = medio % m;
        int nuevoMedio = v[fila][col];
        if(nuevoMedio == e){return {fila, col};}
        else if (nuevoMedio > e){
            fin = medio -1;
        } else {inicio = medio + 1;}
    }
    return {-1, -1};
}
// O(log2(n*m))
pair<int, int> busquedaBinariaConMatriz(vector<vector<int>> v, int e){
    int n = v.size();
    int m = v[0].size();
    int inicio = 0;
    int fin = n*m -1;
    while(inicio <= fin){
        int medio = (inicio + fin) / 2;
        int fila = medio / m;
        int col = medio % m;
        int nuevoMedio = v[fila][col];
        if(nuevoMedio == e){return {fila, col};}
        else if(nuevoMedio < e){inicio = medio + 1;}
        else{fin = medio - 1;}
    }
    return {-1, -1};
}


// BUBBLE SORT
void bubbleSort(vector<int> v){
    for(int i = 0; i < v.size()-1; i++){
        for(int j = 0; j < v.size()-1; j++){
            if(v[j] > v[j+1]){ //SI 1ero es mayor a el 2do
                //intercambio
                int temp = v[j+1];
                v[j+1] = v[j];
                v[j] = temp;
            }
        }
    }
}
// O(n²)

void bubleSort2(vector<int> v){
    for(int i=0; i<v.size()-1; i++){
        for(int j=0; j<v.size()-1; j++){
            if(v[j+1] < v[j]){
                int temp = v[j+1];
                v[j+1] = v[j];
                v[j] = temp;
            }
        }
    }
}



// INSERTION SORT
void insertionSort(vector<int> v) {
    for (int i = 1; i < v.size(); i++) {
        for (int j = i; j > 0; j--) {
            if (v[j - 1] > v[j]) {
                // Intercambio
                int temp = v[j];
                v[j] = v[j - 1];
                v[j - 1] = temp;
            }
        }
    }
}
// O(n²)
void insertionSort(vector<int> v){
    for(int i = 1; i<v.size(); i++){
        for(int j = i; j>0; j--){
            if(v[j-1] > v[j]){
                int temp = v[j];
                v[j] = v[j-1];
                v[j-1] = temp;
            }
        }
    }
}


// COMO UTILIZO O(n1+n2)
vector<int> concatenarVectoresOrdenados(vector<int> v1, vector<int> v2){
    vector<int> resultado;
    int i = 0, j = 0;
    while(i < v1.size() && j < v2.size()){
        if(v1[i] < v2[j]){
            resultado.push_back(v1[i]);
            i++;
        }else{
            resultado.push_back(v2[j]);
            j++;
        }
    }

    while(i < v1.size()){
        resultado.push_back(v1[i]);
        i++;
    }
    while(j < v2.size()){
        resultado.push_back(v2[j]);
        j++;
    }

    return resultado;
}
//O(n1+n2)
vector<int> concatenarVectorOrden(vector<int> v1, vector<int> v2){
    vector<int> res;
    int i=0, int j=0;
    while(i < v1.size() && j < v2.size()){
        if(v1[i] < v2[j]){
            res.push_back(v1[i]);
            i++;
        }else{
            res.push_back(v2[j]);
            j++;
        }
    }
    while(i < v1.size()){
        res.push_back(v1[i]);
        i++;
    }
        while(j < v2.size()){
        resultado.push_back(v2[j]);
        j++;
    }
    return res;
}


//10 ORDENAR VECTOR SIN RECORRERLO: SOLO CON O(n)
vector<int> ordenarVector123(vector<int> v){
    int contador1 = 0, contador2 = 0, contador3 = 0;
    for(int i = 0; i < v.size(); i++){
        if(v[i] == 1){contador1++;}
        if(v[i] == 2){contador2++;}
        else{contador3++;}
    }
    vector<int> res;
    for(int i = 0; i < contador1; i++){res.push_back(1);}
    for(int i = 0; i < contador2; i++){res.push_back(2);}
    for(int i = 0; i < contador3; i++){res.push_back(3);}
    return res;
}


vector<int> ordenarVector123(vector<int> v){
    vector<int> res;
    int contador1=0; int contador2=0; int contador3=0;
    for(int n: v){
        if(n == 1){contador1++;}
        else if(n == 2){contador2++;}
        else {contador3++;}
    }
    for(int i=0; i < contador1; i++){res.push_back(1);}
    for(int i=0; i < contador2; i++){res.push_back(2);}
    for(int i=0; i < contador3; i++){res.push_back(3);}
    return res;
}




// 4.
vector hacerAlgo (vector &v) {
    vector res ;
    for (int i = 0; i < 100; i ++) {
        res.push_back(contarApariciones(v , i+1));
    }
    return res ;
    }


    int contarApariciones (vector &v , int elem ) {
        int cantAp = 0;
        for (int i = 0; i < v.size(); i ++) {
            if ( v [ i ] == elem ) {
                    cantAp ++;
            }
        }
    }
// Calcular el tiempo de ejecución de peor caso del programa hacerAlgo con
// respecto al largo de v.
// 100 x O(n) = O(n)

// 5.
int sumarPotenciaHasta (int n) {
    int res = 0;
    int i = 1; 
    while( i < n ) {
        res = res + i;
        i = i * 2;
    }
    return res;
}
// ¿Qué tiempo de ejecución de peor caso tiene el programa en función del valor n?
// O(log2(n))




//6.
// Dada una secuencia de n números enteros, dar un programa que encuentre la
// máxima cantidad de elementos impares consecutivos cuya tiempo de ejecución de
// peor caso pertenezca a O(n).

int maxImparesConsecutivos(vector<int> v){
    int max = 0;
    int conteo = 0;
    for(int i = 0; i < v.size(); i++){
        if(v[i] % 2 == 0){
            if(conteo > max){
                max = conteo;
            }
            conteo = 0;
        }
        else{conteo++;}
    }

    // por si termina con una racha de impares
    if (conteo > max) {
        max = conteo;
    }
    return max;
} //O(n)


//8
vector<int> concatenarVectoresOrdenados(vector<int> v1, vector<int> v2){
    vector<int> resultado;
    int i = 0, j = 0;
    while(i < v1.size() && j < v2.size()){
        if(v1[i] < v2[j]){
            resultado.push_back(v1[i]);
            i++;
        }else{
            resultado.push_back(v2[j]);
            j++;
        }
    }

    while(i < v1.size()){
        resultado.push_back(v1[i]);
        i++;
    }
    while(j < v2.size()){
        resultado.push_back(v2[j]);
        j++;
    }

    return resultado;
}
//O(n1+n2)



//10
vector<int> ordenarVector123(vector<int> v){
    int contador1 = 0, contador2 = 0, contador3 = 0;
    for(int i = 0; i < v.size(); i++){
        if(v[i] == 1){contador1++;}
        if(v[i] == 2){contador2++;}
        else{contador3++;}
    }
    vector<int> res;
    for(int i = 0; i < contador1; i++){res.push_back(1);}
    for(int i = 0; i < contador2; i++){res.push_back(2);}
    for(int i = 0; i < contador3; i++){res.push_back(3);}
    return res;
}
