package helper;


import model.ListaTelefonica;
import model.Telefone;

public class Helper 
{
	private ListaTelefonica listaTel;
	
	public Helper() 
	{
		this.teste();
	}
	

	public void inserir(Telefone tele)
	{
		if(this.listaTel.getUltimoPos() <= 10)
		{
			int pos = this.listaTel.getUltimoPos();
			int result = pos +1;
			this.listaTel.getTelefones()[pos] = tele;
			System.out.println("número " + tele.getNum() + " inserido com sucesso na posição " + result);
			this.listaTel.setUltimoPos(pos+1);
		}
		else
			System.out.println("não cabem mais registros na lista");
	}
	
	public Telefone addTel(int num)
	{
		Telefone telefone = new Telefone();
		telefone.setNum(num);
		return telefone;
	}
	public void deletarTel(int numero)
	{
		for (int i = 0; i < this.listaTel.getUltimoPos(); i++)
		{
			if(numero == this.listaTel.getTelefones()[i].getNum())
			{
				this.listaTel.getTelefones()[i] = this.listaTel.getTelefones()[this.listaTel.getUltimoPos() - 1];
				System.out.println("deletado com sucesso");
			}
		}
		this.listaTel.getTelefones()[this.listaTel.getUltimoPos() - 1] = null;
		this.listaTel.setUltimoPos(this.listaTel.getUltimoPos() - 1);
		
	}
	public void buscarAll()
	{
		for(int i = 0; i < this.listaTel.getUltimoPos(); i++)
		{
			System.out.println(i+1 + "----" + this.listaTel.getTelefones()[i].getNum() );
		}
	}
	public Telefone buscar(int numero)
	{
		for (int i = 0; i < this.listaTel.getUltimoPos(); i++)
		{
			if(this.listaTel.getTelefones()[i].getNum() == numero)
			{
				System.out.println("numero encontrado na posicao " + i+1);
				return this.listaTel.getTelefones()[i];
			}
		}
		System.out.println("numero não encontrado");
		return null;
	}
	
	private void teste() 
	{
		this.listaTel = new ListaTelefonica();
		this.listaTel.setUltimoPos(0);
		this.inserir(addTel(335));
		this.inserir(addTel(123453));
		this.inserir(addTel(23453425));
		this.inserir(addTel(3354432));
		this.inserir(addTel(1923847));
		this.inserir(addTel(749231));
		this.inserir(addTel(1209384));
		this.buscar(3354432);
		this.buscarAll();
		this.deletarTel(23453425);
		this.buscarAll();
	}
}
