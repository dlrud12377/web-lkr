CREATE TABLE IF NOT EXISTS product(
	product_id BIGINT AUTO_INCREMENT PRIMARY KEY,
	product_name varchar(50) NOT NULL,
	product_stock int NOT NULL,
	product_price int NOT NULL,
	register_date datetime default current_timestamp,
	update_date datetime default current_timestamp on update current_timestamp
);

CREATE TABLE IF NOT exists orders(
	order_id BIGINT auto_increment primary key,
	product_id BIGINT,
	product_count int,
	order_date datetime default current_timestamp,
	foreign key (product_id) references product(product_id)
);