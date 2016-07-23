
create table t_user (
  id int primary key auto_increment,
  name varchar(32),
  login_name varchar(32) unique,
  login_pswd char(32)
)

create table t_module (
  id int primary key auto_increment,
  name varchar(64),
  description text
)

create table t_suite (
  id int primary key auto_increment,
  name varchar(255),
  description text,
  test_count int,
  img_url varchar(255),
  create_time char(19),
  module_id int
)

create table t_question (
  id int primary key auto_increment,
  title varchar(255),
  suite_id int,
  foreign key(suite_id) references t_suite(id)
)

create table t_option (
  id int primary key auto_increment,
  title varchar(255),
  score int,
  seq int,
  question_id int,
  foreign key(question_id) references t_question(id)
)

create table t_result (
  id int primary key auto_increment,
  description text,
  start_score int,
  end_score int,
  suite_id int,
  foreign key(suite_id) references t_suite(id)
)

create table t_score (
  id int primary key auto_increment,
  score int,
  test_time char(19),
  user_id int,
  suite_id int,
  foreign key(user_id) references t_user(id),
  foreign key(suite_id) references t_suite(id)
)