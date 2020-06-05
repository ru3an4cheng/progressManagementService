
    drop table if exists ACROSS_ENGINEERING;

    drop table if exists CONSTRUCTION_COMPANY;

    drop table if exists CONSTRUCTION_TEAM;

    drop table if exists MATERIAL_ARRIVAL_MANAGEMENT;

    drop table if exists MOVED_ENGINEERING;

    drop table if exists NODE;

    drop table if exists NOTIFICATION;

    drop table if exists PROJECT_DETAIL;

    drop table if exists PROJECT_NODES;

    drop table if exists PROJECT_SUBITEM;

    drop table if exists SUBITEM;

    drop table if exists TEAM_SUBITEM;

    drop table if exists WEEKLY_REPORT;

    create table ACROSS_ENGINEERING (
        ID bigint not null comment '主键',
        CONSTRUCTION_MANAGEMENT_UNIT varchar(64) comment '建管单位',
        VOLTAGE_LEVEL varchar(64) comment '电压等级',
        PROJECT_NAME varchar(64) comment '工程名称',
        START_TIME datetime comment '开工时间',
        PRODUCTION_TIME datetime comment '投产时间',
        PLANNED_CONSTRUCTION_MONTH varchar(64) comment '计划施工月份',
        COME_LETTER_TIME datetime comment '来函时间',
        PASS_REVIEW_ACTUAL_TIME datetime comment '施工方案通过审查实际时间',
        PASS_REVIEW_THEORY_TIME datetime comment '施工方案通过审查理论时间',
        PLAN_START_TIME datetime comment '计划开工时间',
        CONSTRUCTION_UNIT varchar(64) comment '施工单位',
        REMARK varchar(255) comment '备注',
        primary key (ID)
    ) comment='AcrossEngineering';

    create table CONSTRUCTION_COMPANY (
        ID bigint not null comment '主键',
        NAME varchar(64) comment '公司名称',
        PRINCIPAL varchar(255) comment '负责人',
        WOKERS integer comment '作业人数',
        CREATE_TIME datetime comment '日期',
        primary key (ID)
    ) comment='ConstructionCompany';

    create table CONSTRUCTION_TEAM (
        ID bigint not null comment '主键',
        COMPANY_NAME varchar(64) comment '公司名称',
        COMPANY_ID integer comment '公司id',
        TEAM_NAME varchar(64) comment '施工队伍名称',
        TEAM_WOKERS integer comment '施工队伍人数',
        PRINCIPAL varchar(64) comment '负责人',
        PROJECT_NAME varchar(64) comment '负责项目名称',
        CREATE_TIME datetime comment '创建时间',
        primary key (ID)
    ) comment='ConstructionTeam';

    create table MATERIAL_ARRIVAL_MANAGEMENT (
        ID bigint not null comment '主键',
        PROJECT_NAME varchar(64) comment '工程名称',
        PROJECT_ID integer comment '工程id',
        SUPPLIES_NAME varchar(64) comment '物资名称',
        STATUS integer comment '物资状态',
        MANUFACTURER varchar(64) comment '厂家',
        CONTACT_PERSON varchar(64) comment '联系人',
        PLANNED_ARRIVAL_TIME datetime comment '计划到货时间',
        CREATE_TIME datetime comment '创建时间',
        primary key (ID)
    ) comment='MaterialArrivalManagement';

    create table MOVED_ENGINEERING (
        ID bigint not null comment '主键',
        OPERATIONS_MANAGEMENT_UNIT varchar(64) comment '运维管理单位',
        EXTERNAL_UNIT varchar(64) comment '外部单位',
        PROJECT_NAME varchar(64) comment '项目名称',
        COME_LETTER_TIME datetime comment '来函时间',
        REPEAT_LETTER_TIME datetime comment '复函时间',
        REVIEW_COMMENTS_TIME datetime comment '设计方评审意见签发时间',
        CHANGE_AGREEMENT_TIME datetime comment '电力设施迁改协议签订时间',
        BIDDING_COMPLETE_TIME datetime comment '迁改工程招标完成时间',
        DESIGNER_UNIT varchar(64) comment '设计单位',
        CONSTRUCTION_UNIT varchar(64) comment '施工单位',
        SUPERVISION_UNIT varchar(64) comment '监理单位',
        PROVINCIAL_COMPANY_APPROVAL varchar(64) comment '参建单位资质业绩省公司审批',
        CONSTRUCTION_PLAN_SCHEDULE varchar(64) comment '施工计划工期',
        MAJOR_PROJECT_SCALE varchar(64) comment '主要工程规模',
        CONSTRUCTION_PROGRESS varchar(64) comment '施工进展情况',
        SECURITY_REGULATORY_UNIT varchar(64) comment '安全监管主体单位',
        COMPLETION_TIME datetime comment '施工完成时间',
        OTHER varchar(255) comment '其他',
        primary key (ID)
    ) comment='MovedEngineering';

    create table NODE (
        ID bigint not null comment '主键',
        NAME varchar(64) comment '节点名称',
        CREATE_PERSON varchar(64) comment '创建人',
        CREATE_TIME datetime comment '创建时间',
        PHASE varchar(64) comment '工程阶段',
        STATUS integer comment '状态',
        primary key (ID)
    ) comment='Node';

    create table NOTIFICATION (
        ID bigint not null comment '主键',
        TITLE varchar(255) comment '周报标题',
        DATE datetime comment '周报日期',
        primary key (ID)
    ) comment='Notification';

    create table PROJECT_DETAIL (
        ID bigint not null comment '主键',
        PROJECT_NAME varchar(64) comment '项目名称',
        PROJECT_CODE varchar(64) comment '项目编码',
        CONSTRUCTION_UNIT varchar(64) comment '建管单位',
        VOLTAGE_LEVEL integer comment '电压等级',
        PROJECT_DEPARTMENT varchar(64) comment '所属项目部',
        WORK_SITUATION varchar(64) comment '开工情况',
        ALL_NODES integer comment '全部节点',
        ADVANCED_NODE integer comment '提前节点',
        LAG_NODE integer comment '滞后节点',
        ALERT_NODE integer comment '预警节点',
        NORMAL_COMPLETION_NODE integer comment '正常完成节点',
        TOTAL_COMPLETION_NODE integer comment '合计完成节点',
        RELATED_PERSON varchar(64) comment '关联人员',
        PROJECT_SIGNIFICANCE text comment '项目意义',
        OVER_DEADLINE varchar(64) comment '超期遗留',
        ATTACHMENT text comment '附件',
        STATUS varchar(64) comment '状态',
        CREATE_TIME datetime comment '创建时间',
        COMPLETION_TIME datetime comment '计划完成时间',
        PROJECT_ATTENTION integer comment '是否是关注项目',
        COMPLETE_RATE double precision comment '完成率',
        primary key (ID)
    ) comment='ProjectDetail';

    create table PROJECT_NODES (
        ID bigint not null comment '主键',
        PROJECT_NAME varchar(64) comment '项目名称',
        PROJECT_ID integer comment '项目id',
        PROJECT_DEPARTMENT varchar(255) comment '所属部门',
        NODE_NAME varchar(64) comment '节点名称',
        PLAN_START_TIME datetime comment '计划开始时间',
        PLAN_END_TIME datetime comment '计划结束时间',
        ACTUAL_START_TIME datetime comment '实际开始时间',
        ACTUAL_END_TIME datetime comment '实际结束时间',
        IS_FINISHED integer comment '完成状态',
        STATUS integer comment '节点阶段0项目前期1工程前期2工程施工3竣工验收',
        FILL_TIME datetime comment '填报时间',
        FILL_PERSON varchar(64) comment '填报人',
        RELATED_PERSON varchar(64) comment '责任人',
        CREATE_TIME datetime comment '创建时间',
        WEIGHT varchar(64) comment '权重',
        FILE_CODE varchar(64) comment '文件编码',
        FILE_PATH varchar(255) comment '文件路径',
        PRECONDITION varchar(64) comment '前置条件',
        VALID_TIME datetime comment '有效期至',
        primary key (ID)
    ) comment='ProjectNodes';

    create table PROJECT_SUBITEM (
        ID bigint not null comment '主键',
        PROJECT_ID integer comment '项目id',
        PROJECT_NAME varchar(64) comment '项目名称',
        NAME varchar(64) comment '节点名称',
        CREATE_PERSON varchar(64) comment '创建人',
        CREATE_TIME datetime comment '创建时间',
        PHASE varchar(64) comment '工程阶段',
        NODE_LEVEL integer comment '节点等级',
        PARENT_ID integer comment '父节点id',
        STATUS integer comment '状态',
        DEADLINE_TIME datetime comment '截至时间',
        IS_FINISHED integer comment '是否完成',
        WEIGHT varchar(64) comment '权重',
        primary key (ID)
    ) comment='ProjectSubitem';

    create table SUBITEM (
        ID bigint not null comment '主键',
        NAME varchar(64) comment '节点名称',
        CREATE_PERSON varchar(64) comment '创建人',
        CREATE_TIME datetime comment '创建时间',
        PHASE varchar(64) comment '工程阶段',
        NODE_LEVEL integer comment '节点等级',
        PARENT_ID integer comment '父节点id',
        STATUS integer comment '状态',
        primary key (ID)
    ) comment='Subitem';

    create table TEAM_SUBITEM (
        ID bigint not null comment '主键',
        TEAM_NAME varchar(64) comment '施工队伍名称',
        TEAM_ID integer comment '施工队伍id',
        SUBITEM_NAME varchar(64) comment '分项名称',
        SUBITEM_ID integer comment '分项id',
        CREATE_TIME datetime comment '创建时间',
        primary key (ID)
    ) comment='TeamSubitem';

    create table WEEKLY_REPORT (
        ID bigint not null comment '主键',
        PROJECT_NAME varchar(64) comment '项目名称',
        PROJECT_ID integer comment '项目id',
        THIS_WEEK_WORK varchar(255) comment '本周工作内容',
        NEXT_WEEK_WORK varchar(255) comment '下周工作内容',
        WORKERS integer comment '作业人员',
        TIME datetime comment '日期',
        SITUATION varchar(255) comment '基本概况',
        CREATE_TIME datetime comment '创建时间',
        primary key (ID)
    ) comment='WeeklyReport';
