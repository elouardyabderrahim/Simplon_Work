create table Roles(
    role_Id Serial primary key,
    nom varchar(20)
);
create table users(
    Id Serial primary key,
    nom varchar(20),
    prenom varchar(20),
    telephone varchar(30),
    email varchar(30),
    login varchar(20),
    pasword varchar(20),
    role_Id int,
    FOREIGN KEY (role_Id) REFERENCES Roles(role_Id)
);
create table Responsable(
    domaine varchar(20),
    type varchar(20),
    etat varchar(20)
)INHERITS (users);

create table Participant(
    domaine varchar(20),
    structure varchar(20)
)INHERITS (users);

create table Admin(
    etat varchar(20)
)INHERITS (users);

create table Activite(
    activite_Id Serial primary key,
    DateDebut varchar(20),
    DateFin varchar(20),
    titre varchar(20),
    descriptif varchar(20),
    type varchar(20),
    etat varchar(20),
	responsable_Id int references users(Id)
);

create table Exercice(
    exercice_Id Serial primary key,
    DateDebut varchar(20),
    DateFin varchar(20),
    Status varchar(20),
	activite_Id int references Activite(activite_Id)
);

create table Participant_Activite(
    Id int REFERENCES users(Id) ,
    activite_Id int REFERENCES activite(activite_Id),
    primary key (Id,activite_Id)
);