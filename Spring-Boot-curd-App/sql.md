 create table product_tbl (
       id number(10,0) not null,
        name varchar2(255 char),
        price double precision not null,
        quantity number(10,0) not null,
        primary key (id)
    )
    
    INSERT INTO "SYSTEM"."PRODUCT_TBL" (ID, NAME, PRICE, QUANTITY) VALUES ('1001', 'babul', '20', '2')
    
    select  * from product_tbl;
    