DROP TABLE member CASCADE CONSTRAINTS;
DROP TABLE address CASCADE CONSTRAINTS;
DROP TABLE category CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE sizes CASCADE CONSTRAINTS;
DROP TABLE productSize CASCADE CONSTRAINTS;
DROP TABLE bidType CASCADE CONSTRAINTS;
DROP TABLE bidStatus CASCADE CONSTRAINTS;
DROP TABLE productDetail CASCADE CONSTRAINTS;
DROP TABLE QNA CASCADE CONSTRAINTS;
DROP TABLE review CASCADE CONSTRAINTS;
DROP TABLE notice CASCADE CONSTRAINTS;
DROP TABLE orders CASCADE CONSTRAINTS;
DROP TABLE wishList CASCADE CONSTRAINTS;
DROP TABLE paymentList CASCADE CONSTRAINTS;
DROP TABLE payment CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: member */
/**********************************/
CREATE TABLE member(
		id                            		VARCHAR2(10)		 NOT NULL,
		password                      		VARCHAR2(10)		 NOT NULL,
		name                          		VARCHAR2(10)		 NOT NULL,
		phone                         		VARCHAR2(10)		 NULL ,
		birth                         		VARCHAR2(10)		 NULL ,
		email                         		VARCHAR2(20)		 NULL ,
		gender                        		VARCHAR2(10)		 NOT NULL,
		point                         		NUMBER(10)		 NULL 
);
DROP SEQUENCE member_id_SEQ;

CREATE SEQUENCE member_id_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE member is 'member';
COMMENT ON COLUMN member.id is 'id';
COMMENT ON COLUMN member.password is 'password';
COMMENT ON COLUMN member.name is 'name';
COMMENT ON COLUMN member.phone is 'phone';
COMMENT ON COLUMN member.birth is 'birth';
COMMENT ON COLUMN member.email is 'email';
COMMENT ON COLUMN member.gender is 'gender';
COMMENT ON COLUMN member.point is 'point';


