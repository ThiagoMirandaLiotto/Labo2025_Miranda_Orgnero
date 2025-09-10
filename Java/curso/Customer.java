
package personas;

import objetos.Clothing;

public class Customer{
    private String name;
    private char size;
    private Clothing[] items;


    public void addItems(Clothing[] someItems){
        items = someItems;
    }

    public Customer() {
        this.name = "jorge";
        this.size = 's';

    }
    public Customer(String name, int mesurmate, char size){
            this.name=name;
            this.size=size;
            setSize(mesurmate);
    }
    public double getTotalClothingCost(){
        double total = 0;

            for (Clothing item : items){
                if(getSize()==item.getSize()) {
                    System.out.println("Item "+ item);
                    total = total + item.getPrice();
                    if(total<15) {
                    } break;

            }
        }
            return total;
    }

    public Clothing[] getItems() { return items;}
    public void setItems(Clothing[] items) { this.items = items;}
    public char getSize() {return size;}
    public void setSize(char size) {this.size = size;}
    public void setSize(int mesurement){
        switch(mesurement){
            case 1,2,3:
                size = 's';
                break;
                case 4, 5, 6:
                    size='m';
                    break;
                    case 7, 8 ,9:
                        size='l';
                        break;
                        default:
                            size='x';
        }

    }

    public void setName(String name) {this.name = name;}
    public String getName(){ return name;}

           
            

          
        
    }
