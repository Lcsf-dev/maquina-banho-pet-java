public class MaquinaBanho {
    // Atributos privados (Encapsulamento)
    private int agua;
    private int shampoo;
    private Pet petAtual;
    private boolean precisaLimpeza;

    // Constantes de capacidade
    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    // Construtor: a máquina começa cheia e limpa
    public MaquinaBanho() {
        this.agua = MAX_AGUA;
        this.shampoo = MAX_SHAMPOO;
        this.petAtual = null;
        this.precisaLimpeza = false;
    }

    // --- OPERAÇÕES DA MÁQUINA ---

    public void colocarPet(Pet pet) {
        if (this.petAtual != null) {
            System.out.println("❌ Erro: Já existe um pet na máquina!");
            return;
        }
        if (this.precisaLimpeza) {
            System.out.println("❌ Erro: A máquina está suja. Limpe-a antes de colocar outro pet.");
            return;
        }
        this.petAtual = pet;
        System.out.println("🐶 " + pet.getNome() + " entrou na máquina de banho.");
    }

    public void darBanho() {
        if (this.petAtual == null) {
            System.out.println("❌ Erro: Não há nenhum pet na máquina para dar banho.");
            return;
        }
        if (this.agua < 10 || this.shampoo < 2) {
            System.out.println("❌ Erro: Insumos insuficientes! Abasteça a máquina.");
            return;
        }

        // Consumo dos insumos
        this.agua -= 10;
        this.shampoo -= 2;
        this.petAtual.setLimpo(true);
        System.out.println("🧼 Banho concluído com sucesso! " + this.petAtual.getNome() + " está limpinho.");
    }

    public void retirarPet() {
        if (this.petAtual == null) {
            System.out.println("❌ Erro: Não há pet na máquina para retirar.");
            return;
        }

        // Regra de ouro do enunciado: saiu sem estar limpo -> máquina fica suja
        if (!this.petAtual.isLimpo()) {
            this.precisaLimpeza = true;
            System.out.println("⚠️ Alerta: " + this.petAtual.getNome() + " saiu sem terminar o banho. A máquina ficou suja!");
        } else {
            System.out.println("✨ " + this.petAtual.getNome() + " foi retirado cheiroso!");
        }

        this.petAtual = null; // Máquina esvaziada
    }

    public void limparMaquina() {
        if (!this.precisaLimpeza) {
            System.out.println("✨ A máquina já está limpa.");
            return;
        }
        if (this.agua < 3 || this.shampoo < 1) {
            System.out.println("❌ Erro: Insumos insuficientes para realizar a limpeza!");
            return;
        }

        this.agua -= 3;
        this.shampoo -= 1;
        this.precisaLimpeza = false;
        System.out.println("🧹 Máquina limpa com sucesso e pronta para uso.");
    }

    // --- ABASTECIMENTO (2 litros por vez) ---

    public void abastecerAgua() {
        if (this.agua + 2 <= MAX_AGUA) {
            this.agua += 2;
        } else {
            this.agua = MAX_AGUA; // Garante que não vai transbordar os 30L
        }
        System.out.println("💧 Água abastecida. Nível atual: " + this.agua + "L");
    }

    public void abastecerShampoo() {
        if (this.shampoo + 2 <= MAX_SHAMPOO) {
            this.shampoo += 2;
        } else {
            this.shampoo = MAX_SHAMPOO; // Garante que não passa de 10L
        }
        System.out.println("🧴 Shampoo abastecido. Nível atual: " + this.shampoo + "L");
    }

    // --- MÉTODOS DE VERIFICAÇÃO ---

    public void verificarNivelAgua() {
        System.out.println("💧 Nível de Água: " + this.agua + "L / " + MAX_AGUA + "L");
    }

    public void verificarNivelShampoo() {
        System.out.println("🧴 Nível de Shampoo: " + this.shampoo + "L / " + MAX_SHAMPOO + "L");
    }

    public void verificarTemPet() {
        if (this.petAtual != null) {
            System.out.println("🐾 Tem pet no banho: Sim (" + this.petAtual.getNome() + ")");
        } else {
            System.out.println("🐾 Tem pet no banho: Não");
        }
    }
}