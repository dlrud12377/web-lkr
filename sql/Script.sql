-- 1

create table members(
	member_id int primary key,
	member_name varchar(50) unique not null,
	email varchar(100) unique not null
);

drop table orders;

create table orders(
	order_id int primary key,
	member_id int,
	order_date date,
	constraint fk_orders_members foreign key(member_id)
	references members(member_id)
);

create index idx_orders_member_id on orders(member_id);

create index idx_orders_member_date on orders(member_id, order_date);

-- 2.

create or replace view v_order_summary as
select o.order_id, m.member_name, o.order_date
from orders o
left outer join members m
on m.member_id = o.member_id
with read only;


