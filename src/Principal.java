import java.util.*;

public class Principal {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Vendedor> vendedores = new ArrayList<>();
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Vendedor");
            System.out.println("3. Cadastrar Produto");
            System.out.println("4. Novo Pedido");
            System.out.println("5. Listar Pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do cliente: ");
                        String nomeC = sc.nextLine();
                        System.out.print("CPF do cliente: ");
                        String cpfC = sc.nextLine();
                        clientes.add(new Cliente(nomeC, cpfC));
                        System.out.println("Cliente cadastrado!");
                        break;
                    case 2:
                        System.out.print("Nome do vendedor: ");
                        String nomeV = sc.nextLine();
                        System.out.print("CPF do vendedor: ");
                        String cpfV = sc.nextLine();
                        System.out.print("Comissão (%): ");
                        double comissao = sc.nextDouble();
                        sc.nextLine();
                        vendedores.add(new Vendedor(nomeV, cpfV, comissao));
                        System.out.println("Vendedor cadastrado!");
                        break;
                    case 3:
                        System.out.print("Nome do produto: ");
                        String nomeP = sc.nextLine();
                        System.out.print("Preço do produto: ");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        produtos.add(new Produto(nomeP, preco));
                        System.out.println("Produto cadastrado!");
                        break;
                    case 4:
                        if (clientes.isEmpty() || vendedores.isEmpty() || produtos.isEmpty()) {
                            System.out.println("Cadastre ao menos um cliente, vendedor e produto antes de criar um pedido.");
                        } else {
                            System.out.println("Escolha o cliente:");
                            for (int i = 0; i < clientes.size(); i++)
                                System.out.println(i + " - " + clientes.get(i));
                            int idxC = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Escolha o vendedor:");
                            for (int i = 0; i < vendedores.size(); i++)
                                System.out.println(i + " - " + vendedores.get(i));
                            int idxV = sc.nextInt();
                            sc.nextLine();

                            Pedido pedido = new Pedido(clientes.get(idxC), vendedores.get(idxV));
                            boolean addMais = true;
                            while (addMais) {
                                System.out.println("Escolha o produto:");
                                for (int i = 0; i < produtos.size(); i++)
                                    System.out.println(i + " - " + produtos.get(i));
                                int idxP = sc.nextInt();
                                System.out.print("Quantidade: ");
                                int qtd = sc.nextInt();
                                sc.nextLine();
                                pedido.adicionarItem(produtos.get(idxP), qtd);

                                System.out.print("Adicionar outro produto? (s/n): ");
                                addMais = sc.nextLine().equalsIgnoreCase("s");
                            }
                            pedidos.add(pedido);
                            System.out.println("Pedido criado com sucesso!");
                        }
                        break;
                    case 5:
                        if (pedidos.isEmpty()) {
                            System.out.println("Nenhum pedido cadastrado.");
                        } else {
                            for (Pedido p : pedidos) {
                                Relatorio.imprimir(p);
                                System.out.println("---------------");
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Tente novamente.");
                sc.nextLine();
            }
        } while (opcao != 6);
    }
}