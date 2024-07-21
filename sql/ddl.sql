create table sensor_state_history
(
    id          int auto_increment primary key,
    device_id   int                   not null,
    device_name varchar(100)          not null,
    state       bit default 0         not null,
    type        bit default 0         not null,
    datetime    varchar(100)          not null
);

create table sensor_state
(
    id         int auto_increment primary key,
    state      int                   not null,
    state_name varchar(100)          not null
);

create table sensor_type
(
    id        int auto_increment primary key,
    type      int                   not null,
    type_name varchar(100)          not null
);

create table image
(
    id   int auto_increment primary key,
    name varchar(300)          not null
);