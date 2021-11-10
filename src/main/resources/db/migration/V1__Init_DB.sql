 create table user_role
 (
     user_id int8 not null,
  roles varchar(255)
 );

   create table usr
   (
       id int8 not null,
    active boolean not null,
     password varchar(255),
      username varchar(255),
       primary key (id)
   );
   create sequence hibernate_sequence start 1 increment 1;
    alter table if exists user_role add constraint user_role_const
        foreign key (user_id) references usr