package com.pegaxchange.services;

//Clase elemento Producto que conformar�n el catalogo
public class Product {
	
    private int id;				//Identificador de producto
    private String name;		//Nombre del producto
    private String category;	//Categor�a del producto
    private double unitPrice;	//Precio del producto
    
    //M�todo constructor por defecto
    public Product() {}
    
    //M�todo constructor mediante el paso de parametros
    public Product(int id, String name, String category, double unitPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
    }
    
    //M�todo para obtener el ID del producto
    public int getId() {
        return id;
    }
    
    //M�todo para setear el valor del Id del producto
    public void setId(int id) {
        this.id = id;
    }
    
    //M�todo para obtener el valor del nombre del producto
    public String getName() {
        return name;
    }
    
    //M�todo para setear el nombre del producto
    public void setName(String name) {
        this.name = name;
    }
    
    //M�todo para obtener el valor de la categor�a del producto
    public String getCategory() {
        return category;
    }
    
    //M�todo para setear el valor de la categor�a del producto
    public void setCategory(String category) {
        this.category = category;
    }
    
    //M�todo para obtener el valor del precio del producto
    public double getUnitPrice() {
        return unitPrice;
    }
    
    //Metodo para setear el valor del precio del producto
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}