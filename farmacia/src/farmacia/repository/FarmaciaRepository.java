package farmacia.repository;
import farmacia.model.Produto;


public interface FarmaciaRepository {



		// CRUD
		
		public void procurarPorId (int id);
		public void listarTodos();
		public abstract void cadastrar(Conta conta);
		public void atualizar(Conta conta);
		public abstract void deletar (int numero);
		
		// Métodos bancários
		
		public void sacar(int numero , float valor);
		public void depositar(int numero , float valor);
		public void transferir(int numeroOrigem, int numeroDestino, float valor);
		
	}

}
