
<<<<<<< HEAD
select * from product order by p_no;
=======
select * from product;
>>>>>>> branch 'master' of https://github.com/bongkyoun/workspace-spring-tool-suite.git

select * from product where p_no = 1;

<<<<<<< HEAD
select * from product where p_name like '%jo%' or p_name like initcap('%'||'jo'||'%');

select * from brands where br_name like '%Apple%';

insert into product values(PRODUCT_P_NO_SEQ.nextval, 'iPhone13 128GB', '21/09/24',1078000, 'img', 7);

update product set p_no = PRODUCT_P_NO_SEQ.currval, p_name='iPhone13 128GB', p_date='21/09/24', p_price=1078000, p_image='img update', br_no = 7 where p_no = 6;

delete from product where p_no = 6;

insert into productdetail values(PRODUCTDETAIL_PD_NO_SEQ.nextval, 200000, sysdate, sysdate+3, 1, 'seongmin', 1, 2);

insert into productdetail values(PRODUCTDETAIL_PD_NO_SEQ.nextval, 200000, sysdate, sysdate+3, 1, 'bongkyoun', 1, 1);

insert into brands values(BRANDS_BR_NO_SEQ.nextval,'converse', 1);

select p.p_no, p.p_name, p.p_image, p.p_price, br.br_name from product p join brands br on p.br_no = br.br_no where p.p_no = 1;
/*
select pd.pd_no, ps.p_no, pd.pd_price, ps.s_size, pd.m_id, pd.bt_no from productdetail pd join productsize ps on pd.ps_no = ps.ps_no where pd.pd_no = 6;
*/
select * from productsize;
/*
select ps.ps_no, p.p_name, ps.s_size, min(p.p_price) from productsize ps join product p on ps.p_no = p.p_no where ps.p_no = 1 group by p_no;
*/
/*
select min(p_price) from product;
*/

select * from productsize order by p_no;

select pd.pd_no,pd.ps_no,pd.pd_price
from product p right outer join productDetail pd on p.p_price=pd.pd_price where p.p_price is null; 

select ps.ps_no, ps.p_no, p.p_name from productsize ps join product p on ps.p_no = p.p_no where p.p_no = 1;

select * from productSize ps join product p on ps.p_no = p.p_no where ps.ps_no = 1;

select p.p_no, ps.s_size, min(pd.pd_price) from productsize ps join (select * from productdetail where bt_no = 2 and b_no = 1) pd on ps.ps_no = pd.ps_no join product p on ps.p_no = p.p_no where (p.p_no = 2 and ps.s_size = '270') group by p.p_no, ps.s_size;

select p.p_no, ps.s_size, min(pd.pd_price) from productsize ps left outer join (select * from productdetail where bt_no = 1 and b_no = 1) pd on ps.ps_no = pd.ps_no join product p on ps.p_no = p.p_no where p.p_no = 1 group by p.p_no, ps.s_size;

select * from productSize ps join (select * from productDetail where bt_no = 1 and b_no = 3) pd on pd.ps_no = ps.ps_no where ps.p_no = 1;
=======
select * from product where p_name like '%Nike%';

select * from brands where br_name like '%Apple%';

insert into product values(PRODUCT_P_NO_SEQ.nextval, 'iPhone13 128GB', '21/09/24','1,078,000원', 'img', 7);

update product set p_no = PRODUCT_P_NO_SEQ.currval, p_name='iPhone13 128GB', p_date='21/09/24', p_price='1,078,000원', p_image='img update', br_no = 7 where p_no = 6;

delete from product where p_no= 7;
>>>>>>> branch 'master' of https://github.com/bongkyoun/workspace-spring-tool-suite.git
