#include <iostream>
#include <vector>
using namespace std;

int cantPedidos = 0;

struct Pedido
{
    int numero;
    string cliente;
    vector <string> productos;
    int cant;
    int precios;
};


void agregarProducto(vector <string> productos){
    int cant;
    string producto;
    cout << "Cantidad: ";
    cin >> cant;
    cout<<endl;
    for (int i = 0; i < cant; i++){
        cout << "Nombre producto "<<i+1<<": ";
        cin >> producto;
        productos.push_back(producto);
    }
}

void agregarPedido(vector <Pedido> &pedidos){
    cout<<endl;
    cout<<endl;
    int cant, cant2, cant3;
    cout << "Cuantos pedidos: ";
    cin >> cant;

    for (int i = 0; i < cant; i++){
        
        Pedido pedido;

        int x = 1;
        int num;
        while(x == 1){
            cout << "Numero: ";
            cin >> num;
            cantPedidos++;
            if(num > 0){
                x = 0;
            }else{
                cout<<"El numero de pedido tiene que ser mayor a 0"<<endl;
            }
        }
        pedido.numero = num;


        cout << "Cliente: ";
        cin >> pedido.cliente;
        cout << "Cuantos productos quiere?";
        cin >> cant2;
        for (int i = 0; i < cant2; i++)
        {
            string producto;
            cout<<endl;
            cout << "Producto: ";
            cin >> producto;
            cout << "Cantidad de ese producto: ";
            cin>>cant3;
            for (int i = 0; i < cant3; i++)
            {
                pedido.productos.push_back(producto);
            }
        }

        pedidos.push_back(pedido);
        cout << "";

        cout<<endl;
        cout<<endl;
    }
}

void cancelarPedido(vector <Pedido> &pedidos){
    cout<<endl<<endl;
    int pedidoNum;

    int x = 1;
    while(x == 1){
        cout<<"Numero del pedido a cancelar: ";
        cin>>pedidoNum;

        for(int i = 0; i < int(pedidos.size()); i++){
            cout<<pedidoNum<<endl;
            cout<<pedidos[i].numero<<endl;
            if(pedidos[i].numero == pedidoNum){
                x = 0;

                pedidos[i].numero = 0;
            }
        }

        if(x == 1){
            cout<<endl<<endl;
            cout<<"Ese numero de pedido no existe"<<endl;
            x = 0;
        }
    }

    
}



int main(){
    vector <string> productos;
    vector <Pedido> pedidos; 
    cout << "Agregar todos los productos del negocio"<<endl;    
    agregarProducto(productos);

    
    int x = 1;
    while(x == 1){
        int menu;
        cout<<endl;
        cout << "1. Agregar nuevo pedido: "<<endl;
        cout << "2. Cancelar un pedido (por num): "<<endl;
        cout << "3. Mostrar todos los pedidos"<<endl;
        cout << "4. Ingreso total del dia "<<endl;
        cout << "5. Salir "<<endl;
        cin >> menu;
        switch (menu)
        {    
        case 1:
            agregarPedido(pedidos);   
            break;
        
        case 2:
            cancelarPedido(pedidos);

        case 5:
            x = 0;
            break;
            
        default:
            break;
        }
    }
}