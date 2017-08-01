package database;

import java.util.ArrayList;

import model.ONG;
import model.Posto;


public class SimulatedDatabase {
	
	
	private ArrayList<ONG> ongs;
	private ArrayList<Posto> postos;
	
	//descomente a linha abaixo para testar as questoes 3.b, 3.c e 3.d
	private ArrayList<Posto> postos_com_ong;
	
	
	public SimulatedDatabase() {
		
		//criando lista vazia de ONG's
		this.ongs = new ArrayList<ONG>();
		
		//criando lista vazia de Postos
		this.postos = new ArrayList<Posto>();		
		
		//criando cinco objetos da classe ONG
		ONG ong1 = new ONG("Com Fome", "Chaves", "SP");
		ONG ong2 = new ONG("Sem Fome", "Kiko", "RS");
		ONG ong3 = new ONG("Não Como", "Seu Madruga", "DF");
		ONG ong4 = new ONG("Faço Comida", "Dona Florinda", "RJ");
		ONG ong5 = new ONG("Já Comi", "Godines", "RR");
		
		//adicionando as ongs na lista de ongs da classe
		this.ongs.add(ong1);
		this.ongs.add(ong2);
		this.ongs.add(ong3);
		this.ongs.add(ong4);
		this.ongs.add(ong5);
		
		//criando sete objetos da classe posto
		Posto posto1 = new Posto(1, 150);
		Posto posto2 = new Posto(2, 50);
		Posto posto3 = new Posto(3, 420);
		Posto posto4 = new Posto(4, 970);
		Posto posto5 = new Posto(5, 540);
		Posto posto6 = new Posto(6, 110);
		Posto posto7 = new Posto(7, 800);
		
		//adicionando os postos na lista de postos da classe
		this.postos.add(posto1);
		this.postos.add(posto2);
		this.postos.add(posto3);
		this.postos.add(posto4);
		this.postos.add(posto5);
		this.postos.add(posto6);
		this.postos.add(posto7);
		
		
		//descomente as linhas abaixo para testar as questoes 3.b, 3.c e 3.d
		this.postos_com_ong = new ArrayList<Posto>();
		
		Posto posto11 = new Posto(11, 475, false, true,  true,  ong1);
		Posto posto12 = new Posto(12, 510, false, false, true,  ong4);
		Posto posto13 = new Posto(13, 100, false, true,  false, ong1);
		Posto posto14 = new Posto(14, 190, false, false, false, ong2);
		Posto posto15 = new Posto(15, 50,  true,  false, false, ong3);
		Posto posto16 = new Posto(16, 230, true,  false, true,  ong1);
		Posto posto17 = new Posto(17, 440, true,  true,  false, ong5);
		Posto posto18 = new Posto(18, 760, true,  true,  true,  ong4);
		Posto posto19 = new Posto(19, 88,  false, true,  false, ong2);
		Posto posto20 = new Posto(20, 300, false, false, false, ong1);
		
		this.postos_com_ong.add(posto11);
		this.postos_com_ong.add(posto12);
		this.postos_com_ong.add(posto13);
		this.postos_com_ong.add(posto14);
		this.postos_com_ong.add(posto15);
		this.postos_com_ong.add(posto16);
		this.postos_com_ong.add(posto17);
		this.postos_com_ong.add(posto18);
		this.postos_com_ong.add(posto19);
		this.postos_com_ong.add(posto20);
		
	}
	
	
	
	public ArrayList<ONG> getOngs() {
		return ongs;
	}


	public ArrayList<Posto> getPostos() {
		return postos;
	}


	public ArrayList<Posto> getPostos_com_ong() {
		return postos_com_ong;
	}


}
