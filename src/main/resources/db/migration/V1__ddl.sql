create table course (
        id varchar(255) not null ,
        name varchar(255),
        rate smallint not null,
        workload integer not null,
        teacher_id varchar(255),
        primary key (id)
    );

create table teacher (
        id varchar(255) not null,
        email varchar(255),
        name varchar(255),
        pictureurl varchar(255),
        primary key (id)
    );

alter table course
       add constraint fk_course_teacher
       foreign key (teacher_id)
       references teacher;
