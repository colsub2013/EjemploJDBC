DELIMITER $$
DROP PROCEDURE IF EXISTS crearTablaSP$$
CREATE  PROCEDURE crearTablaSP (IN tabla VARCHAR(50),IN campo1 VARCHAR(50),IN campo2 VARCHAR(50))
READS SQL DATA
BEGIN
    SET @s = CONCAT('CREATE TABLE ', tabla,'(',campo1,' VARCHAR (50), ',campo2, ' VARCHAR(50));');
    PREPARE stmt FROM @s;
    EXECUTE stmt;
END $$
DELIMITER ;