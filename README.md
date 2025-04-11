# 💡 Design Pattern: Strategy (Java)

Este repositório demonstra a aplicação do **padrão de projeto Strategy** utilizando Java puro, simulando um sistema de cálculo de folha de pagamento para diferentes tipos de contrato.

---

## 🎯 Objetivo

- Aplicar o padrão **Strategy** para encapsular algoritmos variáveis (cálculo de pagamento)
- Reduzir a complexidade de código com muitos `if/else`
- Demonstrar o uso de **polimorfismo** com interfaces
- Respeitar princípios do **SOLID** (especialmente OCP - *Open/Closed Principle*)

---
## 📁 Estrutura do Projeto

```bash
design-patterns-strategy/
├── src/
│   ├── br/
│   │   └── com/
│   │       └── pattern/         
│   │               ├── strategy/             <- Interfaces e estratégias concretas
│   │               ├── model/                <- Modelos simples (ex: Contrato)
│   │               ├── service/              <- Lógica de negócio
│   │               └── Main.java             <- Classe com o exemplo funcional
├── README.md
└── pom.xml (se for Maven) / build.gradle (se for Gradle)
```

---

## ⚙️ Tecnologias

- Java 17
- Maven

---

## ▶️ Como executar
### Compile
- mvn compile

### Execute
- mvn exec:java -Dexec.mainClass="br.com.seuusuario.strategy.Main"

---

## 🧪 Exemplo de saída
Pagamento CLT: 5000.0
Pagamento PJ: 7000.0
Pagamento Estágio: 1200.0

---

## 📚 Conceitos aplicados

- Programação Orientada a Objetos

- Encapsulamento de comportamentos

- Interface como contrato

- Inversão de dependência

- Strategy Pattern

- OCP (Open/Closed Principle)

---







