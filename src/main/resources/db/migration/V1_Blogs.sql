CREATE TABLE IF NOT EXISTS blogs(
  id INTEGER NOT NULL AUTO_INCREMENT
  , title varchar not null
  , user_id integer not null
  , body varchar not null
  , create_datetime TIMESTAMP not null
  , primary key (id)
  , CONSTRAINT fk_blogs_user_id FOREIGN KEY (user_id) REFERENCES users (id)
);
