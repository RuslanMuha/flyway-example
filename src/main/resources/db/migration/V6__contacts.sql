create table contact (
  id varchar(255) identity primary key not null ,
  teacher_id varchar(255) not null,
  email varchar (255) not null,
  phone varchar (255) not null,
  primary key (id)
);

alter table contact
       add constraint fk_contact_teacher
       foreign key (teacher_id)
       references teacher;

