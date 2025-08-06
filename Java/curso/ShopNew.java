
package curso;
import objetos.Clothing;
import personas.Customer;

public class ShopNew

{
        public static void main(String[] args) {
            double tax = 0.2;
            double total = 0.0;
            Clothing item1 = new Clothing("Blue Jacket", 20.9, 'm');
            Clothing item2 = new Clothing("Orange T-shirt", 10.5, 's');
            Clothing item4 = new Clothing("Green scarf", 15.5, 's');
            Clothing[] items = {item1, item2,new Clothing ("Blue T-Shirt", 29.9, 's'), item4};
            Customer c1 = new Customer("Clienteee",3, 's');
            c1.setName("clienteee");
            c1.setSize('s');
            System.out.println("Hello"+c1.getName());
            System.out.println("Min price"+Clothing.min_price);

            //System.out.println("Iteam 1 datos:"+" "+item1.getDescription()+" "+ item1.getPrice()+ " "+item1.getSize());
            //System.out.println("Iteam 2 datos:"+" "+item2.getDescription()+" "+ item2.getPrice()+ " "+item2.getSize());
            //total = ((item2.getPrice()*2)+item1.getPrice())*(1+tax);

            for(Clothing item : items) {
                if(item.getSize() == (c1.getSize())){
                    total += item.getPrice();
                    // System.out.println("Description: " + item.getDescription() + ", Price: " + item.getPrice() + ", Size: " + item.getSize());
                    System.out.println("Description: " + item);
                    if (total > 15){ break; }
                }
            }
            System.out.println("total="+ c1.getTotalClothingCost());
        }
    }
