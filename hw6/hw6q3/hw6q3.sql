CREATE DATABASE `company`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `department` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `salary` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

INSERT INTO company.employee (name,department,salary) VALUES
	 ('ali','dep a',900),
	 ('reza','dep b',1500),
	 ('taghi','dep b',1000),
	 ('ali','dep c',1800),
	 ('hossein','dep c',800);
	 
SELECT * FROM company.employee e 
WHERE e.name = 'ali';

SELECT * FROM company.employee e 
WHERE e.salary < 1000;

SELECT e.department, AVG(e.salary) AS 'avg salary' FROM company.employee e 
GROUP BY e.department;
