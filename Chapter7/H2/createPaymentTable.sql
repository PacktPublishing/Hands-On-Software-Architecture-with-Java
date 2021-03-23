CREATE TABLE payment (
   id  uuid default random_uuid() primary key,
   date DATE  NOT NULL,
   currency VARCHAR(20) NOT NULL,
   sender  uuid NOT NULL,
   recipient  uuid NOT NULL,
   signature VARCHAR(50) NOT NULL,
   amount DECIMAL  NOT NULL
);
