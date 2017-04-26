CREATE TABLE luoja (
	id INT NOT NULL AUTO_INCREMENT,
	nimi VARCHAR(30) NOT NULL,
	sposti VARCHAR(100) NOT NULL,
	salasana VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE kysely (
	id INT NOT NULL AUTO_INCREMENT,
	nimi VARCHAR(100) NOT NULL,
  luojanimi VARCHAR(30),
    luoja_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (luoja_id) REFERENCES luoja(id)
) ENGINE=InnoDB;

CREATE TABLE otsikko (
	id INT NOT NULL AUTO_INCREMENT,
	otsikko VARCHAR(100),
    PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE kysymys (
	id INT NOT NULL AUTO_INCREMENT,
	teksti VARCHAR(100) NOT NULL,
    kysely_id INT,
    otsikko_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (kysely_id) REFERENCES kysely(id),
    FOREIGN KEY(otsikko_id) REFERENCES otsikko(id)
) ENGINE=InnoDB;

CREATE TABLE vastaustyyppi (
    teksti VARCHAR(100),
	  valinta VARCHAR(100),
    PRIMARY KEY (teksti, valinta)
) ENGINE=InnoDB;

CREATE TABLE vastaus (
	  id INT NOT NULL AUTO_INCREMENT,
    kysymys_id INT,
    teksti VARCHAR(100),
    valinta VARCHAR(100),
    PRIMARY KEY (id),
    FOREIGN KEY (kysymys_id) REFERENCES kysymys(id),
    FOREIGN KEY (teksti, valinta) REFERENCES vastaustyyppi(teksti, valinta)
) ENGINE=InnoDB;
