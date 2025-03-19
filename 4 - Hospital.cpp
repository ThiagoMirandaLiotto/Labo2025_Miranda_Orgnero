#include <iostream>
#include <vector>
using namespace std;


struct Fecha{
    int Dia;
    int Mes;
    int Anio;
};

struct Paciente{
    string nombre;
    int edad;
    int numeroHC;
    Fecha proximaCita;
};


void agregar_paciente(vector<Paciente> &pacientes){
    Paciente paciente;

    cout<<endl<<endl;
    cout<<"Nombre: "<<endl;
    cin>>paciente.nombre;

    cout<<"Edad: "<<endl;
    cin>>paciente.edad;

    cout<<"Numero de historia clinica: "<<endl;
    cin>>paciente.numeroHC;

    cout<<"Fecha de la proxima cita (Dia, Mes, Año): "<<endl;
    cin>>paciente.proximaCita.Dia;
    cin>>paciente.proximaCita.Mes;
    cin>>paciente.proximaCita.Anio;

    pacientes.push_back(paciente);
}

void cancelar_cita(vector<Paciente> &pacientes){
    int pacienteHC;
    int pacienteNum = -1;
    
    cout<<endl<<endl;
    cout<<"Numero de Historia Clinica del paciente: ";
    cin>>pacienteHC;

    for(int i = 0; i < int(pacientes.size()); i++){
        if(pacientes[i].numeroHC == pacienteHC){
            pacienteNum = i;
            pacientes.erase(pacientes.begin() + i);
            cout<<"Cita cancelada con exito"<<endl;
        }
    }

    if(pacienteNum == -1){
        cout<<"No existe ese paciente"<<endl;
    }
}

void citas_para_un_dia(vector<Paciente> &pacientes){
    int dia, mes, anio;
    vector<Paciente> listaDia;
    
    cout<<"Dia (Dia - Mes - Año): "<<endl;
    cin>>dia;
    cin>>mes;
    cin>>anio;

    for(int i = 0; i < pacientes.size(); i++){
        if(pacientes[i].proximaCita.Dia == dia){
            if(pacientes[i].proximaCita.Mes == mes){
                if(pacientes[i].proximaCita.Anio == anio){
                    listaDia.push_back(pacientes[i]);
                }
            }
        }
    }

    for(Paciente paciente:listaDia){
        cout<<endl;
        cout<<paciente.nombre<<endl;
        cout<<paciente.numeroHC;
    }
}

void mostrar_informacion(vector<Paciente> &pacientes){
    int pacienteHC;
    int pacienteNum = -1;
    
    cout<<endl<<endl;
    cout<<"Numero de Historia Clinica del paciente: ";
    cin>>pacienteHC;
    cout<<endl;

    for(int i = 0; i < int(pacientes.size()); i++){
        if(pacientes[i].numeroHC == pacienteHC){
            pacienteNum = i;

            Paciente paciente = pacientes[i];
            cout<<"Nombre del paciente: "<<paciente.nombre<<endl;
            cout<<"Edad: "<<paciente.edad<<endl;
            cout<<"Numero historia clinica: "<<paciente.numeroHC<<endl;
        }
    }

    if(pacienteNum == -1){
        cout<<"No existe ese paciente"<<endl;
    }
}


int main(){
    vector<Paciente> pacientes;

    bool x = true;
    while (x){
        int opcion;
        cout<<endl<<endl;
        cout<<"Que quiere hacer (1 - 5): "<<endl;
        cout<<"1 - Registrar un paciente"<<endl;
        cout<<"2 - Cancelar una cita"<<endl;
        cout<<"3 - Mostrar citas programadas para un dia"<<endl;
        cout<<"4 - Mostrar informacion de un paciente"<<endl;
        cout<<"5 - Salir"<<endl;
        cin>>opcion;

        switch (opcion){
        case 1:
            agregar_paciente(pacientes);
            break;

        case 2:
            cancelar_cita(pacientes);
            break;

        case 3:
            citas_para_un_dia(pacientes);
            break;

        case 4:
            mostrar_informacion(pacientes);

        default:
            break;
        }
    }
    
    
    
    
}
