package db;

// exceção especial para delete
// lançada quando tentamos excluir uma linha com chave primária
public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) {
		super(msg);
	}
}
