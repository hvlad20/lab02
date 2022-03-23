package com.company;

public class Main2 {
    enum Category {
        electrocasnice,
        haine,
        mancare
    }

    class Product
    {
        private int id;
        private String name;
        private double price;
        public Category category;
        private int quantity;
        private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

        public Product(int id, String name, double price, Category category, int quantity, String details) {
            if(id>0) {
                this.id = id;
            }
            if(name.length() > 4) {
                this.name = name;
            }
            this.price = price;
            this.category = category;
            this.quantity = quantity;
            this.details = details;
        }

        public Product(Product p) //validari
        {
            new Product(p.id, p.name, p.price, p.category, p.quantity, p.details);
        }

        public boolean equals(Product p)
        {
            if(p.id != this.id && p.name != this.name &&
                p.price != this.price && p.category != this.category &&
                    p.details != this.details)
                return false;
            return true;
        }

        public void applyDiscount(int discount)
        {
            this.price = this.price*discount;
        }

    }
}

