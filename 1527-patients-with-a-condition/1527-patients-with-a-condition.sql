# Write your MySQL query statement below
SELECT patient_id, patient_name , conditions
 FROM Patients WHERE conditiONS LIKE 'DIAB1%' OR conditions like '% DIAB1%' ;