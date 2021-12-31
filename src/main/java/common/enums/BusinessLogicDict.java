package common.enums;

/**
 * @author 孙文杰
 */
public enum BusinessLogicDict {
    /**
     * 项目信息-项目类型
     */
    OFFICE_OCCUPANCY(1061,"商业办公"),
    COMMERCIAL_BUILDINGS(1062,"测试用房"),
    DORMITORY_DEPARTMENT(1063,"宿舍公寓"),
    STANDARD_PLANT(1064,"标准厂房"),
    EDUCATION_HOUSE(1170,"教育用房"),

    /**
     * 项目资源-目前状态
     */
    LEASED(1076, "出租"),
    FREE(1077, "空闲"),
    SECOND_RENT_CONTROL(1080, "自用"),
    UNLEASE(1081, "出售"),

    /**
     * 租赁合同-账单生成方式
     */
    MONTH_CAL_RENT(1116, "按自然月度计算租金"),
    QUARTER_CAL_RENT(1117, "按自然季度计算租金"),
    HALF_YEAR_CAL_RENT(1118, "按自然半年度计算租金"),
    YEAR_CAL_RENT(1119, "按自然年度计算租金"),
    DAY_CYCLE_CAL_RENT(1120, "按起租日期+租金周期"),
    ONE_TIME_CAL_RENT(1251, "一次性生成"),

    /**
     * 租赁合同-周期
     */
    QUARTER(1112, "季度"),
    MONTHLY(1113, "月度"),
    HALF_YEAR(1114, "半年度"),
    YEAR(1115, "年度"),
    ONE_TIME(1252, "一次性"),

    /**
     * 租赁合同-租金调整方式
     */
    NONE(30, "无"),
    YEAR_ADJUST(1126, "每年调整"),
    TWO_YEAR_ADJUST(1127, "两年调整"),
    THREE_YEAR_ADJUST(1128, "三年调整"),
    FOUR_YEAR_ADJUST(1253, "四年调整"),
    FIVE_YEAR_ADJUST(1254, "五年调整"),
    SIX_YEAR_ADJUST(1255, "六年调整"),
    SEVEN_YEAR_ADJUST(1256, "七年调整"),
    EIGHT_YEAR_ADJUST(1257, "八年调整"),
    NINE_YEAR_ADJUST(1258, "九年调整"),
    TEN_YEAR_ADJUST(1259, "十年调整"),
    TWENTY_YEAR_ADJUST(1272, "二十年调整"),

    /**
     * 资产属性
     */
    XIN_FA_BUSINESS_ADMINISTRATION(1065,"新发企管"),
    XIN_FA_GROUP(1066,"新发集团"),
    CHUANG_YUAN(1067,"创源"),
    GAO_FA(1068,"高发"),

    /**
     * 账单调整-调整方式
     */
    ADD_LATE_FEE(1162, "追加滞纳金"),
    REDUCTION(1161, "减免"),

    /**
     * 账单-费用类型
     */
    PROPERTY_FEE(1143, "物业费"),
    RENT_FEE(1144, "租金"),
    WATER_FEE(1163, "水费"),
    POWER_FEE(1164, "电费"),
    GAS_FEE(1165, "煤气费"),
    OTHER_FEE(1247, "其他费用"),

    /**
     * 账单-账单类别
     */
    HOUSE_LEASE_BILL(1159, "房屋租赁账单"),
    PARKING_LEASE_BILL(1160, "车位租赁账单"),
    COST_BILL(1175, "费用账单"),

    /**
     * 物业合同类型
     */
    SERVICE_CONTRACT(1173, "服务合同"),
    REPAIR_CONTRACT(1174, "维修合同"),

    /**
     * 供应商类型
     */
    PROPERTY_COMPANY(1142, "物业公司"),
    FOLLOW_AUDIT(1156, "跟踪审计"),
    SUPERVISOR(1157, "监理"),
    MAINTENANCE_CONSTRUCTION(1158, "维修施工"),

    /**
     * 人力资源-员工管理-用工状态
     */
    PROBATION(1162, "试用期"),
    WORK(1161, "在职"),
    RETIREMENT(1161, "退休"),
    RESIGNATION(1161, "离职"),

    /**
     * 智慧运营-抄表记录-抄表类型
     */
    MATER_WATER(1177, "水费"),
    MATER_POWER(1178, "电费"),
    MATER_GAS(1179, "煤气费"),

    /**
     * 加班申请-加班类型
     */
    DAILY_OVER_TIME(1237, "平时加班"),
    REST_OVER_TIME(1239, "休息日加班"),
    LEGAL_OVER_TIME(1238, "法定假日加班"),

    /**
     * 请假申请-请假类型
     */
    YEAR_LEAVE(77, "年假"),
    SICK_LEAVE(78, "病假"),
    ABSENCE_LEAVE(79, "事假"),
    MARRY_MOURNING_LEAVE(262, "婚丧假"),
    MATERNITY_LEAVE(263, "产假"),
    COMPENSATORY_LEAVE(1234, "调休"),
    NURSING_LEAVE(1235, "护理假"),
    LOCTATION_LEAVE(1236, "哺乳假");





    private final Integer id;
    private final String name;

    BusinessLogicDict(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
