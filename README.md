# Design Patterns em Java

Este repositório foi criado para estudar e praticar os principais **Design Patterns** utilizando a linguagem **Java**. Cada padrão abordado incluirá uma explicação teórica, exemplos práticos e oportunidades para refatoração de código.

---

## 📚 O que são Design Patterns?

Design Patterns são soluções comprovadas para problemas recorrentes no desenvolvimento de software. Eles ajudam a criar sistemas mais flexíveis, reutilizáveis e fáceis de manter. Aqui, exploraremos padrões de criação, estruturais e comportamentais, com foco em aplicações práticas.

---

## 📋 Padrões Estudados

### 1. Strategy
**Categoria:** Comportamental  
**Descrição:**
O padrão Strategy permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Ele promove o princípio "aberto para extensão, fechado para modificação", permitindo alterar o comportamento de um objeto em tempo de execução.

**Quando usar?**
- Quando há várias maneiras de realizar uma tarefa e você deseja escolher ou alterar a estratégia em tempo de execução.
- Para evitar condicionais extensos como `if-else` ou `switch`.

**Exemplo prático:**
- Implementação de diferentes métodos de cálculo de impostos.

---

### 2. Factory
**Categoria:** Criação  
**Descrição:**
O padrão Factory abstrai a criação de objetos, delegando essa responsabilidade a subclasses ou métodos específicos. Ele promove a reutilização e flexibilidade, evitando instâncias diretas com o operador `new`.

**Quando usar?**
- Quando a criação de objetos se torna complexa e requer lógica adicional.
- Para centralizar a criação de objetos em um único lugar.

**Exemplo prático:**
- Geração de conexões com diferentes bancos de dados.

---

## 📂 Estrutura do Projeto
```plaintext
├── strategy
│   ├── strategy
│   │   ├── Strategy.java
│   │   ├── ConcreteStrategyA.java
│   │   ├── ConcreteStrategyB.java
│   │   └── StrategyPatternDemo.java
│   ├── factory
│   │   ├── Factory.java
│   │   ├── ConcreteProductA.java
│   │   ├── ConcreteProductB.java
│   │   └── FactoryPatternDemo.java
│   └── ...
├── tests
│   ├── strategy
│   │   └── StrategyTest.java
│   └── factory
│       └── FactoryTest.java
└── README.md
```

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **JUnit 5** para testes
- **Maven** para gerenciamento de dependências

---

## 🚀 Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/mtakeohirata/DesignPatterns.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd design-patterns-java
   ```
3. Compile o projeto:
   ```bash
   mvn compile
   ```
4. Execute os exemplos:
   ```bash
   mvn exec:java -Dexec.mainClass="strategy.StrategyPatternDemo"
   ```
5. Execute os testes:
   ```bash
   mvn test
   ```

---

## 🧩 Próximos Passos
- [ ] Adicionar exemplos para o padrão **Singleton**.
- [ ] Implementar o padrão **Observer**.
- [ ] Criar desafios para refatoração de código.

---

## 📄 Licença
Este projeto está licenciado sob a [MIT License](LICENSE).
