#include <iostream>
#include <vector>
using namespace std;

struct Empleado{
    string nombre;
    string apellido;
    string nacimiento;
    string sexo;
    int salario;
};

Empleado empleadoConMayorSueldo(vector <Empleado> empleados, vector <Empleado> &empleadosPobres){
    int mayorSueldo = empleados[0].salario;
    Empleado empleadoMayorSueldo;

    for(Empleado empleado:empleados){
        if(empleado.salario > mayorSueldo){
            mayorSueldo = empleado.salario;
            empleadoMayorSueldo = empleado;
        }

        if(empleado.salario <= 400000){
            empleadosPobres.push_back(empleado);
        }
    }
    
    return empleadoMayorSueldo;
}


int main(){
    vector <Empleado> empleados;
    vector <Empleado> empleadosPobres;

    cout<<"Ingresar empleados"<<endl;
    
    int cantidad;
    cout<<"Cuantos empleados: ";
    cin>>cantidad;

    for (int i = 0; i < cantidad; i++){
        Empleado empleado;

        cout<<"Nombre: ";
        cin>>empleado.nombre;

        cout<<"Apellido: ";
        cin>>empleado.apellido;

        cout<<"Nacimiento: ";
        cin>>empleado.nacimiento;

        cout<<"Sexo: ";
        cin>>empleado.sexo;

        cout<<"Salario: ";
        cin>>empleado.salario;

        empleados.push_back(empleado);
        cout<<endl;
    }

    Empleado mayorSueldo = empleadoConMayorSueldo(empleados, empleadosPobres);


    cout<<endl;
    cout<<endl;
    cout<<"El empleado con mayor sueldo es: "<<endl;
    cout<<mayorSueldo.nombre<<" "<<mayorSueldo.apellido<<endl;
    cout<<"Salario: "<<mayorSueldo.salario<<endl;
    cout<<endl;


    cout<<"Empleados con menos de 400001 pesos"<<endl;
    for(Empleado empleado:empleadosPobres){
        cout<<"Empleado: "<<empleado.nombre<<" "<<empleado.apellido<<endl;
        cout<<"Sueldo: "<<empleado.salario<<endl;
    }
}