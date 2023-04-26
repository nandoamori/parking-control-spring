# Parking Spot Control
## :page_facing_up: Descrição
É uma aplicação web desenvolvida para controle de vagas de estacionamento de um condomínio. Nela o usuário pode criar, listar, editar e deletar cadastro de moradores para a utilização das vagas disponíveis. CRUD criado utilizando Java, Spring framework e PostgresSQL.

### 🛠️ Tecnologias utilizadas:


* [IDE IntelliJ](https://www.jetbrains.com/idea/)
* [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/)
* [Spring boot](https://spring.io/projects/spring-boot)
* [Spring web](https://spring.io/web-applications)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
* [Lombok](https://projectlombok.org/)
* [Postgres](https://www.postgresql.org/)


### Rotas

- `POST /parking-spot`: Esta rota recebe os dados da vaga de estacionamento (`parkingSpotNumber`, `licensePlateCar`, `brandCar`, `modelCar`, `colorCar`, `responsibleName`, `apartment` e `block`) e a cadastra no banco de dados .

- `GET /parking-spot`: Rota que lista todas as vagas cadastradas.

- `PUT parking-spot/:id`: Rota para alterar dados de vagas cadastradas anteriormente.

- `DELETE /parking-spot/:id`: Rota que deleta vaga cadastrada através do  `id` enviado como parâmetro.

- `GET /parking-spot/:id`: Rota que recebe o `id` como parâmetro e retorna informações de vaga específica.

### Exemplo
Se eu chamar a rota `POST /parking-spot` passando como parâmetro 
    `{"parkingSpotNumber": "2052",
    "licensePlateCar": "FCT3014",
    "brandCar": "Hyundai",
    "modelCar": "HB20",
    "colorCar": "white",
    "responsibleName": "Claudia Dantas",
    "apartment": "235",
    "block": "A"}`
    recebo uma resposta com id gerado através do UUID: 
    
       [    
        {
          id: "026e849f-8123-4b39-bb9b-8a55b43b469b",
          parkingSpotNumber: "2052",
          licensePlateCar: "FCT3014",
          brandCar: "Hyundai",
          modelCar: "HB20",
          colorCar: "white",
          registrationDate: "2023-04-24T18:05:19.3266883",
          responsibleName: "Claudia Dantas",
          apartment: "235",
          block: "A"
        }
      ];
