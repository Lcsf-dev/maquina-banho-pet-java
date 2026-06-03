# 🐶 Projeto Máquina de Banho para Pets (Pet Wash System)

Este é um projeto desenvolvido em **Java** para o **Bootcamp NTT DATA**, com o objetivo de praticar os pilares da Programação Orientada a Objetos (POO), como Encapsulamento, Classes, Atributos e Métodos.

## 📋 Sobre o Projeto

O sistema simula o funcionamento de uma máquina de banho automatizada para pets. Ele permite gerenciar insumos (água e shampoo), controlar a entrada e saída de pets, realizar o processo de banho e manter a higiene da própria máquina.

### Funcionalidades:
*   **Gerenciamento de Pets:** Criação de pets com nome e estado de limpeza.
*   **Controle de Insumos:** Níveis de água e shampoo que diminuem a cada banho ou limpeza.
*   **Regras de Negócio:**
    *   Não é possível colocar um pet se a máquina já estiver ocupada ou suja.
    *   O banho consome 10L de água e 2L de shampoo.
    *   Se um pet for retirado sem terminar o banho, a máquina fica suja e precisa de limpeza.
    *   A limpeza da máquina consome 3L de água e 1L de shampoo.
*   **Interface Interativa:** Menu via terminal para operar todas as funções da máquina.

## 🚀 Tecnologias Utilizadas
*   **Java**
*   **IntelliJ IDEA** (IDE)

## 🛠️ Como Executar

1.  Certifique-se de ter o **JDK** instalado em sua máquina.
2.  Abra o projeto no **IntelliJ IDEA**.
3.  Localize o arquivo `src/Main.java`.
4.  Execute o método `main`.

## 🕹️ Opções do Menu
1.  **Dar banho no pet:** Executa o processo de lavagem.
2.  **Abastecer a máquina com água:** Recarrega o reservatório de água.
3.  **Abastecer a máquina com shampoo:** Recarrega o reservatório de shampoo.
4.  **Verificar água da máquina:** Exibe a quantidade atual de água.
5.  **Verificar shampoo da máquina:** Exibe a quantidade atual de shampoo.
6.  **Verificar se tem pet no banho:** Informa se existe um pet na máquina.
7.  **Colocar pet na máquina:** Solicita o nome do pet e o insere na máquina.
8.  **Retirar pet da máquina:** Remove o pet e aplica a regra de limpeza, se necessário.
9.  **Limpar a máquina:** Realiza a manutenção para permitir novos usos.
0.  **Sair:** Encerra o sistema.

---
Desenvolvido durante o Bootcamp NTT DATA.
