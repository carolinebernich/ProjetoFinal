create database tce; -- Termo de Compromisso de Estágios (TCE) 
use tce;
create user poo identified by 'senha';
grant all privileges on tce.* to 'poo';
flush privileges;

create table usuario(
usuario varchar(12) not null primary key,
senha varchar(6) not null
);

create table curso(
cod_curso varchar(6) not null primary key,
nome_curso varchar(100) not null,
tel_coordenacao varchar(10) not null,
repre_coordenacao varchar(100) not null,
cargo_repre_coordenacao varchar(100) not null,
nome_universidade varchar(100) not null,
cnpj varchar(18) not null,
cep varchar(10) not null,
endereco varchar(150) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado char(2) not null,
tel_universidade varchar(10) not null,
repre_universidade varchar(100) not null,
cargo_repre_universidade varchar(100) not null
);

create table estagiario(
cpf varchar(12) not null primary key,
nome varchar(100) not null,
genero varchar(10) not null,
data_nascimento date not null, 
tel_celular varchar(11) not null,
tel_casa varchar(10),
cep varchar(10) not null,
endereco varchar(150) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
cod_curso varchar(6) not null,
data_ingresso date not null,
constraint FK_CURSO foreign key(cod_curso) references curso(cod_curso) 
);

create table concedente(
razao_social varchar(100) not null,
cnpj varchar(18) not null primary key,
tel_concedente varchar(10) not null, 
nome_repre varchar(100) not null, 
cargo_repre varchar(100) not null,
cep varchar(10) not null,
endereco varchar(150) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado char(2) not null
);

create table termo_compromisso (
cod_termo int not null primary key auto_increment,
inicio_estagio date not null,
fim_estagio date,
ch_diaria numeric(3,1) not null, 
ch_semanal numeric(3,1) not null,
area_estagio varchar(100) not null,
inicio_atividades time not null, 
fim_atividades time not null, 
atividades varchar(500) not null,
valor_bolsa numeric(10,2) not null, 
beneficios numeric(10,2) not null,
cpf_aluno varchar(12) not null,
cod_curso varchar(6) not null,
cnpj_empresa varchar(18) not null,
info_complementar varchar(500),
constraint FK_ESTAGIARIO foreign key(cpf_aluno) references estagiario(cpf),
constraint FK_COD_CURSO foreign key(cod_curso) references curso(cod_curso),
constraint FK_CONCEDENTE foreign key(cnpj_empresa) references concedente(cnpj)
);

insert into usuario values("carol", "user2"),
						  ("camila", "user1"),
						  ("rodrigo", "user6"),
						  ("handriel", "user4"),
                          ("lorenzo", "user5"),
                          ("emily", "user3"),
						  ("sibila", "user7");

