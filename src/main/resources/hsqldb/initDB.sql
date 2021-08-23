DROP TABLE adresses IF EXISTS;

CREATE TABLE adresses (
  id INTEGER IDENTITY PRIMARY KEY,
  zip VARCHAR(30),
  public_place VARCHAR(30),
  complements VARCHAR(30),
  district VARCHAR(30),
  city VARCHAR(30),
  uf VARCHAR(30),
  ibge VARCHAR(30),
  gia VARCHAR(30),
  ddd INTEGER,
  siafi VARCHAR(30)
);

