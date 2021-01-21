DROP TABLE IF EXISTS flights;

CREATE TABLE flights (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  destination VARCHAR(250) NOT NULL
);

INSERT INTO flights (destination) VALUES
  ('Berlin'),
  ('Tokyo'),
  ('Ghana');
