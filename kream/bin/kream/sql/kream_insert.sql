/**************카테고리*****************/
insert into category values(1, '신발');
insert into category values(2, '상의');
insert into category values(3, '하의');
insert into category values(4, '전자제품');

/**************사이즈*****************/
insert into sizes values('210', 1);
insert into sizes values('220', 1);
insert into sizes values('230', 1);
insert into sizes values('240', 1);
insert into sizes values('250', 1);
insert into sizes values('260', 1);
insert into sizes values('270', 1);
insert into sizes values('280', 1);
insert into sizes values('290', 1);
insert into sizes values('300', 1);
insert into sizes values('310', 1);
insert into sizes values('320', 1);

insert into sizes values('90', 2);
insert into sizes values('95', 2);
insert into sizes values('100', 2);
insert into sizes values('105', 2);
insert into sizes values('110',2);

insert into sizes values('S', 3);
insert into sizes values('M', 3);
insert into sizes values('L', 3);
insert into sizes values('XL', 3);
insert into sizes values('XXL',3);
/*********브랜드*********/
/*신발*/
insert into brands values(1, 'Nike', 1);
insert into brands values(2, 'adidas', 1);

/*상의*/
insert into brands values(3, 'Nike', 2);
insert into brands values(4, 'adidas', 2);

/*하의*/
insert into brands values(5, 'Nike', 3);
insert into brands values(6, 'adidas', 3);

/*전자제품*/
insert into brands values(7, 'Apple', 4);
insert into brands values(8, 'Samsung', 4);

/************제품***************/
insert into product values(1, 'Nike Air Force 1 07 WB Flax', '19/09/10', '169,000원', 'img', 1);
insert into product values(2, 'Nike Dunk Low Retro Black', '21/01/14', '129,000원', 'img', 1);
insert into product values(3, 'Nike Dunk Low Light Smoke Grey', '22/05/07', '129,000원', 'img', 1);
insert into product values(4, 'Nike Dunk Low Retro Gym Red', '22/09/21', '129,000원', 'img', 1);
insert into product values(5, 'Nike x J.Crew Killshot 2 Sail Midnight Navy', '17/02/26', '109,000원', 'img', 1);

/**************제품사이즈**************/
insert into productSize values(1, '230', 1);
insert into productSize values(2, '250', 2);
insert into productSize values(3, '270', 3);
insert into productSize values(4, '290', 4);
insert into productSize values(5, '300', 5);

insert into productSize values(6, 'S', 6);
insert into productSize values(7, 'M', 7);
insert into productSize values(8, 'XL', 8);
insert into productSize values(9, 'XXL', 9);

insert into productSize values(10, '90', 10);
insert into productSize values(11, '95', 11);
insert into productSize values(12, '100', 12);
insert into productSize values(13, '105', 13);
insert into productSize values(14, '110', 14);

/************입찰상태************/
insert into bidStatus values(1, '대기중');
insert into bidStatus values(2, '거래중');
insert into bidStatus values(3, '거래완료');

/**************입찰타입***************/
insert into bidType values(1, '구매');
insert into bidType values(2, '판매');

/************회원*****************/
insert into member values('seongmin', '1234', '알찬성민', '01012345678', '970902', 'seongmin@gamil.com', '남', 0);
insert into member values('bongkyoun', '1234', '봉된장', '01023456789', '940802', 'bongkyoun@gamil.com', '남', 0);
insert into member values('jiwon', '1234', '지원준비', '01034567890', '971002', 'jiwon@gamil.com', '여', 0);
insert into member values('hyun', '1234', '현악기', '01045678901', '900602', 'hyun@gamil.com', '남', 0);
insert into member values('jungwook', '1234', '정욱', '01087654321', '990902', 'jungwook@gamil.com', '남', 0);

/***********주소*************/
insert into address values(1, '경기도', 'seongmin');
insert into address values(2, '서울', 'bongkyoun');
insert into address values(3, '인천', 'jiwon');
insert into address values(4, '경상남도', 'hyun');
insert into address values(5, '강원도', 'jungwook');

/*************제품상세****************/
insert into productDetail values(1, 17000, sysdate, sysdate+7, 1, 'seongmin', 1, 1);
insert into productDetail values(2, 35000, sysdate, sysdate+7, 2, 'bongkyoun', 2, 1);
insert into productDetail values(3, 87000, sysdate, sysdate+7, 3, 'jiwon', 1, 2);
insert into productDetail values(4, 66000, sysdate, sysdate+7, 4, 'hyun', 2, 1);
insert into productDetail values(5, 54000, sysdate, sysdate+7, 5, 'jungwook', 1, 2);

insert into productDetail values(6, 87000, sysdate, sysdate+7, 3, 'seongmin', 2, 2);
insert into productDetail values(7, 54000, sysdate, sysdate+7, 5, 'bongkyoun', 2, 2);

/************주문**************/
insert into orders values(1, sysdate, 3, 6, '배송준비중');
insert into orders values(2, sysdate, 5, 7, '배송중');

/************결제종류**************/
insert into paymentList values(1, '신용카드');
insert into paymentList values(2, '계좌이체');
insert into paymentList values(3, '카카오페이');

/*********결제***********/
insert into payment values(1, '지원준비', '01034567890', '인천', '안전한 배송 부탁 드립니다.', 1, 1);
insert into payment values(2, '정욱', '01087654321', '강원도', '안전한 배송 부탁 드립니다.', 2, 3);



