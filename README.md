# 📦 Produtos API

Uma API REST desenvolvida em **Java 21** com **Spring Boot**, criada com foco em **estudo e revisão de conceitos fundamentais** do framework.

---

## 🎯 Objetivo

Este projeto foi desenvolvido para **estudar, praticar e relembrar conceitos essenciais do Spring Boot**, incluindo:

- Estruturação de uma API REST
- Mapeamento de entidades
- Uso do Spring Data JPA
- Criação de endpoints RESTful
- Integração com banco de dados (H2 ou outro configurado)

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database (ou banco definido no `application.yml`)
- Maven

---

## 💡 Funcionalidades implementadas

- ✅ Cadastrar um produto
- ✅ Buscar produto por ID
- ✅ Buscar produtos por nome
- ✅ Atualizar produto
- ✅ Deletar produto

---

## ⚙️ Pré-requisitos

- Java 21 instalado
- Maven instalado

---

## ▶️ Como executar

```bash
# Clone o repositório
git clone https://github.com/FelipeDuan/produtos-api.git

# Acesse o diretório
cd produtos-api

# Compile o projeto
./mvnw clean install

# Execute a aplicação
./mvnw spring-boot:run
