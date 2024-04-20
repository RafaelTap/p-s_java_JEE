package edu.rafael.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Automovel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String marca;
	private String modelo;
	private int ano;

	public Automovel() {
	}

	public Automovel(String marca, String modelo, int ano) {
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMensagem() {
		if (ano > 2009) {
			return "carro habilitado para transporte de passageiros.";
		}
		return "carro não habilitado para transporte de passageiros.";
	}

	public List<Automovel> getListaVeiculos() {
		List<Automovel> lista = new ArrayList<Automovel>();
		lista.add(new Automovel("ford", "fiesta", 2012));
		lista.add(new Automovel("ford", "focus", 2015));
		lista.add(new Automovel("fiat", "uno", 2019));
		lista.add(new Automovel("wolkswagen", "gol", 2011));
		lista.add(new Automovel("chevrolet", "tracker", 2020));

		return lista;

	}

}
