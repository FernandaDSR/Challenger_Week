mongosh
use Question_5
db.people.InsertOne({
name: "Anderson",
age: 22,
phone: "95684-5684",
heigth: 165,
email: "helloworld@helloworld;com.br",
cpf: "5486524892",
birthday: new date(),
adrees: {
cep: "455-54",
street: "rua testeexemplo, 58",
complement: "Apto 6B",
neighborhood: "centro",
city: "Cidade grande",
state: "estado",
coutry: "Brasil",
}
});