# 📚 Projeto Disciplina Web - Ítalo Rhide

> Projeto desenvolvido para a disciplina de Desenvolvimento Web do 5º período.

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Finalidade |
|-----------|-----------|
| **Java 17** | Linguagem principal |
| **Spring Boot 3.4.2** | Framework backend |
| **Maven** | Gerenciamento de dependências e build |
| **Thymeleaf** | Template engine para views HTML |
| **Spring Data JPA** | Persistência de dados |
| **H2 Database** | Banco de dados em memória (desenvolvimento) |

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/br/ueg/desenvolvimento/web/projeto_italo_rhide/
│   │   ├── ProjetoItaloRhideApplication.java  # Classe principal
│   │   ├── controller/                         # Controllers da aplicação
│   │   ├── model/                              # Entidades JPA (se houver)
│   │   ├── repository/                         # Interfaces de persistência
│   │   └── service/                            # Regras de negócio
│   └── resources/
│       ├── templates/                          # Views Thymeleaf (.html)
│       ├── static/                             # Arquivos estáticos (CSS, JS)
│       └── application.properties              # Configurações
└── test/                                       # Testes unitários
```

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven instalado (ou use o wrapper `./mvnw`)

### Passos
```bash
# 1. Clone o repositório
git clone https://github.com/ItaloRhide/disciplina-web-projeto-italo-rhide.git

# 2. Acesse a pasta do projeto
cd disciplina-web-projeto-italo-rhide

# 3. Compile e execute com Maven Wrapper
./mvnw spring-boot:run
# ou no Windows:
mvnw.cmd spring-boot:run

# 4. Acesse no navegador
http://localhost:8080
```

## ⚙️ Configurações

O arquivo `src/main/resources/application.properties` contém as configurações da aplicação. O banco H2 está configurado para uso em memória, ideal para desenvolvimento e testes.

## 🧪 Testes

```bash
# Executar testes com Maven
./mvnw test
```

## 📄 Licença

Projeto acadêmico - Uso educacional.

## 👨‍💻 Autor

**Ítalo Rhide**  
[GitHub](https://github.com/ItaloRhide)
```
