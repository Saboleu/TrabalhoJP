# 🧩 Multi-Architecture App  

> **Estrutura de software multi-stack (Java, Python, Node) com SOLID, Clean Architecture e MVC**

---

<p align="center">
  <img src="https://img.shields.io/github/last-commit/PedroLimaDev/multi-architecture-app?color=blue&style=for-the-badge" alt="last commit">
  <img src="https://img.shields.io/github/languages/top/PedroLimaDev/multi-architecture-app?style=for-the-badge" alt="main language">
  <img src="https://img.shields.io/github/license/PedroLimaDev/multi-architecture-app?style=for-the-badge&color=brightgreen" alt="license">
  <img src="https://img.shields.io/badge/build-passing-success?style=for-the-badge&color=brightgreen" alt="build passing">
  <img src="https://img.shields.io/badge/tests-status-100%25-success?style=for-the-badge&color=blue" alt="tests status">
</p>

---

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,spring,python,fastapi,nodejs,express,git,vscode&theme=light" alt="Tech logos" />
</p>

---

## 🚀 Visão Geral

O **Multi-Architecture App** é um projeto modelo que demonstra **como estruturar sistemas de software de forma limpa, modular e escalável**, aplicando os princípios **SOLID**, **Clean Architecture** e o padrão **MVC (Model-View-Controller)**.

Ele apresenta **três implementações equivalentes** — em **Java (Spring Boot)**, **Python (FastAPI)** e **Node.js (Express)** — para comparação prática entre linguagens e arquiteturas.

---

## ⚙️ Tecnologias Utilizadas

| Stack | Framework | Testes | Gerenciador |
|:------|:-----------|:--------|:-------------|
| 🟦 **Java** | Spring Boot | JUnit | Maven |
| 🐍 **Python** | FastAPI | pytest | pip |
| 🟩 **Node.js** | Express | Jest | npm |

---

## 🧠 Conceitos Aplicados

- **Princípios SOLID**  
  - Single Responsibility  
  - Open/Closed  
  - Liskov Substitution  
  - Interface Segregation  
  - Dependency Inversion  
- **Arquitetura Limpa (Clean Architecture)**
- **Padrão MVC**
- **Injeção de Dependência**
- **Alta Coesão e Baixo Acoplamento**
- **Testabilidade e Escalabilidade**

---

## 📂 Estrutura do Projeto

```plaintext
multi-architecture-app/
│
├── java-springboot/
│   ├── src/main/java/com/example/demo/
│   │    ├── controller/
│   │    ├── service/
│   │    ├── model/
│   │    └── DemoApplication.java
│   ├── src/test/java/com/example/demo/
│   └── pom.xml
│
├── python-fastapi/
│   ├── app/
│   │    ├── main.py
│   │    ├── controllers/
│   │    ├── services/
│   │    ├── models/
│   │    └── tests/
│   └── requirements.txt
│
└── node-express/
    ├── src/
    │   ├── controllers/
    │   ├── services/
    │   ├── models/
    │   └── index.js
    ├── tests/
    ├── package.json
    └── README.md
🔄 Funcionalidade Base
Cada stack implementa a mesma rota de exemplo:

GET /hello
→ "Hello, World!"
Essa rota demonstra:

Separação entre camadas (Controller → Service → Model)

Aplicação de princípios SOLID

Organização uniforme entre linguagens

🧩 Estrutura em Camadas

Controller → Service → Repository → Model
Camada	Responsabilidade
Controller	Recebe requisições e retorna respostas
Service	Contém a lógica de negócio
Repository	Interage com o banco de dados ou fonte de dados
Model	Define as entidades e estruturas de dados

🧰 Execução Rápida
🟦 Java + Spring Boot

cd java-springboot
mvn clean install
mvn spring-boot:run
# Acesse: http://localhost:8080/hello
🐍 Python + FastAPI

cd python-fastapi
python -m venv venv
source venv/bin/activate   # Windows: venv\Scripts\activate
pip install -r requirements.txt
uvicorn app.main:app --reload
# Acesse: http://127.0.0.1:8000/hello
🟩 Node.js + Express

cd node-express
npm install
npm start
# Acesse: http://localhost:3000/hello
