package Entities;

public class People {
String name;
int idade;
double altura;
double alturaMedia;

public People(String name, int idade, double altura) {
	
	this.name = name;
	this.idade = idade;
	this.altura = altura;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getIdade() {
	return idade;
}


public void setIdade(int idade) {
	this.idade = idade;
}


public double getAltura() {
	return altura;
}


public void setAltura(double altura) {
	this.altura = altura;
}


public double getAlturaMedia() {
	return altura / 3;
}


public void setAlturaMedia(double media) {
	this.alturaMedia = media;
}

public void status() {
	System.out.println("Pessoas cadastradas: ");
	System.out.println("Pessoa: " + this.name);
	System.out.println("Idade: " + this.idade);
	System.out.println("Altura: " + this.altura);
	System.out.printf("");
}






}
