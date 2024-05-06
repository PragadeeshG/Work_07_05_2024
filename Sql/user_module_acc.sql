create table if not exists user_module_acc(
module_acc_owner Integer not null,
module_acc_name varchar(255) null,
first_name varchar(255) null,
last_name varchar(255) null,
email_address varchar(255) null,
locale Integer null,
country_code varchar(255) null,
is_privileged varchar(255) null,
last_login varchar(255) null,
contact_id Integer null,
address_id varchar(255) null,
user_grp varchar(255) null,
request_type varchar(255) null,
constraint user_module_acc_pk primary key(module_acc_owner));