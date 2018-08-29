/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class rectangulo {
    
    private double base;
    private double altura;
    
    public rectangulo(double base, double altura ){
    
    this. altura=altura;
    this.base=base;
    
    
    
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double area(){
        if(base>0 && altura >0){
            
            return this.base*this.altura;
            
        }
        else{
        return 0;
        
        }
    
    
    }
    public double perimetro(){
        if(base>0 && altura >0){
            
            return 2*this.base+2*this.altura;
            
        }
        else{
        return 0;
        
        }
    
    
    }
    }
