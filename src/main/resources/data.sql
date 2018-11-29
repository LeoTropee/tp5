CREATE TABLE article2
(
  id INTEGER ,
  creation DATE,
  title VARCHAR,
  content VARCHAR
);

INSERT  INTO article (id , creation , title , content, author) VALUES (1,  CURRENT_TIMESTAMP (), 'Premier  article', 'C''est le premier  contenu !','Romain Gaming');
  INSERT  INTO article (id , creation , title , content, author) VALUES (2,  CURRENT_TIMESTAMP (), 'Second  article', 'C''est un autre  contenu !','Romain Gaming');

