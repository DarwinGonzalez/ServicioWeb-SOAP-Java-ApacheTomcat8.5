package com.pegaxchange.services;

//Clase elemento Producto que conformarán el catalogo
public class Product {
	
    private int id;				//Identificador de producto
    private String name;		//Nombre del producto
    private String category;	//Categoría del producto
    private double unitPrice;	//Precio del producto
    
    //Método constructor por defecto
    public Product() {}
    
    //Método constructor mediante el paso de parametros
    public Product(int id, String name, String category, double unitPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
    }
    
    //Método para obtener el ID del producto
    public int getId() {
        return id;
    }
    
    //Método para setear el valor del Id del producto
    public void setId(int id) {
        this.id = id;
    }
    
    //Método para obtener el valor del nombre del producto
    public String getName() {
        return name;
    }
    
    //Método para setear el nombre del producto
    public void setName(String name) {
        this.name = name;
    }
    
    //Método para obtener el valor de la categoría del producto
    public String getCategory() {
        return category;
    }
    
    //Método para setear el valor de la categoría del producto
    public void setCategory(String category) {
        this.category = category;
    }
    
    //Método para obtener el valor del precio del producto
    public double getUnitPrice() {
        return unitPrice;
    }
    
    //Metodo para setear el valor del precio del producto
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}