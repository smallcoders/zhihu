create table `problem` (
    `id` int not null,
    `name` varchar(64) not null,
    `description` text not null,
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    `is_delete` int not null default 0,
    primary key (`id`)
)