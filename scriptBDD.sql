#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: poney
#------------------------------------------------------------

CREATE TABLE poney(
        id     int (11) Auto_increment  NOT NULL ,
        name   Varchar (25) NOT NULL ,
        weight Int ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: jockey
#------------------------------------------------------------

CREATE TABLE jockey(
        id        int (11) Auto_increment  NOT NULL ,
        firstname Varchar (25) NOT NULL ,
        lastname  Varchar (25) NOT NULL ,
        weight    Int NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: course
#------------------------------------------------------------

CREATE TABLE course(
        id        int (11) Auto_increment  NOT NULL ,
        race_date Datetime NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: courir
#------------------------------------------------------------

CREATE TABLE courir(
        rank int NOT NULL,
        c_id int NOT NULL ,
        j_id int NOT NULL ,
        p_id int NOT NULL ,
        PRIMARY KEY (j_id ,p_id ,c_id)
)ENGINE=InnoDB;

ALTER TABLE courir ADD CONSTRAINT FK_j_id FOREIGN KEY (j_id) REFERENCES jockey(id);
ALTER TABLE courir ADD CONSTRAINT FK_p_id_ FOREIGN KEY (p_id) REFERENCES poney(id);
ALTER TABLE courir ADD CONSTRAINT FK_c_id FOREIGN KEY (c_id) REFERENCES course(id);
