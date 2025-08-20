package sistema_mascotas;

    public class Gato extends Mascota {
        private int alegria = 0;

        public Gato(String nombre, String duenio) {
            super(nombre, duenio);
        }

        @Override
        public String saludarNormal() {
            String saludoBase = "miau";

            return saludoBase;

        }

        @Override
        public String saludarNormal(String duenio, String nombre) {
            return "";
        }

        @Override
        public String saludarNoDuenio() {
            String saludoExtraño = "MIAU";

            return saludoExtraño;

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

