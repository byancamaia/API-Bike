# API <img align="center" alt="" height="35" width="60" src="https://user-images.githubusercontent.com/33158051/103466606-760a4000-4d14-11eb-9941-2f3d00371471.png"> <img align="left" alt="" height="40" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">


![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

## API do sistema de locação de bicicletas

## Sobre o Projeto

🚧 Projeto em construção 🚧

Projeto em desenvolvimento para o aprendizado individual.
O sistema back-end permitirá que o usuário consiga alugar uma bicicleta com facilidade.



## ✔️ Técnicas e tecnologias utilizadas
- Java
- Spring Boot
- Maven
- MongoDB
- Heroku




## ✔️ Setup

- Instalar JDK 11.0.12
- Instalar Maven 3.3.9
- Instalar MongoDB
- Dependências:

  - Starter-Web
  - Starter-Test
  - MongoDB
  - Lombok
  - JPA
  - ModelMapper
  - JUnit



- Criar um projeto Maven (start.spring.io/ language Java)
- Modificar a versão do Spring Boot para 2.6.2
- Adicionar as dependências 




# Documentação das Rotas

# Rotas-bicicletas
## GET api/bike


    
    {
        "id": 2,
        "modelo": "Specialized",
        "cor": "Vermelha"
    },
    {
        "id": 3,
        "modelo": "Giant",
        "cor": "Preta"
    }
    

## POST CREATE_BIKE

    {
      "modelo": "Raleigh,
      "cor": "Verde"
    }



## PUT UPDATE_BIKE

    {
      "id": 27,
      "modelo": "GT - Update ",
      "cor": "Laranja - Update"
    }

  

## DELETE BIKE
http://localhost:8080/api/bike/3


# Rotas-user
falta criar