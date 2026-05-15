# Condomínio Acesso API 🏢

Este projeto é uma API de controle de acesso para condomínios, desenvolvida como parte de um estudo prático acompanhado via YouTube. O objetivo principal é aplicar os conceitos de **Arquitetura Hexagonal** (Ports and Adapters) utilizando tecnologias modernas do ecossistema Java.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x** (Web, Data JPA)
- **H2 Database** (Banco de dados em memória para desenvolvimento)
- **Lombok** (Produtividade)
- **ModelMapper** (Conversão de DTOs/Entidades)
- **Arquitetura Hexagonal** (Organização de código)

## 🏗️ Arquitetura

O projeto segue os princípios da **Arquitetura Hexagonal**, garantindo que as regras de negócio (Core) sejam independentes de tecnologias externas (Banco de Dados, Protocolos de Comunicação, etc).

### Estrutura do Projeto:

*   `core/domain`: Contém as entidades de domínio (regras puras).
*   `core/ports`: Interfaces que definem as entradas (Driving) e saídas (Driven) do sistema.
*   `core/services`: Implementação dos casos de uso da aplicação.
*   `adapter/controllers`: Pontos de entrada da API (Adapters de entrada).
*   `adapter/repositories`: Implementações de persistência (Adapters de saída).
*   `adapter/entities`: Representações das tabelas do banco de dados (JPA Entities).
*   `infra/config`: Configurações de Beans e do framework.

## 🔑 Funcionalidades (Em desenvolvimento)

- [x] Cadastro e Gerenciamento de Moradores.
- [x] Gerenciamento de Usuários.
- [ ] Controle de Visitas e Visitantes.
- [ ] Autenticação e Autorização (Spring Security + JWT).

## 🛠️ Como Executar o Projeto

1.  **Pré-requisitos**: Ter o Java 17 e o Maven instalados.
2.  **Clonar o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/acesso-api.git
    ```
3.  **Executar a aplicação**:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  **Acessar o Console H2**:
    Acesse `http://localhost:8080/h2-console` para visualizar o banco de dados.
    - **JDBC URL**: `jdbc:h2:mem:testdb`
    - **User**: `admin`
    - **Password**: `admin`

---
Projeto desenvolvido para fins de aprendizado seguindo as diretrizes de Clean Architecture e SOLID.
