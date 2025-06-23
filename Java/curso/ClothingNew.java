package objetos;

public class Clothing

{

        private String description;
        private double price;
        private char size='s';
        public final static double min_tax=0.2;
        public final static double min_price=10;

        public Clothing(String description, double price, char size){
                this.description=description;
                this.price=price;
                this.size=size;

        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public double getPrice() {
                price = price + (price * min_tax);
                return price;
        }

        public void setPrice(double price) {
                if(price<min_price) {
                        this.price = min_price;
                }
                this.price = price;
        }

        public char getSize() {
                return size;
        }

        public void setSize(char size) {
                this.size = size;
        }

        public static void main(String[] args) {

        @Override 
        public String toString(){
                return getDescription()+","+getPrice()+ ","+getSize();
        }



          
        }
    }
