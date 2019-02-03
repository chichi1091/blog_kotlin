CREATE TABLE IF NOT EXISTS users(
  id INTEGER NOT NULL AUTO_INCREMENT
  , name VARCHAR(255)
  , email VARCHAR(60) not null
  , password varchar not null
  , primary key (id)
  , CONSTRAINT uni_users_email UNIQUE (email)
);