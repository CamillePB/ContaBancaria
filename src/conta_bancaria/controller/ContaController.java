package conta_bancaria.controller;

import java.util.ArrayList;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A conta não foi encontrada");
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub

		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub
		listaContas.add(conta);// adiciona a classe COnta na array
		System.out.println("A Conta número: " + conta.getNumero() + " foi criada.");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		var buscaConta = buscarNaCollection(conta.getNumero());

		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("Os dados da conta foram atualizados");
		} else
			System.out.println("A conta não foi encontrada");

	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta))
				System.out.println("A conta foi excluida");
			else
				System.out.println("A conta não foi encontrada");
		}
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (conta.sacar(valor))
				System.out.println("O saque foi feito!");
			else
				System.out.println("A conta não foi encontrada");
		}
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.depositar(valor);
			System.out.println("O deposito foi feito!");
		}
	}

	@Override
	public void transferir(int numeroOrigem, int numero, float valor) {
		// TODO Auto-generated method stub
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroOrigem);

		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor)) {
				contaDestino.depositar(valor);
				System.out.println("A transferencia foi feita!");
			}
			else
				System.out.println("A conta não foi encontrada");
		}
	}

	public int gerarNumero() {
		return ++numero;// incrementando um numero a cada final de loop
	}

	public Conta buscarNaCollection(int numero) {// será utilizado varias vezes
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta;
		}

		return null;
	}

	public int retornaTipo(int tipo) {// será utilizado varias vezes
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta.getTipo();
		}

		return 0;
	}

}
