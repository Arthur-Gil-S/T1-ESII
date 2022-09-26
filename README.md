# T1-ESII

Etapas de Funcionamento:
1. Rodar Docker;
2. Comando 'mvn install';
3. Comando 'cd .\target\';
4. Comando 'java -jar .\Trabalho1-0.0.1-SNAPSHOT.jar';


Endopoints:
- Discipline
  1. Post
    {
    "cod": "0000",
    "name": "Math",
    "grade": "J",
    "class": "",
    }
  2. Get
  
  
- Student
  1. Post
    {
    "name": "Antonio Joao Mar",
    "doc": "0000000",
    "adress": "Porto Alegre"
    }
  2. Get, Get por ID
  
  
  - User
  1. Post
    {
    "name": "Maria George Damasco",
    "email": "mariagd@gmail.com",
    "pass": "abcdefg"
    }
  2. Get, Get por ID, Get por email e senha (login)
