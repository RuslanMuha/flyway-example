
    create table course (
       id varchar(255) generated by default as identity,
        name varchar(255),
        rate smallint not null,
        workload integer not null,
        teacher_id varchar(255),
        primary key (id)
    )

    create table teacher (
       id varchar(255) generated by default as identity,
        email varchar(255),
        name varchar(255),
        pictureurl varchar(255),
        surname varchar(255),
        primary key (id)
    )

    alter table course 
       add constraint FKsybhlxoejr4j3teomm5u2bx1n 
       foreign key (teacher_id) 
       references teacher