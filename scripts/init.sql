create table school_class
(
	id varchar(50)
		constraint school_class_pk
			primary key,
	name varchar(100)
);

comment on table school_class is '班级';


create table school
(
	id varchar(50)
		constraint school_pk
			primary key,
	name varchar(100)
);

comment on table school is '学校';

create table student_info
(
	id varchar
		constraint student_info_pk
			primary key,
	start_date timestamp,
	end_date timestamp,
	grade varchar(10),
	school_id varchar(50)
		constraint student_info_school_fk
			references school
				on update cascade on delete set null,
	school_class_id varchar(50)
		constraint student_info_school_class_fk
			references school_class
				on update cascade on delete set null
);

comment on table student_info is '学生时期的信息';

create table schoolfellow
(
	id varchar(50)
		constraint schoolfellow_pk
			primary key,
	name varchar(100),
	age int,
	sexy varchar(2)
);

comment on table schoolfellow is '校友';

alter table student_info
	add schoolfellow_id varchar(50);

alter table student_info
	add constraint student_info_schoolfellow_id_fk
		foreign key (schoolfellow_id) references schoolfellow;

alter table student_info rename column school_class_id to class_id;