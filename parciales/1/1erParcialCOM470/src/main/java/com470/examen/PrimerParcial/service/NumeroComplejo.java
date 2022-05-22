package com470.examen.PrimerParcial.service;

public class NumeroComplejo {
	 private int _parteReal;
	    private int _parteImaginaria;

	    public NumeroComplejo(int _parteReal,int _parteImaginaria) {
	        this._parteReal = _parteReal;
	        this._parteImaginaria = _parteImaginaria;
	    }

	    public int getParteReal() {
	        return _parteReal;
	    }

	    public int getParteImaginaria() {
	        return _parteImaginaria;
	    }
	    public NumeroComplejo sumar(NumeroComplejo c){
	    return new NumeroComplejo(this.getParteReal()+c.getParteReal(),this.getParteImaginaria()+c.getParteImaginaria());
	      
	    }
	    public NumeroComplejo restar(NumeroComplejo c){
	    return new NumeroComplejo(this.getParteReal()-c.getParteReal(),this.getParteImaginaria()-c.getParteImaginaria());
	      
	    }
	    
	    public void sumar1(NumeroComplejo c){
		    this._parteReal = this._parteReal + c.getParteReal();
		    this._parteImaginaria = this._parteImaginaria + c.getParteImaginaria();
		    }

}