/**********************************/
/* Table Name: address */
/**********************************/
CREATE TABLE address(
		a_no                          		NUMBER(10)		 NULL ,
		address                       		VARCHAR2(50)		 NOT NULL,
		id                            		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE address is 'address';
COMMENT ON COLUMN address.a_no is 'a_no';
COMMENT ON COLUMN address.address is 'address';
COMMENT ON COLUMN address.id is 'id';


/**********************************/
/* Table Name: category */
/**********************************/
CREATE TABLE category(
		c_no                          		NUMBER(10)		 NULL ,
		c_name                        		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE category is 'category';
COMMENT ON COLUMN category.c_no is 'c_no';
COMMENT ON COLUMN category.c_name is 'c_name';


/**********************************/
/* Table Name: product */
/**********************************/
CREATE TABLE product(
		p_no                          		NUMBER(10)		 NOT NULL,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_date                        		DATE		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		p_image                       		VARCHAR2(50)		 NULL ,
		c_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE product_p_no_SEQ;

CREATE SEQUENCE product_p_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE product is 'product';
COMMENT ON COLUMN product.p_no is 'p_no';
COMMENT ON COLUMN product.p_name is 'p_name';
COMMENT ON COLUMN product.p_date is 'p_date';
COMMENT ON COLUMN product.p_price is 'p_price';
COMMENT ON COLUMN product.p_image is 'p_image';
COMMENT ON COLUMN product.c_no is 'c_no';


/**********************************/
/* Table Name: sizes */
/**********************************/
CREATE TABLE sizes(
		s_size                        		VARCHAR2(30)		 NULL ,
		c_no                          		NUMBER(10)		 NULL 
);

COMMENT ON TABLE sizes is 'sizes';
COMMENT ON COLUMN sizes.s_size is 's_size';
COMMENT ON COLUMN sizes.c_no is 'c_no';


/**********************************/
/* Table Name: productSize */
/**********************************/
CREATE TABLE productSize(
		ps_no                         		VARCHAR2(20)		 NULL ,
		s_size                        		VARCHAR2(30)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

COMMENT ON TABLE productSize is 'productSize';
COMMENT ON COLUMN productSize.ps_no is 'ps_no';
COMMENT ON COLUMN productSize.s_size is 's_size';
COMMENT ON COLUMN productSize.p_no is 'p_no';


/**********************************/
/* Table Name: bidType */
/**********************************/
CREATE TABLE bidType(
		bt_no                         		NUMBER(10)		 NULL ,
		bt_type                       		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE bidType is 'bidType';
COMMENT ON COLUMN bidType.bt_no is 'bt_no';
COMMENT ON COLUMN bidType.bt_type is 'bt_type';


/**********************************/
/* Table Name: bidStatus */
/**********************************/
CREATE TABLE bidStatus(
		b_no                          		NUMBER(10)		 NULL ,
		b_status                      		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE bidStatus is 'bidStatus';
COMMENT ON COLUMN bidStatus.b_no is 'b_no';
COMMENT ON COLUMN bidStatus.b_status is 'b_status';


/**********************************/
/* Table Name: productDetail */
/**********************************/
CREATE TABLE productDetail(
		po_no                         		NUMBER(10)		 NOT NULL,
		po_price                      		NUMBER(10)		 NULL ,
		pd_start                      		DATE		 DEFAULT sysdate		 NULL ,
		pd_end                        		DATE		 NULL ,
		ps_no                         		VARCHAR2(20)		 NULL ,
		id                            		VARCHAR2(10)		 NULL ,
		bt_no                         		NUMBER(10)		 NULL ,
		b_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE productDetail_po_no_SEQ;

CREATE SEQUENCE productDetail_po_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE productDetail is 'productDetail';
COMMENT ON COLUMN productDetail.po_no is 'po_no';
COMMENT ON COLUMN productDetail.po_price is 'po_price';
COMMENT ON COLUMN productDetail.pd_start is 'pd_start';
COMMENT ON COLUMN productDetail.pd_end is 'pd_end';
COMMENT ON COLUMN productDetail.ps_no is 'ps_no';
COMMENT ON COLUMN productDetail.id is 'id';
COMMENT ON COLUMN productDetail.bt_no is 'bt_no';
COMMENT ON COLUMN productDetail.b_no is 'b_no';


/**********************************/
/* Table Name: QNA */
/**********************************/
CREATE TABLE QNA(
		q_no                          		NUMBER(10)		 NULL ,
		q_title                       		VARCHAR2(100)		 NULL ,
		q_content                     		VARCHAR2(1000)		 NULL ,
		q_date                        		DATE		 NULL ,
		q_groupno                     		NUMBER(10)		 NULL ,
		q_step                        		NUMBER(10)		 NULL ,
		q_depth                       		NUMBER(10)		 NULL ,
		id                            		VARCHAR2(10)		 NULL 
);

DROP SEQUENCE QNA_q_no_SEQ;

CREATE SEQUENCE QNA_q_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE QNA is 'QNA';
COMMENT ON COLUMN QNA.q_no is 'q_no';
COMMENT ON COLUMN QNA.q_title is 'q_title';
COMMENT ON COLUMN QNA.q_content is 'q_content';
COMMENT ON COLUMN QNA.q_date is 'q_date';
COMMENT ON COLUMN QNA.q_groupno is 'q_groupno';
COMMENT ON COLUMN QNA.q_step is 'q_step';
COMMENT ON COLUMN QNA.q_depth is 'q_depth';
COMMENT ON COLUMN QNA.id is 'id';


/**********************************/
/* Table Name: review */
/**********************************/
CREATE TABLE review(
		r_no                          		NUMBER(10)		 NULL ,
		r_title                       		VARCHAR2(100)		 NULL ,
		r_content                     		VARCHAR2(1000)		 NULL ,
		r_date                        		DATE		 NULL ,
		r_star                        		NUMBER(10)		 NULL ,
		id                            		VARCHAR2(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE review_r_no_SEQ;

CREATE SEQUENCE review_r_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE review is 'review';
COMMENT ON COLUMN review.r_no is 'r_no';
COMMENT ON COLUMN review.r_title is 'r_title';
COMMENT ON COLUMN review.r_content is 'r_content';
COMMENT ON COLUMN review.r_date is 'r_date';
COMMENT ON COLUMN review.r_star is 'r_star';
COMMENT ON COLUMN review.id is 'id';
COMMENT ON COLUMN review.p_no is 'p_no';


/**********************************/
/* Table Name: notice */
/**********************************/
CREATE TABLE notice(
		n_no                          		NUMBER(10)		 NULL ,
		n_title                       		VARCHAR2(10)		 NULL ,
		n_content                     		VARCHAR2(10)		 NULL ,
		n_date                        		DATE		 NULL 
);

DROP SEQUENCE notice_n_no_SEQ;

CREATE SEQUENCE notice_n_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE notice is 'notice';
COMMENT ON COLUMN notice.n_no is 'n_no';
COMMENT ON COLUMN notice.n_title is 'n_title';
COMMENT ON COLUMN notice.n_content is 'n_content';
COMMENT ON COLUMN notice.n_date is 'n_date';


/**********************************/
/* Table Name: orders */
/**********************************/
CREATE TABLE orders(
		o_no                          		VARCHAR2(10)		 NULL ,
		o_date                        		DATE		 NULL ,
		po_no_purchase                		NUMBER(10)		 NULL ,
		po_no_sell                    		NUMBER(10)		 NULL ,
		o_status                      		VARCHAR2(10)		 NULL 
);

DROP SEQUENCE orders_o_no_SEQ;

CREATE SEQUENCE orders_o_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE orders is 'orders';
COMMENT ON COLUMN orders.o_no is 'o_no';
COMMENT ON COLUMN orders.o_date is 'o_date';
COMMENT ON COLUMN orders.po_no_purchase is 'po_no_purchase';
COMMENT ON COLUMN orders.po_no_sell is 'po_no_sell';
COMMENT ON COLUMN orders.o_status is 'o_status';


/**********************************/
/* Table Name: wishList */
/**********************************/
CREATE TABLE wishList(
		w_no                          		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		id                            		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE wishList is 'wishList';
COMMENT ON COLUMN wishList.w_no is 'w_no';
COMMENT ON COLUMN wishList.p_no is 'p_no';
COMMENT ON COLUMN wishList.id is 'id';


/**********************************/
/* Table Name: paymentList */
/**********************************/
CREATE TABLE paymentList(
		pl_no                         		NUMBER(10)		 NULL ,
		pl_method                     		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE paymentList is 'paymentList';
COMMENT ON COLUMN paymentList.pl_no is 'pl_no';
COMMENT ON COLUMN paymentList.pl_method is 'pl_method';


/**********************************/
/* Table Name: payment */
/**********************************/
CREATE TABLE payment(
		pm_no                         		NUMBER(10)		 NULL ,
		pm_name                       		VARCHAR2(10)		 NULL ,
		pm_phone                      		VARCHAR2(10)		 NULL ,
		pm_address                    		VARCHAR2(50)		 NULL ,
		pm_memo                       		VARCHAR2(100)		 NULL ,
		o_no                          		VARCHAR2(10)		 NULL ,
		pl_no                         		NUMBER(10)		 NULL 
);

COMMENT ON TABLE payment is 'payment';
COMMENT ON COLUMN payment.pm_no is 'pm_no';
COMMENT ON COLUMN payment.pm_name is 'pm_name';
COMMENT ON COLUMN payment.pm_phone is 'pm_phone';
COMMENT ON COLUMN payment.pm_address is 'pm_address';
COMMENT ON COLUMN payment.pm_memo is 'pm_memo';
COMMENT ON COLUMN payment.o_no is 'o_no';
COMMENT ON COLUMN payment.pl_no is 'pl_no';



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (id);

ALTER TABLE address ADD CONSTRAINT IDX_address_PK PRIMARY KEY (a_no);


ALTER TABLE category ADD CONSTRAINT IDX_category_PK PRIMARY KEY (c_no);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);


ALTER TABLE sizes ADD CONSTRAINT IDX_sizes_PK PRIMARY KEY (s_size);


ALTER TABLE productSize ADD CONSTRAINT IDX_productSize_PK PRIMARY KEY (ps_no);

ALTER TABLE bidType ADD CONSTRAINT IDX_bidType_PK PRIMARY KEY (bt_no);

ALTER TABLE bidStatus ADD CONSTRAINT IDX_bidStatus_PK PRIMARY KEY (b_no);

ALTER TABLE productDetail ADD CONSTRAINT IDX_productDetail_PK PRIMARY KEY (po_no);

ALTER TABLE QNA ADD CONSTRAINT IDX_QNA_PK PRIMARY KEY (q_no);


ALTER TABLE review ADD CONSTRAINT IDX_review_PK PRIMARY KEY (r_no);

ALTER TABLE notice ADD CONSTRAINT IDX_notice_PK PRIMARY KEY (n_no);

ALTER TABLE orders ADD CONSTRAINT IDX_orders_PK PRIMARY KEY (o_no);


ALTER TABLE wishList ADD CONSTRAINT IDX_wishList_PK PRIMARY KEY (w_no);


ALTER TABLE paymentList ADD CONSTRAINT IDX_paymentList_PK PRIMARY KEY (pl_no);

ALTER TABLE payment ADD CONSTRAINT IDX_payment_PK PRIMARY KEY (pm_no);

