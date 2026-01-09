# serverest-api-java

# Serverest API - Testes de Integração

Projeto de automação de testes de integração de API utilizando Java e RestAssured,
aplicando o padrão Service Object.

## Tecnologias
- Java 17
- Maven
- RestAssured
- JUnit 5

## Cenário testado
- Login positivo na API Serverest

## Executar os testes
```bash
mvn test

# 🚀 Serverest API – Automação de Testes de Integração

Projeto de **automação de testes de integração de API** desenvolvido em **Java**, utilizando **RestAssured** e **JUnit 5**, aplicando o padrão de projeto **Service Object**.

Os testes validam o fluxo de **login positivo** na API pública do **Serverest**.

---

## 🧪 Objetivo do Projeto

- Demonstrar boas práticas em testes de API
- Aplicar separação de responsabilidades com Service Object
- Validar respostas HTTP, mensagens e token de autenticação
- Servir como **projeto de portfólio para QA (Júnior / Pleno)**

---

## 🌐 API Testada

- **Base URL:** https://serverest.dev
- **Endpoint:** `/login`
- **Método:** `POST`

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Maven**
- **RestAssured**
- **JUnit 5**
- **org.json**
- **Git**

---

## 📁 Estrutura do Projeto

```text
serverest-api-java
├── pom.xml
├── requirements.txt
├── .gitignore
├── README.md
└── src
    ├── main
    │   └── java
    │       └── services
    │           └── LoginService.java
    └── test
        └── java
            └── tests
                └── LoginTest.java