insert into curso values("INF005", "Informática Biomédica", "5133038772", "Luciano Costa Blomberg",
							"Coordenador", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora"),
						("ENF002", "Enfermagem", "5133038842", "Rita Catalina Aquino Caregnato",
							"Coordenadora", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora"),
						("FAR003", "Fármacia", "5133038843", "Kellen Cristhinia Borges de Souza",
							"Coordenadora", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora"),
						("MED006", "Medicina", "5133038832", "Paulo José Zimermann Teixeira",
							"Coordenador", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora"),
						("PSI007", "Psicologia", "5133038839", "Mayte Raya Amazarray",
							"Coordenadora", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora"),                          
						("FIS004", "Física Médica", "5133038842", "Mirko Salomón Alva Sánchez",
							"Coordenador", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora"),
						("BIO000", "Biomedicina - diurno", "5133038840", "Alessandra Peres",
							"Coordenadora", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora"),
						("BIO001", "Biomedicina - noturno", "33038772", "Melissa Medeiros Markoski",
							"Coordenadora", "UFCSPA","92967595000177", "90050170", "Rua Sarmento Leite, 245",
                            "Centro Histórico", "Porto Alegre", "RS", "5133038700", "Lucia Campos Pellanda", "Reitora");                            
                            
insert into estagiario values("00110000101", "Jõao", "Masculino", "2000-07-20", "51900000001","5135350000",
							 "93150001", "Rua dos Andradas, 101", "Centro Histórico", "Porto Alegre", 
                             "INF005", "2020-03-27"),
							 ("00220000202", "Roberto", "Masculino", "2000-03-12", "51900000002","5135350001",
							 "93150002", "Rua Porto Lucena, 102", "Primavera", "Novo Hamburgo", 
                             "ENF002", "2020-03-27"),
							 ("00330000303", "Fernanda", "Feminino", "1999-02-05", "51900000003","5135350002",
							 "93150003", "Rua Duque de Caxias, 103", "Centro Histórico", "Porto Alegre", 
                             "FIS004", "2020-03-27"),                             
							 ("00440000404", "Ronaldo", "Masculino", "1997-06-01", "51900000004","5135350003",
							 "93150004", "Rua Guilherme Alves, 104", "Partenon", "Porto Alegre", 
                             "BIO000", "2018-03-27"),                           
							 ("00550000505", "Vivian", "Feminino", "2000-11-25", "51900000005","5135350004",
							 "93150005", "Rua 12 de Outubro, 105", "Partenon", "Porto Alegre", 
                             "MED006", "2020-03-27"),                             
							 ("00660000606", "Leticia", "Feminino", "2000-09-28", "51900000006","5135350005",
							 "93150006", "Avenida Assis Brasil, 106", "São José", "Porto Alegre", 
                             "PSI007", "2020-03-27"),                             
							 ("00770000707", "Bianca", "Feminino", "2001-01-18", "51900000007","5135350006",
							 "93150007", "Rua Luzitana, 107", "São José", "Porto Alegre", 
                             "FAR003", "2020-03-27"),                            
							 ("00880000808", "Carlos", "Masculino", "1998-04-14", "51900000008","5135350007",
							 "93150008", "Rua Alameda, 108", "Sarandi", "Porto Alegre", 
                             "BIO001", "2019-03-27"),                             
							 ("00990000909", "Poliana", "Feminino", "2002-05-27", "51900000009","5135350008",
							 "93150009", "Rua dos Pinheiros, 109", "Boa Vista", "São Leopoldo", 
                             "INF005", "2019-03-27"),
							 ("01000000110", "Matheus", "Masculino", "1999-12-04", "51900000010","5135350009",
							 "93150010", "Rua Carlos Klein, 110", "Boa Vista", "Portão", 
                             "INF005", "2018-03-27");                             
                             					
insert into concedente values("SAP Labs Latin America", "01254792215798", "5135003500", "Thomaz Ritter", 
							 "Gerente RH", "93130001","Avenida SAP, 188", "Cristo Rei", "São Leopoldo", 
                             "RS"),
							 ("Hospital Moinhos de Vento", "24894792865478", "5135013501", "Pamela Ferraza", 
							 "Gerente RH", "93130002","Rua Ramiro Barcelos, 910", "Moinhos de Vento", "Porto Alegre", 
                             "RS"),
							 ("PSICOCLIN", "65732892214455", "5135023502", "André Justo", 
							 "Gerente RH", "93130003","Rua Lindolffo Collor, 178", "Centro", "São Leopoldo", 
                             "RS"),
							 ("Santa Casa de Misericórdia", "54896573010806", "5135033503", "Jaqueline Sanches", 
							 "Gerente RH", "93130004","Rua Professor Annes Dias, 295", "Centro Histórico", "Porto Alegre", 
                             "RS"),
							 ("Hospital de Clínicas", "47850025630087", "5135043504", "Igor Monza", 
							 "Gerente RH", "93130005","Avenida Protásio Alves, 211", "Santa Cecilia", "Porto Alegre", 
                             "RS");

/*
insert into termo_compromisso values(000001,"2020-08-20", "2021-06-26", 6.0, 30.0, "TI", "08:00:00", "14:00:00", 
									"Programação",1000.00, 500.00, "01000000110", "INF005", "01254792215798",
									"Desenvolvimento de Software e banco de dados"),
									(000002,"2020-06-12", "2021-04-22", 6.0, 30.0, "Biomedicina", "09:00:00", "15:00:00", 
									"Análise de dados",800.00, 600.00, "00880000808", "BIO001", "47850025630087",
                                    "Buscar soluções cientificas para produzir medicamentos"),                                 
									(000003,"2020-02-05", "2021-08-18", 8.0, 40.0, "TI", "10:00:00", "18:00:00", 
									"Programação",1400.00, 800.00, "00990000909", "INF005", "01254792215798",
                                    "Desenvolvimento de Software e análise de dados"),
									(000004,"2019-12-22", "2021-06-26", 6.0, 30.0, "Biomedicina", "08:30:00", "14:30:00", 
									"Análise de dados",1000.00, 300.00, "00440000404", "BIO000", "24894792865478",
                                    "Buscar soluções cientificas para produzir medicamentos"),                                   
									(000005,"2020-11-07", "2021-08-02", 8.0, 40.0, "Fármacia", "07:00:00", "15:00:00", 
									"Produção de Medicamentos",1600.00, 600.00, "00770000707", "FAR003","54896573010806",
                                    "Separar, produzir e embalar medicamentos"),                                    
									(000006,"2020-05-09", "2021-01-14", 6.0, 30.0, "Psicologia", "09:30:00", "15:30:00", 
									"Atender pacientes",1200.00, 200.00, "00660000606", "PSI007", "65732892214455",
                                    "Atendimento de pacientes, conusultas e relatórios"),                                    
									(000007,"2020-07-26", "2021-11-20", 6.0, 30.0, "Radiologia", "13:00:00", "19:00:00", 
									"Radioterapia", 800.00, 550.00, "00330000303", "FIS004", "47850025630087",
                                    "Processamento de imagens"),								
									(000008,"2020-09-15", "2021-05-01", 8.0, 40.0, "Enfermagem", "08:00:00", "14:00:00", 
									"Emergência",1000.00, 500.00, "00220000202", "ENF002", "54896573010806",
                                    "Deverá atuar na areá de pronto socorro"),                                    
									(000009,"2021-01-15", "2022-01-15", 8.0, 40.0, "Medicina", "07:00:00", "15:00:00", 
									"Programação",1800.00, 900.00, "00550000505", "MED006", "24894792865478",
                                    "Prestar atenção nos outros médicos, relatar exames, cuidar de pacientes, etc..."),                                    
									(000010,"2021-03-29", "2022-03-29", 6.0, 30.0, "TI", "08:00:00", "14:00:00", 
									"Programação de banco de dados",800.00, 700.00, "00110000101", "INF005", "65732892214455",
                                    "Desenvolvimento de um banco de dados para os dados dos pacientes e das consultas");
 */
 
-- select * from usuario;
-- select * from curso;
-- select * from estagiario;
-- select * from concedente;
-- select * from termo_compromisso;

