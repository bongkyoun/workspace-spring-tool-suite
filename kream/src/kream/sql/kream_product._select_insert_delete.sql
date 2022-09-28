
select * from product;

select * from product where p_no = 1;

select * from product where p_name like '%Nike%';

select * from brands where br_name like '%Apple%';

insert into product values(PRODUCT_P_NO_SEQ.nextval, 'iPhone13 128GB', '21/09/24','1,078,000원', 'img', 7);

update product set p_no = PRODUCT_P_NO_SEQ.currval, p_name='iPhone13 128GB', p_date='21/09/24', p_price='1,078,000원', p_image='img update', br_no = 7 where p_no = 6;

delete from product where p_no= 7;