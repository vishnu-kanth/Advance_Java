package com.lpu;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "tax_description", length = 200)
        private String description;

        @Column(name = "name", length = 150, nullable = false)
        private String name;

        @Column(name = "category", length = 100)
        private String category;

        @Column(name = "quantity", nullable = false)
        private int quantity;

        @Column(name = "price", nullable = false, precision = 10, scale = 2)
        private BigDecimal price;

        @Column(name = "sku", unique = true, length = 50, nullable = false)
        private String sku;

        @Column(name = "active", nullable = false)
        private boolean active;

        public Product() {
        }

        public Product(String name, String description, String category,
                       int quantity, BigDecimal price, String sku, boolean active) {
                this.name = name;
                this.description = description;
                this.category = category;
                this.quantity = quantity;
                this.price = price;
                this.sku = sku;
                this.active = active;
        }

        public Long getId() {
                return id;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getCategory() {
                return category;
        }

        public void setCategory(String category) {
                this.category = category;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public String getSku() {
                return sku;
        }

        public void setSku(String sku) {
                this.sku = sku;
        }

        public boolean isActive() {
                return active;
        }

        public void setActive(boolean active) {
                this.active = active;
        }

        @Override
        public String toString() {
                return "Product{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", description='" + description + '\'' +
                        ", price=" + price +
                        ", sku='" + sku + '\'' +
                        ", active=" + active +
                        '}';
        }
}
