package CS102.Lab.Week5.Lab4;

class Cleaning extends Product {
        private String brand;

        public Cleaning(String brand) {
            this.brand = brand;
            setType("Cleaning");
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String toString() {
            return super.toString() + "\nBrand: " + brand;
        }
    }
