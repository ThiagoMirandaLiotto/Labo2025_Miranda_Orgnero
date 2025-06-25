package sistema_mascotas;

    public class Gato extends Mascota {
        private int alegria = 0;

        public Gato(String nombre, String duenio) {
            super(nombre, duenio);
        }

        @Override
        public String saludar() {
            String saludoBase = "miau";
            return saludoBase;
        }
        @Override
        public String saludoExtraño(){
            return "GUAU!";
        }
        @Override
        public void alimentar() {
            alegria++;
        }

        @Override
        public String tipo() {
            return "Gato";
        }
    }

