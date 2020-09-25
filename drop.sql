alter table if exists meal drop constraint if exists FK_meal_to_day
alter table if exists nutrient drop constraint if exists FK_nutrient_to_meal
drop table if exists day cascade
drop table if exists meal cascade
drop table if exists nutrient cascade
