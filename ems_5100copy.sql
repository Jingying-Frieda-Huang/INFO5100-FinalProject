CREATE TABLE `bank` (
  `license_no` int NOT NULL,
  `bank_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`license_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `bank_account` (
  `account_number` int NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `balance` int DEFAULT NULL,
  `bank_accountcol` varchar(45) DEFAULT NULL,
  `bank_lic_no` int DEFAULT NULL,
  PRIMARY KEY (`account_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `event` (
  `event_id` int NOT NULL,
  `event_name` varchar(45) DEFAULT NULL,
  `sponsor_id` int DEFAULT NULL,
  `venue_id` int DEFAULT NULL,
  `budget` int DEFAULT NULL,
  `volunteer_capacity` varchar(15) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `event_organizer` varchar(45) DEFAULT NULL,
  `customer_capacity` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `payment` (
  `payment_id` int NOT NULL,
  `account_number` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `customer_id` varchar(45) DEFAULT NULL,
  `event_id` varchar(45) DEFAULT NULL,
  `money` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`payment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `payment_transaction` (
  `transaction_id` int NOT NULL,
  `status` varchar(15) DEFAULT NULL,
  `payer_id` int DEFAULT NULL,
  `payee_id` int DEFAULT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `person` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` date NOT NULL,
  `password` varchar(10) NOT NULL,
  `role` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `person_role` (
  `role_id` int NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `record` (
  `record_id` int NOT NULL,
  `event_id` int NOT NULL,
  `customer_id` int NOT NULL,
  `state` varchar(45) NOT NULL DEFAULT 'pending',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sponsor` (
  `reg_id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `establish_date` date DEFAULT NULL,
  PRIMARY KEY (`reg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sponsor_request` (
  `request_id` int NOT NULL AUTO_INCREMENT,
  `event_id` int DEFAULT NULL,
  `sponsor_id` int DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `organizer_id` int DEFAULT NULL,
  PRIMARY KEY (`request_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `ticket` (
  `ticket_id` int NOT NULL,
  `customer_id` int DEFAULT NULL,
  `event_id` int DEFAULT NULL,
  PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `transfer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sender` varchar(45) DEFAULT NULL,
  `receiver` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `event` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user_account` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `finance` int DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `venue` (
  `reg_id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `seat_capacity` int DEFAULT NULL,
  `zip_code` varchar(6) DEFAULT NULL,
  `cost` int DEFAULT NULL,
  PRIMARY KEY (`reg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `venue_request` (
  `request_id` int NOT NULL AUTO_INCREMENT,
  `event_id` int DEFAULT NULL,
  `organiser_id` int DEFAULT NULL,
  `venue_id` int DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  PRIMARY KEY (`request_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `volunteer_history` (
  `history_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `event_id` int NOT NULL,
  PRIMARY KEY (`history_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM ems_5100.transfer;


​

​
INSERT INTO event(event_id, event_name, sponsor_id, venue_id, volunteer_capacity, budget, date, location, event_organizer, customer_capacity, price, status)
VALUES 
  (10, 'Coffee Networking', 100, 100, '0/20', 2000, '2019/01/01', 'Westin Hotel Copley Place', 'Jack Smith', '250', 5, 'completed'),
  (11, 'Career Fair', 101, 101, '0/10', 4000, '2020/11/11', 'Northeastern University', 'Blake Walker', '200', 10, 'upcoming'),
  (12, 'Christmas Party', 102, 102, '0/25', 1000, '2023/12/20', 'Music City Queen Boston Riverboat', 'Mark Johnson', '1000', 20,'upcoming');
​
INSERT INTO record(record_id, event_id, customer_id, state)
VALUES 
  (20, 10, 10, 'Upcoming'),
  (21, 11, 11, 'Done'),
  (22, 12, 12, 'Done');
​
​
INSERT INTO payment_transaction(transaction_id, status, payer_id, payee_id)
VALUES 
 (30, 'Pending', 30, 40),
 (31, 'Done', 31, 41),
 (32, 'Pending', 32, 42);
​
​
-- INSERT INTO person(name, dob, sex, phone, email, zip_code, role_id)
-- VALUES 
--   ('Bob Cuban', '1990/09/01', 'male', 123456, 'bob@gmail.com', '02133', 12),
--   ('Alice Cuban', '1992/10/11', 'female', 123457, 'alice@gmail.com', '02133', 13),
--   ('Paul Gram', '1994/11/21', 'male', 123458, 'paul@gmail.com', '02134', 14);
​
-- INSERT INTO person_role(role_id, type)
-- VALUES 
--   (10, 'event organizer'),
--   (11, 'sponsor'),
--   (12, 'volunteer');
​
INSERT INTO sponsor(reg_id, name, type, establish_date)
VALUES 
  (40, 'Google', 'Cash Donation', '2022/12/1'),
  (41, 'Boston College', 'Non Profit', '2022/10/19'),
  (42, 'Northeastern University', 'Advertisement', '2022/12/19'); 
​
​
INSERT INTO sponsor_request(event_id, sponsor_id, status, amount, organizer_id)
VALUES 
  (10, 40, 'Pending', 1000, 123),
  (11, 41, 'Accept', 2000, 124),
  (12, 42, 'Pending', 3000, 125);
​
​
INSERT INTO ticket(ticket_id, customer_id, event_id)
VALUES 
  (500, 10, 10),
  (501, 20, 11),
  (502, 30, 12);
​
INSERT INTO transfer(sender, receiver, type, amount, state, event, request_id)
VALUES 
  ('41', '40', 'payment', 1000, 'Pending', 10, 100),
  ('42', '40', 'sponsorship', 2000, 'Done', 11, 101);
​
INSERT INTO user_account(user_id, password, role, email, name)
VALUES 
  (40, '123', 'event organizer', '123@gmail.com', 'Bob Black'),
  (41, '234', 'customer', 'cc@gmail.com', 'Cole Johnson'),
  (42, '345', 'sponsor', 'ss@gmail.com', 'Snell Spenser');
​
​
INSERT INTO venue(reg_id, name, type, seat_capacity, zip_code, cost)
VALUES 
  (40, 'Boston Hotel', 'For profit', 1000, '02122', 1000),
  (41, 'Northeastern University', 'Non profit', 10000, '02125', 2000),
  (42, 'Sunrise Restaurant', 'In person', 1000, '02125', 200);
​
INSERT INTO venue_request(request_id, event_id, venue_id, status, amount, organizer_id)
VALUES 
  (100, 10, 100, 'Pending', 1000, 40),
  (101, 11, 101, 'Accept', 2000, 41),
  (102, 12, 102, 'Pending', 1040, 42);
​
​
INSERT INTO volunteer_history(user_id, event_id)
VALUES 
  (40, 10),
  (41, 11),
  (42, 12);