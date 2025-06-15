public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString();
    }
}




