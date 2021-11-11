CREATE DATABASE `maktab`
CREATE TABLE `course` (
  `c_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `unit` int NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb3
CREATE TABLE `course_students` (
  `s_id` int NOT NULL,
  `c_id` int NOT NULL,
  `grade` int NOT NULL,
  PRIMARY KEY (`s_id`,`c_id`),
  KEY `course_students_FK_1` (`c_id`),
  CONSTRAINT `course_students_FK` FOREIGN KEY (`s_id`) REFERENCES `student` (`id`),
  CONSTRAINT `course_students_FK_1` FOREIGN KEY (`c_id`) REFERENCES `course` (`c_id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb3
CREATE TABLE `major` (
  `m_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 2 DEFAULT CHARSET = utf8mb3
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `family_name` varchar(100) NOT NULL,
  `m_id_fk` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `student_FK` (`m_id_fk`),
  CONSTRAINT `student_FK` FOREIGN KEY (`m_id_fk`) REFERENCES `major` (`m_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 2 DEFAULT CHARSET = utf8mb3
