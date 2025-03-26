#include <iostream>
#include <vector>
using namespace std;

struct Fecha{
    int dia;
    int mes;
    int anio;
};

struct Jugador{
    string nombre;
    string posicion;
    int numero;
};

struct Historial{
    int V;
    int E;
    int D;
};

struct Equipo{
    string nombre;
    Jugador jugadores[11];
    vector<int>gc;
    vector<int>gf;
    int posicion;
    Historial historial;
};

struct Partido{
    string local;
    int golesLocal;
    string visitante;
    int golesVisitante;
    Fecha fecha;
    string estadio;
};


void ingresar_equipo(vector<Equipo> &equipos){
    cout<<endl;

    Equipo equipo;
    cout<<"Nombre del equipo: ";
    cin>>equipo.nombre;

    for(int i = 0; i < 11; i++){
        cout<<endl;
        Jugador jugador;
        cout<<"Jugador "<<i+1<<":"<<endl;
        cout<<"Nombre: ";
        cin>>jugador.nombre;
        cout<<"Numero: ";
        cin>>jugador.numero;
        cout<<"Posicion: ";
        cin>>jugador.posicion;
        equipo.jugadores[i] = jugador;
    }
    equipos.push_back(equipo);
}

void ingresar_partido(vector<Equipo> &equipos, vector<Partido> &partidos){
    Partido partido;
    
    string equipo;
    string equipo2;
    bool x = false;
    bool y = false;
    cout<<"Equipo local: ";
    cin>>equipo;
    for (int i = 0; i < equipos.size(); i++){
        if (equipos[i].nombre == equipo){
            x = true;
        }
    }
    if(!x){
        cout<<"El equipo no existe"<<endl;
        return;
    }
    
    cout<<"Equipo visitante: ";
    cin>>equipo2;
    for (int i = 0; i < equipos.size(); i++){
        if (equipos[i].nombre == equipo2){
            y = true;
        }
    }
    if(!y){
        cout<<"El equipo no existe"<<endl;
        return;
    }
    partido.local = equipo;
    cout << "Goles del local: "<<endl;
    cin >> partido.golesLocal;

    partido.visitante = equipo2;
    cout << "Goles del visitante: "<<endl;
    cin >> partido.golesVisitante;

    cout << "Fecha del partido: "<<endl;
    cout << "Dia: "<<endl;
    cin >> partido.fecha.dia;
    cout << "Mes: "<<endl;
    cin >> partido.fecha.mes;
    cout << "Año: "<<endl;
    cin >> partido.fecha.anio;

    cout << "Estadio del partido: "<<endl;
    cin >> partido.estadio;
    
    for (int i = 0; i < equipos.size(); i++)
    {
        if (equipos[i].nombre == partido.local)
        {
            if (partido.golesLocal > partido.golesVisitante)
            {
                equipos[i].historial.V += 1;    
            }
        }

        if (equipos[i].nombre == partido.visitante)
        {
            if (partido.golesVisitante > partido.golesLocal)
            {
                equipos[i].historial.V += 1;    
            }
        }
    }

    partidos.push_back(partido);

}


int main(){
    cout<<endl;
    vector<Equipo> equipos;
    vector<Partido> partidos;

    int opcion;
    cout<<"1 - Ingresar equipo"<<endl;
    cout<<"2 - Ingresar partido"<<endl;
    cout<<"3 - Mostrar partido"<<endl;
    cout<<"4 - Mostrar tabla"<<endl;
    cout<<"Ingresar opcion: ";
    cin>>opcion;

    switch (opcion){
    case 1:
        ingresar_equipo(equipos);
        break;
    
    case 2:
        ingresar_partido(equipos, partidos);
        break;
    
    default:
        break;
    }
}