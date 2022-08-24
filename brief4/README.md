# 🏗️: MOUNTAJRATE


Modélisation et implémentation de la base de données d’une application Web permettant d'exposer des produits locaux de la région
 - :date: Date Started: **26-05-2022.** 
 - :computer: Développé par: [LATIFA AMOUGUAY](https://github.com/LATIFADEV) && [ABDERRAHIM ELOUARDY](https://github.com/elouardyabderrahim)  && [ANAS MAKHLOUFI](https://github.com/anasmak04)
 - :office: Développé à: TechnoPark Agadir, Simplon Talent4Startups, Group *SoussTalents101*.
---

## Lien de l'espace de travail Trello
[Agile Sprint Board](https://trello.com/b/RCuXlj0C/montajrate)

## Énoncé de la portée du projet

<div style="display:flex">
<img src="/brief4-database/REPORT.PNG" height="200" width="300"/>

</div>

 [Cahier des charges du projet MOUNTAJARATE.](https://onedrive.live.com/edit.aspx?resid=EBEF1A2C83B13C3D!490&ithint=file%2cdocx)


## Diagramme de cas d'utilisation

<div style="display:flex">
<img src="/brief4-database/diagrame_cas_utilisation_1.png" height="200" width="300"/>
<img src="/brief4-database/diagrame_cas_utilisation2.png" height="200" width="300"/>
</div>

[cas_dutilisation_pharmacist.oom](/brief4-database/cas_dutilisation_pharmacist.oom)

## Diagramee de classe 

<div style="display:flex">
<img src="/brief4-database/diagrame_de_class.png" height="200" width="300"/>
</div>

[Diagramme_de_classes.moo](/brief4-database/Diagramme_de_classes.moo)
 ## USER STORY MAPPING
 
  [USER STORY MAPPING ](/brief4-database/USER_STORY_MAPPING.pdf)

## Migration de base de données 

  ```sql
  
  /*Create database:*/
  CREATE DATABASE "MOUNTAJRATE
 ---------------table of administrator---------------------------------------------------------------------------------------
    create table Administrateur(
	id_administrateur int primary key ,
    email VARCHAR(25),
    username  VARCHAR(25),
    passwrd VARCHAR(100)
    )
	
------------------ Remplir table administrateur----------------------------------------------------------------------------
	insert into Administrateur(id_administrateur,email,username,passwrd) values (1,'ansdev@gmail.com','anasmak','makmak123')
	insert into Administrateur(id_administrateur,email,username,passwrd) values (2,'taha@gmail.com','tahakira','taha123')
	insert into Administrateur(id_administrateur,email,username,passwrd) values (3,'ameen@gmail.com','ammenox','ameen123')
	insert into Administrateur(id_administrateur,email,username,passwrd) values (4,'kareem@gmail.com','kareem','kareem123')
	

-----------------table of products---------------------
    create table Produit(
	id_produit int primary key,
    nom_produit VARCHAR(25),
    type_produit VARCHAR(100),
    date_production DATE,
    qte_prod  int,
    prix_prd int,
    id_administrateur int  REFERENCES Administrateur(id_administrateur) 
)
---------------------------- Remplir table produits -------------------------------------------------------------
insert into Produit values  (1,'argane','cosmitique','2022-03-03',33,1200)
insert into Produit values 	(2,'argane','a manger','2022-04-04',43,1700)
insert into Produit values 	(3,'kawkaw amlou','a mange','2022-05-05',32,1500)
insert into Produit values	(4,'Amlo looze','a manger','2022-06-06',45,1500)
insert into Produit values 	(5,'huile de figue','cosmitique','2022-07-07',54,1400)

--------------------------table of vote-------------------------------------------------------------------------
    create table vote(
        id_produit int references Produit(id_produit),
        id_client int references Client(id_client),
        rate int,
		primary key (id_produit,id_client)
    )
	drop table vote
	
	insert into vote (id_produit,id_client,rate) values (1,1,8)


	select * from client
	
	insert into client (id_client,nom,prenom,email,date_naissance,pays,ville,code_postal,username,passwrd)
	values (1,'ameen','kariim','anasdev@gmail.com','1992-03-02','morocco','rabat','0','anasmak','anas5313M')
	
select * from Produit
select * from administrateur
select * from vote---------------table of administrator---------------------------------------------------------------------------------------
    create table Administrateur(
	id_administrateur int primary key ,
    email VARCHAR(25),
    username  VARCHAR(25),
    passwrd VARCHAR(100)
    )
	
------------------ Remplir table administrateur----------------------------------------------------------------------------
	insert into Administrateur(id_administrateur,email,username,passwrd) values (1,'ansdev@gmail.com','anasmak','makmak123')
	insert into Administrateur(id_administrateur,email,username,passwrd) values (2,'taha@gmail.com','tahakira','taha123')
	insert into Administrateur(id_administrateur,email,username,passwrd) values (3,'ameen@gmail.com','ammenox','ameen123')
	insert into Administrateur(id_administrateur,email,username,passwrd) values (4,'kareem@gmail.com','kareem','kareem123')
	

-----------------table of products---------------------
    create table Produit(
	id_produit int primary key,
    nom_produit VARCHAR(25),
    type_produit VARCHAR(100),
    date_production DATE,
    qte_prod  int,
    prix_prd int,
    id_administrateur int  REFERENCES Administrateur(id_administrateur) 
)
---------------------------- Remplir table produits -------------------------------------------------------------
insert into Produit values  (1,'argane','cosmitique','2022-03-03',33,1200)
insert into Produit values 	(2,'argane','a manger','2022-04-04',43,1700)
insert into Produit values 	(3,'kawkaw amlou','a mange','2022-05-05',32,1500)
insert into Produit values	(4,'Amlo looze','a manger','2022-06-06',45,1500)
insert into Produit values 	(5,'huile de figue','cosmitique','2022-07-07',54,1400)
--------------------------------------------------------------------------------------
create table client (
	id_client int primary key,
	nom varchar (50),
	prenom varchar (50),
	email varchar (50),
	date_naissance date,
	pays varchar (50),
	ville varchar (50),
	code_postal varchar (50),
	username varchar (50),
	passwrd varchar (55)

)
drop table client
--------------------------table of vote-------------------------------------------------------------------------
    create table vote(
        id_produit int references Produit(id_produit),
        id_client int references Client(id_client),
        rate int,
		primary key (id_produit,id_client)
    )
	drop table vote
	
	insert into vote (id_produit,id_client,rate) values (1,2,8)


	select * from client
	
	insert into client (id_client,nom,prenom,email,date_naissance,pays,ville,code_postal,username,passwrd) values (2,'ameen','kariim','anasdev@gmail.com','1992-03-02','morocco','rabat','0','anasmak','anas5313M')
	insert into vote(id_produit,id_client,rate) values (1,2,5)
select * from Produit
select * from administrateur
select * from vote




	 
	 

	
  
```

## Outils

- PowerDesigner.
- MarkDown.
- Google Docs.
- PostgreSQL.
- Trello.
- Discord.

## Les 5W du projet

- **What?**   
 
   Réalisation d'une application web *SOUSS MONTAJRATE* permette d'exposer des produits locaux de région.
 
- **Why?** 

  Pour évaluer les produits de région .

- **Where?** 

  Les produits sont locaux au SOUSSMASSA/Maroc, mais ils sont destinés à être annoncés et votés à l'échelle internationale/mondiale.
  
- **When?**  

   chaque année

- **Who?**  

  les coopératifs de la région.
  

## Concepts Checklist

- [X] UML modeling.
- [X] Use case diagram.
- [X] class diagram.
- [X] PostgreSQL.
- [X] tables.
- [X] primary keys.
- [X] foreign keys.
- [X] SQL queries.
- [X] Agile method.
     - Deadline 2 days.
     - Team: Divide Tasks  Members Strenghts & Weakneses.
     - Validation: Versioning start with Important Features first
- [X] Scrum.
- [X] sprint.
- [X] Sprint backlog(To do list).
- [X] User Story Mapping.

