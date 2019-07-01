package com.uema.quiz.Model;

import java.util.ArrayList;

public class Carga {

    public static ArrayList<Questao> GetListQuestoes(){
        ArrayList<Questao> lista = new ArrayList<Questao>();
        lista.add(new Questao(
                "Qual foi o gatilho para iniciar-se a 1ª Guerra Mundial?",
                "Os conflitos entre países de posições políticas diferentes",
                "As cartas enviadas para países de alto poder como Estados Unidos",
                "O assassinato do arquiduque Francisco Fernando da Áustria",
                "Os muitos conflitos entre países Europeus e Norte-Americanos",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quais os quatros países que têm a maior população carcerária do mundo?",
                "Brasil, Estados Unidos, México e Índia",
                "China, Estados Unidos, Índia e Indonésia",
                "Brasil, Estados Unidos, China e Vaticano",
                "Estados Unidos, China, Rússia e Brasil",
                4,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "O que é Brexit?",
                "Saída do Reino Unido da Zona Euro",
                "Saída do Reino Unido da União Europeia",
                "Saída da Inglaterra do Reino Unido",
                "Fim da monarquia no Reino Unido",
                2,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quais os países que mais têm recebido refugiados Sírios?",
                "Turquia e Líbano",
                "Alemanha e França",
                "Jordânia e Sérvia",
                "Turquia e Egito",
                1,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "O que é o Acordo de Paris?",
                "Acordo internacional que trata da restrição de imigrantes em Paris",
                "Acordo internacional que trata do Desenvolvimento Sustentável",
                "Acordo internacional que trata da poluição radioativa",
                "Acordo internacional que trata do aquecimento global",
                4,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Qual a função da ONU?",
                "Zelar pela cultura em todas as nações",
                "Unir as nações com o objetivo de manter a paz e a segurança mundial",
                "Regular o funcionamento do sistema financeiro a nível internacional",
                "Gerenciar acordos de comércio entre os países",
                2,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Qual a primeira mulher a ganhar um prêmio Nobel?",
                "Elizabeth Blackweel",
                "Irène Joliot-Curie",
                "Valentina Tereshkova",
                "Marie Curie",
                4,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Chernobyl e Césio-137 fazem parte dos maiores acidentes nucleares da história. Em que países aconteceram?",
                "Ucrânia e Brasil",
                "Rússia e Ucrânia",
                "Japão e Brasil",
                "Taiwan e Alemanha",
                1,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Como morreu Saddam Hussein?",
                "Suicídio",
                "Ataque cardíaco",
                "Enforcado",
                "Decapitado",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Em que país se localizava Auschwitz, o maior campo de concentração nazista",
                "Alemanha",
                "Polônia",
                "Áustria",
                "Japão",
                2,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Qual o nome do atual líder da Coreia do Norte?",
                "Pak Pong-ju",
                "Kim Jong-II",
                "Moon Jae-in",
                "Kim Jong-un",
                4,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quem é o autor do famoso discurso 'Eu tenho um sonho'?",
                "Nelson Mandela",
                "Martin Luther King",
                "Barack Obama",
                "Carlota Joaquina",
                2,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Que país sediará as Olimpíadas de 2020?",
                "Rússia",
                "Catar",
                "Japão",
                "França",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quais as respectivas cores da reciclagem do papel, do vidro, do metal e do plástico?",
                "Azul, verde, amarelo e vermelho",
                "Verde, azul, vermelho e amarelo",
                "Vermelho, amarelo, verde e azul",
                "Verde, amarelo, azul e vermelho",
                1,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quais destes grupos são contraindicados para tomar a vacina contra a febre amarela?",
                "crianças até 2 anos, grávidas, doadores de sangue",
                "gestantes, lactantes, bebês com menos de 9 meses, diabéticos, idosos acima de 60 anos",
                "pacientes com câncer, idosos acima de 75 anos",
                "pessoas alérgicas, crianças até 2 anos, grávidas",
                2,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quem deu um tiro em Annalise Keating, na 2ª temporada?",
                "Bonnie Winterbottom",
                "Laurel Castillo",
                "Wes Gibbins",
                "Michaela Pratt",
                3,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Qual o único personagem que aparece em todos os episódios de todas as temporadas da série The Backyardigans?",
                "Austin",
                "Uniqua",
                "Tyrone",
                "Pablo",
                2,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Qual atriz brasileira participa do filme 'Eu sou a Lenda', ao lado de Will Smith?",
                "Morena Baccarin",
                "Rebecca da Costa",
                "Alice Braga",
                "Sônia Braga",
                3,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Quem interpreta Hermione Granger na Saga Harry Potter?",
                "Rachel Weisz",
                "Naomi Watts",
                "Charlize Teron",
                "Emma Watson",
                4,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Qual filme abaixo NÃO teve a participação do ator Dwayne Johnson, conhecido como The Rock",
                "A Montanha Enfeitiçada",
                "Velozes e Furiosos",
                "A Outra Face",
                "Terremoto - A Falha de San Andres",
                3,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Qual série de TV que usa a frase 'Salvar pessoas, caçar coisas o negócio da família'?",
                "The Walking Dead",
                "Sobrenatural/Supernatural",
                "The Vampire Diaries",
                "Game of Thrones",
                2,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Em Breaking Bad, qual é o personagem que mais fala 'Yo, Bitch!'",
                "Walter White",
                "Hank Schrader",
                "Saul Goodman",
                "Jesse Pinkman",
                4,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "O lema 'O Inverno está Chegando' é de qual Casa de Game of Thrones?",
                "Stark",
                "Baratheon",
                "Lannister",
                "Targaryen",
                1,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Qual foi a primeira série do Disney Channel a ter um filme para Walt Disney Pictures?",
                "As Visões da Raven",
                "Lizzie McGuire",
                "Cory na Casa Branca",
                "Phill do futuro",
                2,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Na série de TV Arrow, quem é o Arqueiro Verde",
                "Roy Harper",
                "Malcom Merlyn",
                "Oliver Queen",
                "Slade Wilson",
                3,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Com qual dessas séries a 'Hannah Montana' não fez algum especial?",
                "Zack & Cody : Gemeos em Ação",
                "Zack & Cody : Gemeos a Bordo",
                "Feiticeiros de Waverly Place",
                "Sunny entre Estrelas",
                4,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Na série de TV Friends, qual é o vício de Chandler Bing",
                "Cigarro",
                "Filmes adultos",
                "Álcoo",
                "Pôquer",
                1,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Em The Big Bang Theory, onde Sheldon, Rajesh, Leonard e Howard trabalham",
                "Universidade de Pasadena",
                "Callcenter",
                "Caltech",
                "Cheesecake Factory",
                3,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Qual o gênero da série de TV Revenge?",
                "Aventura",
                "Ação",
                "Ficção",
                "Drama",
                4,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Na abertura da séria de TV Pretty Little Liars, qual das meninas faz 'Shh' (som de silencio)?",
                "Emily",
                "Aria",
                "Hanna",
                "Alison",
                2,
                Categoria.FILMES_SERIES));
        lista.add(new Questao(
                "Qual opção contém apenas carros da Hyundai?",
                "Accent, Accord, Pajero",
                "Azera, ix35, Santa Fé",
                "Ecosport, Elantra, Sonata",
                "Cayenne, HB20, Tucson",
                2,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual opção contém apenas carros que não são da Volkswagen?",
                "CrossFox, Fox, Gol",
                "Celer, QQ, Tiggo",
                "Golf, SpaceFox, Touareg",
                "Saveiro, Tiguan, Voyage",
                2,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual foi o carro da Chevrolet mais vendido em 2011?",
                "Corsa Sedan",
                "Agile",
                "Prisma",
                "Celta",
                4,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual o carro mais vendido em 2004?",
                "Fiat Palio",
                "Chevrolet Corsa",
                "Volkswagen Gol",
                "Chevrolet Celta",
                3,
                Categoria.CARROS));
        lista.add(new Questao(
                "Assinale a única alternativa que o carro Citroën C4 Picasso não contém.",
                "Troca de marchas no volante",
                "Acelerador",
                "Freio",
                "Embreagem",
                4,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual o carro da Renault que mais fez sucesso em 2015?",
                "Sandero",
                "Duster",
                "Logan",
                "Fluence",
                1,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual desses carros da Chevrolet não é uma picape?",
                "Montana",
                "Corsa Pick-up",
                "Captiva",
                "D-20",
                3,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual destes carros não é da Volkswagen?",
                "Zafira",
                "Bora",
                "Parati",
                "Passat",
                1,
                Categoria.CARROS));
        lista.add(new Questao(
                "O carro Omega é de que marca?",
                "Volkswagen",
                "Fiat",
                "Ford",
                "Chevrolet",
                4,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual desses carros não é da Nissan?",
                "March",
                "Livina",
                "Cerato",
                "Sentra",
                3,
                Categoria.CARROS));
        lista.add(new Questao(
                "Quais são as respectivas marcas dos veículo A4, C180, X5?",
                "BMW, Audi, Mitsubishi",
                "Alfa Romeo, Bentley, Ferrari",
                "Audi, Mercedes-Benz, BMW",
                "Mercedes-Benz, BMW, Nissan",
                3,
                Categoria.CARROS));
        lista.add(new Questao(
                "Assinale o único veículo que não faz parte da montadora Ford.",
                "Fusion",
                "Fusca",
                "Focus",
                "Fiesta",
                2,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual a cor mais comum de Ferraris?",
                "Rosa",
                "Vermelha",
                "Amarela",
                "Azul-clara",
                2,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual a marca do carro Sorento?",
                "Renault",
                "Fiat",
                "Kia",
                "Mitsubishi",
                3,
                Categoria.CARROS));
        lista.add(new Questao(
                "Qual desses veículos não é da marca Kia?",
                "Picanto",
                "Sorento",
                "Cielo",
                "Mohave",
                3,
                Categoria.CARROS));
        lista.add(new Questao(
                "Futebol: Quem venceu a Champions League de 2008?",
                "Manchester United",
                "Real Madrid",
                "Chelsea",
                "Barcelona",
                1,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Futebol: Qual seleção foi a campeã mundial de 2006?",
                "Alemanha",
                "França",
                "Itália",
                "Rússia",
                3,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Futebol: Quais os maiores campeões do Campeonato Brasileiro?",
                "Corinthians e Flamengo",
                "São Paulo e Palmeiras",
                "Fluminense e Vasco",
                "Santos e Palmeiras",
                4,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Basquete: Qual time foi campeão da NBA 2011?",
                "Miami Heat",
                "Boston Celtics",
                "San Antonio Spurs",
                "Dallas Mavericks",
                4,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Futebol: Quem venceu o Mundial de Clubes de 2005?",
                "Liverpool",
                "Flamengo",
                "São Paulo",
                "Santos",
                3,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Futebol: Qual foi o humilhante placar sofrido pelo Santos no último confronto com o Barcelona?",
                "10 x 0",
                "8 x 0",
                "7 x 0",
                "6 x 0",
                2,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Futebol: Qual foi a seleção adversária da Argentina nas oitavas de final da Copa do Mundo de 2014?",
                "Suiça",
                "Chile",
                "Grécia",
                "Japão",
                1,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Volêi: Qual seleção venceu o Campeonato Mundial de Vôlei Masculino de 2014?",
                "Itália",
                "Alemanha",
                "Polônia",
                "Rússia",
                3,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Volêi: Qual a atual (2014) seleção feminina campeã olímpica?",
                "Estados Unidos",
                "Rússia",
                "China",
                "Brasil",
                4,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Olimpíadas de Inverno: Qual cidade e país a sediou em 2014?",
                "Sochi, Rússia",
                "Berna, Suiça",
                "Londres, Inglaterra",
                "Vancouver, Canadá",
                1,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Tênis: Quem venceu o Masters 1000 de Xangai 2014?",
                "Novak Djokovic",
                "Roger Federer",
                "Davi Ferrer",
                "Rafael Nadal",
                2,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Futebol: Quem venceu o Mundial de Clubes de 2012?",
                "Chelsea",
                "Barcelona",
                "Real Madrid",
                "Corinthians",
                4,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Basquete: Quem venceu o Campeonato Mundial Interclubes de Basquete de 2014?",
                "Real Madrid",
                "Flamengo",
                "Pinheiros",
                "Barcelona",
                2,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Futebol: Quem venceu a Copa do Mundo de 1950?",
                "Alemanha",
                "China",
                "Itália",
                "Uruguai",
                4,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Olimpíadas: Qual cidade e país foi sede do torneio em 2016?",
                "Pequim, China",
                "Nova Iorque, EUA",
                "Berlim, Alemanha",
                "Rio de Janeiro, Brasil",
                4,
                Categoria.ESPORTE));
        lista.add(new Questao(
                "Em que dia, mês e ano o Brasil foi descoberto?",
                "22 de abril de 1501",
                "22 de abril de 1600",
                "22 de abril de 1500",
                "22 de abril de 1555",
                3,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Qual é a capital do Brasil?",
                "Rio de Janeiro",
                "Distrito Federal",
                "Brasília",
                "São Paulo",
                3,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Qual é a capital do do estado brasileiro Piauí?",
                "Natal",
                "Teresina",
                "Campo Grande",
                "Manaus",
                2,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Qual a cidade mais populosa do Brasil?",
                "São Paulo",
                "Minas Gerais",
                "Rio de Janeiro",
                "Bahia",
                1,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Em que dia, mês e ano foi declarada a independência do Brasil?",
                "07 de setembro de 1828",
                "07 de setembro de 1850",
                "07 de setembro de 1848",
                "07 de setembro de 1822",
                4,
                Categoria.BRASIL));
        lista.add(new Questao(
                "No Brasil em que mês ocorre as eleições?",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                3,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Em que ano o primeiro astronauta brasileiro foi ao espaço?",
                "2007",
                "2006",
                "2009",
                "2010",
                2,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Em extensão territorial, o Brasil está qual posição?",
                "5º lugar",
                "3º lugar",
                "4º lugar",
                "6º lugar",
                1,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Em qual bandeira de estado do Brasil aparece a palavra Humanidade?",
                "Pará",
                "Rio Grande do Norte",
                "Mato Grosso",
                "Rio Grande do Sul",
                4,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Se alguém lhe chamar de Soteropolitano, você nasceu em:",
                "Sete Lagos (MG)",
                "Sorocaba (SP)",
                "Salvador (BA)",
                "Sobrália (MG)",
                3,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Qual o maior e menor estado do Brasil, respectivamente",
                "Minas Gerais e Santa Catarina",
                "Amazonas e Sergipe",
                "Pará e Alagoas",
                "Rio Grande do Sul e Sergipe",
                2,
                Categoria.BRASIL));
        lista.add(new Questao(
                "O feijão tropeiro acompanhado de couve e tutu é prato típico de qual estado?",
                "Bahia",
                "Espírito Santo",
                "Minas Gerais",
                "Mato Grosso",
                3,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Dos pratos abaixo, assinale o que não se destaca na culinária do Centro Oeste brasileiro.",
                "Pequi",
                "Mariscos",
                "Pacu",
                "Pamonha",
                2,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Quantos estados fazem divisa com o estado de Tocantins?",
                "6",
                "8",
                "4",
                "3",
                1,
                Categoria.BRASIL));
        lista.add(new Questao(
                "Quem foi o primeiro imperador e a primeira imperatriz do Brasil independente?",
                "D. Pedro e Maria Antonieta",
                "D. Pedro e Maria Leopoldina",
                "D. Pedro e Amélia Leuchtemberg",
                "D. Fernando e Isabel Bragança",
                2,
                Categoria.BRASIL));
        return lista;
    }
}
