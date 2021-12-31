package framework.config;


public class Constant {

    private Constant() {
	}
	/**
	 * 企业微信配置
	 */
	public static final String QIYE_WECHAT_SETTING = "QIYE_WECHAT_SETTING";
    //演示系统账户
    public static final String DEMO_ACCOUNT = "test";
    //自动去除表前缀
    public static final  String AUTO_REOMVE_PRE = "true";
    //停止计划任务
    public static final String STATUS_RUNNING_STOP = "stop";
    //开启计划任务
    public static final String STATUS_RUNNING_START = "start";
    //部门根节点id
    public static final Long DEPT_ROOT_ID = 0L;
	//组织-客服中心id
	public static final Long Customer_Service_Center_ID = 118L;
    //缓存方式
    public static final String CACHE_TYPE_REDIS ="redis";

    public static final String LOG_ERROR = "error";

    public static final String REDIS_USER_TOKEN_PREFIX = "shiro_redis_session:";

    public static final String REDIS_SHORT_CUT_PREFIX = "shot-cut:";

    public static final String SERVICE_ROLE = "服务专员";

    public static final String ADMIN_ROLE = "超级管理员";

    public static final String APPID_WECHAT = "wx04bd47526bcc5d43";

    public static final String APPSECRET_WECHAT = "e0df40629f1138c436b8073488a97929";

	public static final String TABLE_COLUMN = "tableColumn";

	public static final String WECHAT_ACCESS_TOKEN = "weChat:accessToken";

	public static final String WECHAT_MOBILE_ACCESS_TOKEN = "weChat:mobileAccessToken";

	public static final String WECHAT_JSAPI_TICKET = "weChat:jsApiTicket";

	public static final Integer BIGDECIMAL_ZERO = 4;

    /**
     * 供应商
     */
    public static final Integer SEVICE_SUPPLIER = 42;
    /**
     * 生产商
     */
    public static final Integer SEVICE_MANUFACTURER = 43;
    /**
     * 服务商
     */
    public static final Integer SEVICE_FACILITATOR = 44;
    /**
     * 任务责任人
     */
    public static final Integer HELD_PERSON = 51;
    /**
     * 任务抄送人
     */
    public static final Integer CC_PERSON = 52;
    /**
     * 待处理
     */
    public static final Integer WAITING_DEAL = 56;
    /**
     * 待验收
     */
    public static final Integer WAITING_CHECK = 57;
    /**
     * 已验收
     */
    public static final Integer ALREADY_CHECK = 58;
    /**
     * 任务验收人
     */
    public static final Integer CHECK_PERSON = 59;
    /**
     * 任务回复处理
     */
    public static final Integer REPLY_DEAL = 60;
    /**
     * 验收
     */
    public static final Integer REPLY_CHECK = 61;
    /**
     * 退回（审批退回）
     */
    public static final Integer APPLY_REJECT = 62;
    /**
     * 审批中
     */
    public static final Integer APPLY_APPROVING = 63;
    /**
     * 已结束
     */
    public static final Integer APPLY_COMPLETED = 64;
    /**
     * 8D报告编制中
     */
    public static final Integer EDITING = 91;
    /**
     * 8D报告已完成
     */
    public static final Integer COMPLETED = 92;
    /**
     * 通过
     */
    public static final Integer RESULT_PASS = 115;
    /**
     * 不通过
     */
    public static final Integer RESULT_UNPASS = 116;
    /**
     * 计划启用
     */
    public static final Integer STATE_START = 129;
    /**
     * 计划完成
     */
    public static final Integer STATE_STOP_OVER = 131;    
    /**
     * 待评价
     */
    public static final Integer NO_EVALUATED= 133;
    /**
     * 维修事件抄送人
     */
    public static final Integer REPAIR_EVENT_CC_PERSON = 134;
    /**
     * 回复
     */
    public static final Integer REPLY = 145;
    /**
     * 暂存
     */
    public static final Integer TS = 146;
    /**
     * 维修责任人
     */
    public static final Integer REPAIR_EVENT_HELD_PERSON = 147;
	/**
	 * 源单类型-合同：204
	 contract
	 */
	public static final int SOURCE_TYPE_CONTRACT = 204;
    /**
     * 已提交
     */
    public static final Integer APPLY_APPROED = 148;
    /**
     * 关闭
     */
    public static final Integer CLOSE = 167;
    /**
     * 全部
     */
    public static final int ALL_DATA = 243;
    /**
     * 本部门及下属部门
     */
    public static final int SUBORDINATE_DEPT_DATA = 244;
    /**
     * 本部门
     */
    public static final int THIS_DEPT_DATA = 245;
    /**
     * 个人
     */
    public static final int PERSONAL_DATA = 246;
    /**
     * 自定义数据权限
     */
    public static final int CUSTOM_DATA = 247;
	/**
	 * 工单状态-未指派：319
	 */
	public static final int WORK_ORDER_STATUS_NOTASSIGNED = 319;
	/**
	 * 工单状态-已派工：320
	 */
	public static final int WORK_ORDER_STATUS_HAVESENTWORKERS = 320;
	/**
	 * 工单状态-进行中：321
	 */
	public static final int WORK_ORDER_STATUS_GOING = 321;
	/**
	 * 工单状态-驳回结束:322
	 */
	public static final int WORK_ORDER_STATUS_SUCCESSCLOSS = 322;
	/**
	 * 工单状态-驳回结束:323
	 */
	public static final int WORK_ORDER_STATUS_DISMISSTHEEND = 323;
	/**
	 * 委托业务类型-商标及相关业务：308delegate_business_type brand
	 */
	public static final int DELEGATE_BUSINESS_TYPE_BRAND = 308;
	/**
	 * 委托业务类型-版权及相关业务：309 copyright
	 */
	public static final int DELEGATE_BUSINESS_TYPE_COPYRIGHT = 309;
	/**
	 * 委托业务类型-专利及相关业务：310 patent
	 */
	public static final int DELEGATE_BUSINESS_TYPE_PATENT = 310;
	/**
	 * 委托业务类型-科技政策及相关业务：311 technology
	 */
	public static final int DELEGATE_BUSINESS_TYPE_TECHNOLOGY = 311;
    /**
     * 巡检完成图片
     */
    public static final String PATROL_RECORD_APPEARANCE_IMAGE = "PATROL_RECORD_APPEARANCE_IMAGE";
    /**
     * 巡检签到图片
     */
    public static final String PATROL_RECORD_SIGNIN_IMAGE = "PATROL_RECORD_SIGNIN_IMAGE";
    /**
     * 8D报告分析主要原因附件
     */
    public static final String BD_MAINREASON_FILE = "8D_MAINREASON_FILE";
    /**
     * 8D报告分析主要原因附件
     */
    public static final String BD_CHECKRESULT_FILE = "8D_CHECKRESULT_FILE";
    /**
     * 报修图片
     */
    public static final String REPAIR_EVENT_IMAGE = "REPAIR_EVENT_IMAGE";
    /**
     * 维修记录图片
     */
    public static final String REPAIR_EVENT_RECORD_IMAGE = "REPAIR_EVENT_RECORD_IMAGE";
    /**
     * 任务照片
     */
    public static final String TASK_APPEARANCE_IMAGE = "TASK_APPEARANCE_IMAGE";
	/**
     * 巡检计划
     */
    public static final String PATRAL_PLAN = "PATRAL_PLAN";
	/**
	 * 保养计划
	 */
	public static final String UPKEEP_PLAN = "UPKEEP_PLAN";
    /**
     * 故障报修单据前缀
     */
    public static final String GZBX = "GZBX";
    /**
     * 8D报告单据前缀
     */
    public static final String  BDBG =  "BDBG";
    /**
     * 新闻发布
     */
    public static final String NEWS_PRESS_RELEASE = "NEWS_PRESS_RELEASE";
	/**
     * 文档外观附件
     */
	public static final String DOCUMENT_APPEARANCE_ATTACHMENT = "DOCUMENT_APPEARANCE_ATTACHMENT";
	/**
     * FRDB外观附件
     */
	public static final String FRDB_APPEARANCE_ATTACHMENT = "FRDB_APPEARANCE_ATTACHMENT";
	/**
     * 设备外观形象
     */
	public static final String DEVICE_ARTECLE_IMAGE = "DEVICE_ARTECLE_IMAGE";
	/**
     * 每周报告目标
     */
	public static final String WEEK_REPORT_TARGET = "WEEK_REPORT_TARGET";
	/**
	 * 每周报告-抄送人 sender
	 */
//	public static final String WEEK_REPORT_SENDER = "WEEK_REPORT_SENDER";
	/**
     * 周报附件
     */
	public static final String WEEK_REPORT_APPEARANCE_ATTACHMENT = "WEEK_REPORT_APPEARANCE_ATTACHMENT";
	/**
	 * 收付款附件
	 */
	public static final String PAYMENT_RECEIVED_ATTACHMENT = "PAYMENT_RECEIVED_ATTACHMENT";
	/**
     * 周报评论
     */
	public static final String WEEK_REPORT_COMMENT = "WEEK_REPORT_COMMENT";
	/**
     * 每月报告目标
     */
	public static final String MONTH_REPORT_TARGET = "MONTH_REPORT_TARGET";
	/**
	 * 每月报告-协调人
	 */
	public static final String MONTH_REPORT_COORDINATOR = "MONTH_REPORT_COORDINATOR";
	/**
	 * 每月报告-抄送人 sender
	 */
//	public static final String MONTH_REPORT_SENDER = "MONTH_REPORT_SENDER";
	/**
	 * 每日报告的评论
	 */
	public static final String DAILY_REPORT_COMMENT = "DAILY_REPORT_COMMENT";
	/**
	 * 每日报告外观附件
	 */
	public static final String DAILY_REPORT_APPEARANCE_ATTACHMENT = "DAILY_REPORT_APPEARANCE_ATTACHMENT";
	/**
	 * 意向客户附件
	 */
	public static final String POTENTIAL_CLIENTS_ATTACHMENT = "POTENTIAL_CLIENTS_ATTACHMENT";
	/**
     * 每日报告目标
     */
	public static final String DAILY_REPORT_TARGET = "DAILY_REPORT_TARGET";
	/**
	 * 每日报告-协调人
	 */
	public static final String DAILY_REPORT_COORDINATOR = "DAILY_REPORT_COORDINATOR";
	/**
	 * 每日报告-抄送人 sender
	 */
//	public static final String DAILY_REPORT_SENDER = "DAILY_REPORT_SENDER";

	/**
	 * 休假申请外观附件
	 */
	public static final String LEAVE_APPLY_APPEARANCE_ATTACHMENT = "LEAVE_APPLY_APPEARANCE_ATTACHMENT";
	/**
	 * 休假申请外观附件
	 */
	public static final String LEAVE_APPLY_TARGET = "LEAVE_APPLY_TARGET";
	/**
	 * 休假
	 */
	public static final String LEAVE_APPROVE_TARGET = "LEAVE_APPROVE_TARGET";
	/**
	 * 请假评论
	 */
	public static final String LEAVE_APPLY_COMMENT = "LEAVE_APPLY_COMMENT";
	/**
	 * 请假审批评论
	 */
	public static final String LEAVE_APPLY_APPROVE_COMMENT = "LEAVE_APPLY_APPROVE_COMMENT";
	/**
	 * 移动考勤评论
	 */
	public static final String MOBILE_ATTENDANCE_COMMENT = "MOBILE_ATTENDANCE_COMMENT";
	/**
	 * 发文管理审批评论
	 */
	public static final String POST_DOCUMENT_APPROVE_COMMENT = "POST_DOCUMENT_APPROVE_COMMENT";
	/**
	 * 收文管理审批评论
	 */
	public static final String COLLECT_DOCUMENT_APPROVE_COMMENT = "COLLECT_DOCUMENT_APPROVE_COMMENT";
	/**
	 * 请假类型-年假Leave type annual leave
	 */
	public static final Integer LEAVE_TYPE_ANNUAL_LEAVE = 77;
	/**
	 * 月报附件
	 */
	public static final String MONTH_REPORT_APPEARANCE_ATTACHMENT = "MONTH_REPORT_APPEARANCE_ATTACHMENT";
	/**
	 * 月报回复
	 */
	public static final String MONTH_REPORT_COMMENT = "MONTH_REPORT_COMMENT";
	/**
	 * 加班附件
	 */
	public static final String OVER_TIME_APPLY_APPEARANCE_ATTACHMENT = "OVER_TIME_APPLY_APPEARANCE_ATTACHMENT";
	/**
	 * 加班回复
	 */
	public static final String OVER_TIME_APPLY_COMMENT = "OVER_TIME_APPLY_COMMENT";


	/**
	 * 领用附件
	 */
	public static final String RECEIVE_APPLY_APPEARANCE_ATTACHMENT = "RECEIVE_APPLY_APPEARANCE_ATTACHMENT";

	/**
	 * 退租申请附件
	 */
	public static final String BACK_LEASE_ATTACHMENT = "BACK_LEASE_ATTACHMENT";

	/**
	 * 领用回复
	 */
	public static final String RECEIVE_APPLY_COMMENT = "RECEIVE_APPLY_COMMENT";

	/**
	 * 采购发票
	 */
	public static final String PURCHASE_INVOICE_APPEARANCE_ATTACHMENT = "PURCHASE_INVOICE_APPEARANCE_ATTACHMENT";

	/**
	 * 付款单
	 */
	public static final String RECEIPT_APPEARANCE_ATTACHMENT = "RECEIPT_APPEARANCE_ATTACHMENT";

	/**
	 * 付款单
	 */
	public static final String PAYMENT_APPEARANCE_ATTACHMENT = "PAYMENT_APPEARANCE_ATTACHMENT";

	/**
	 * 退款单
	 */
	public static final String REFUND_APPEARANCE_ATTACHMENT = "REFUND_APPEARANCE_ATTACHMENT";
	/**
	 * 内部结算单
	 */
	public static final String INNER_SETTLE_APPEARANCE_ATTACHMENT = "INNER_SETTLE_APPEARANCE_ATTACHMENT";

	/**
	 * 采购申请回复
	 */
	public static final String PURCHASE_APPLY_COMMENT = "PURCHASE_APPLY_COMMENT";

	/**
	 * 加班审批评论
	 */
	public static final String OVER_TIME_APPLY_APPROVE_COMMENT = "OVER_TIME_APPLY_APPROVE_COMMENT";

	/**
	 * 领用审批评论
	 */
	public static final String RECEIVE_APPLY_APPROVE_COMMENT = "RECEIVE_APPLY_APPROVE_COMMENT";

	/**
	 * 租赁合同评论
	 */
	public static final String lEASE_CONTRACT_APPROVE_COMMENT = "lEASE_CONTRACT_APPROVE_COMMENT";

	/**
	 * 车位合同评论
	 */
	public static final String PARKING_CONTRACT_APPROVE_COMMENT = "PARKING_CONTRACT_APPROVE_COMMENT";

	/**
	 * 租赁合同补充协议评论
	 */
	public static final String lEASE_CONTRACT_ADD_APPROVE_COMMENT = "lEASE_CONTRACT_ADD_APPROVE_COMMENT";

	/**
	 * 退租申请评论
	 */
	public static final String BACK_LEASE_APPROVE_COMMENT = "BACK_LEASE_APPROVE_COMMENT";

	/**
	 * 采购申请审批评论
	 */
	public static final String PURCHASE_APPROVE_COMMENT = "PURCHASE_APPROVE_COMMENT";

	/**
	 * 维修申请审批评论
	 */
	public static final String MALFUNCTION_APPROVE_COMMENT = "MALFUNCTION_APPROVE_COMMENT";

	/**
	 * 维修合同审批评论
	 */
	public static final String MALFUNCTION_CONTRACT_APPROVE_COMMENT = "MALFUNCTION_CONTRACT_APPROVE_COMMENT";

	/**
	 * 服务合同审批评论
	 */
	public static final String SERVICE_CONTRACT_APPROVE_COMMENT = "SERVICE_CONTRACT_APPROVE_COMMENT";

	/**
	 * 询价记录审批评论
	 */
	public static final String INQUIRY_RECORD_APPROVE_COMMENT = "INQUIRY_RECORD_APPROVE_COMMENT";

	/**
	 * 资产报废审批评论
	 */
	public static final String ASSETS_WASTE_UP_APPROVE_COMMENT = "ASSETS_WASTE_UP_APPROVE_COMMENT";

	/**
	 * 资产报废审批评论
	 */
	public static final String ASSETS_WASTE_UP_DISPOSAL_APPROVE_COMMENT = "ASSETS_WASTE_UP_DISPOSAL_APPROVE_COMMENT";


	/**
	 * 工程签证审批评论
	 */
	public static final String ENGINEERING_VISA_APPROVE_COMMENT = "ENGINEERING_VISA_APPROVE_COMMENT";

	/**
	 * 违规确认审批评论
	 */
	public static final String VIOLATION_CONFIRMATION_APPROVE_COMMENT = "VIOLATION_CONFIRMATION_APPROVE_COMMENT";

	/**
	 * 竣工验收审批评论
	 */
	public static final String COMPLETION_ACCEPTANCE_APPROVE_COMMENT = "COMPLETION_ACCEPTANCE_APPROVE_COMMENT";

	/**
	 * 加班申请
	 */
	public static final String OVER_TIME_APPLY_TARGET = "OVER_TIME_APPLY_TARGET ";
	/**
	 * 加班批准
	 */
	public static final String OVER_TIME_APPROVE_TARGET = "OVER_TIME_APPROVE_TARGET";

	/**
	 * 领用申请
	 */
	public static final String RECEIVE_APPLY_TARGET = "RECEIVE_APPLY_TARGET ";

	/**
	 * 领用批准
	 */
	public static final String RECEIVE_APPROVE_TARGET = "RECEIVE_APPROVE_TARGET";
	/**
	 * 租赁合同批准
	 */
	public static final String lEASE_CONTRACT_APPROVE_TARGET = "lEASE_CONTRACT_APPROVE_TARGET";

	/**
	 * 租赁合同补充协议批准
	 */
	public static final String lEASE_CONTRACT_ADD_APPROVE_TARGET = "lEASE_CONTRACT_ADD_APPROVE_TARGET";

	/**
	 * 采购申请批准
	 */
	public static final String PURCHASE_APPROVE_TARGET = "PURCHASE_APPROVE_TARGET";

	/**
	 * 收款单回复
	 */
	public static final String PAYMENT_RECEIVED_APPLY_COMMENT = "PAYMENT_RECEIVED_APPLY_COMMENT";
	/**
	 * 收款单申请
	 */
	public static final String PAYMENT_RECEIVED_APPLY_TARGET = "PAYMENT_RECEIVED_APPLY_TARGET ";
	/**
	 * 收款单批准
	 */
	public static final String PAYMENT_RECEIVED_APPROVE_TARGET = "PAYMENT_RECEIVED_APPROVE_TARGET";
	/**
	 * 销售合同批准
	 */
	public static final String SALES_CONTRACT_APPROVE_TARGET = "SALES_CONTRACT_APPROVE_TARGET";

	/**
	 * 支付申请附件
	 */
	public static final String PAY_APPLY_APPEARANCE_ATTACHMENT = "PAY_APPLY_APPEARANCE_ATTACHMENT";
	/**
	 * 抄表记录附件
	 */
	public static final String READ_METER_RECORD_ATTACHMENT = "READ_METER_RECORD_ATTACHMENT";
	/**
	 * 智能门锁附件
	 */
	public static final String SMART_LOCK_ATTACHMENT = "SMART_LOCK_ATTACHMENT";
	/**
	 * 付款批准的目标
	 */
	public static final String PAY_APPROVE_TARGET = "PAY_APPROVE_TARGET";
	/**
	 * 支付申请目标
	 */
	public static final String PAY_APPLY_TARGET = "PAY_APPLY_TARGET";
	/**
	 * 支付申请评论
	 */
	public static final String PAY_APPLY_COMMENT = "PAY_APPLY_COMMENT";
	/**
	 * 培训申请评论
	 */
	public static final String TRAIN_APPLY_COMMENT = "TRAIN_APPLY_COMMENT";
	/**
	 * 培训申请评论
	 */
	public static final String QUIT_APPLY_COMMENT = "QUIT_APPLY_COMMENT";
	/**
	 * 报销附件
	 */
	public static final String REIM_APPLY_APPEARANCE_ATTACHMENT = "REIM_APPLY_APPEARANCE_ATTACHMENT";
	/**
	 * 报销批准
	 */
	public static final String REIM_APPROVE_TARGET = "REIM_APPROVE_TARGET";
	/**
	 * 报销申请
	 */
	public static final String REIM_APPLY_TARGET = "REIM_APPLY_TARGET";
	/**
	 * 报销申请评论
	 */
	public static final String REIM_APPLY_COMMENT = "REIM_APPLY_COMMENT";
	/**
	 * 报件管理-材料清单附件
	 */
	public static final String FILE_REPORTING_MATERIALS_ATTACHMENT = "FILE_REPORTING_MATERIALS_ATTACHMENT";

	/**
	 * 产品列表-报件材料清单附件
	 */
	public static final String PROJECT_MATERIAL_LIST_ATTACHMENT = "PROJECT_MATERIAL_LIST_ATTACHMENT";

	/**
	 * 员工-头像附件
	 */
	public static final String EMPLOYEE_HEAD_PORTRAIT_ATTACHMENT = "EMPLOYEE_HEAD_PORTRAIT_ATTACHMENT";
	/**
	 * 约谈记录-附件
	 */
	public static final String INTERVIEW_RECORD_ATTACHMENT = "INTERVIEW_RECORD_ATTACHMENT";

	/**
	 * 用人报告-附件
	 */
	public static final String EMPLOYEE_REPORT_ATTACHMENT = "EMPLOYEE_REPORT_ATTACHMENT";
	/**
	 * 开票申请附件
	 */
	public static final String INVOICE_APPLY_ATTACHMENT = "INVOICE_APPLY_ATTACHMENT";

	/**
	 * 开票申请附件
	 */
	public static final String PURCHASE_APPLY_ATTACHMENT = "PURCHASE_APPLY_ATTACHMENT";
	/**
	 * 开出发票附件
	 */
	public static final String INVOICING_ATTACHMENT = "INVOICING_ATTACHMENT";
	/**
	 * 发文管理附件
	 */
	public static final String POST_DOCUMENT_ATTACHMENT = "POST_DOCUMENT_ATTACHMENT";
	/**
	 * 收文管理附件
	 */
	public static final String COLLECT_DOCUMENT_ATTACHMENT = "COLLECT_DOCUMENT_ATTACHMENT";
	/**
	 * 收文管理PDF附件
	 */
	public static final String COLLECT_DOCUMENT_PDF_ATTACHMENT = "COLLECT_DOCUMENT_PDF_ATTACHMENT";
	/**
	 * 账单附件
	 */
	public static final String BILL_ATTACHMENT = "BILL_ATTACHMENT";
	/**
	 * 账单调整附件
	 */
	public static final String BILL_ADJUST_ATTACHMENT = "BILL_ADJUST_ATTACHMENT";
	/**
	 * 补卡申请附件
	 */
	public static final String REISSUE_CARD_ATTACHMENT = "REISSUE_CARD_ATTACHMENT";
	/**
	 * 出差申请附件
	 */
	public static final String BUSINESS_TRAVEL_APPLICATION_ATTACHMENT = "BUSINESS_TRAVEL_APPLICATION_ATTACHMENT";

	/**
	 * 看房申请附件
	 */
	public static final String LOOK_HOUSES_APPLICATION_ATTACHMENT = "LOOK_HOUSES_APPLICATION_ATTACHMENT";

	/**
	 * 用章申请附件
	 */
	public static final String USING_OFFICIAL_SEAL_APPLICATION_ATTACHMENT = "USING_OFFICIAL_SEAL_APPLICATION_ATTACHMENT";
	/**
	 * 费用申请附件
	 */
	public static final String BUDGET_APPROVE_ATTACHMENT = "BUDGET_APPROVE_ATTACHMENT";
	/**
	 * 新闻公告-附件
	 */
	public static final String FILE_NEWS_BULLETIN_ATTACHMENT = "FILE_NEWS_BULLETIN_ATTACHMENT";
	/**
	 * 知识共享-附件
	 */
	public static final String FILE_KNOWLEDGE_SHARING_ATTACHMENT = "FILE_KNOWLEDGE_SHARING_ATTACHMENT";
	/**
	 * 科技政策库-附件
	 */
	public static final String TECHNOLOGY_POLICY_LIBRARY_ATTACHMENT = "TECHNOLOGY_POLICY_LIBRARY_ATTACHMENT";
	/**
	 * 费用报销-附件
	 */
	public static final String FILE_Expense_Reimbursement_ATTACHMENT = "FILE_Expense_Reimbursement_ATTACHMENT";
	/**
	 * 报件管理-要求附件
	 */
	public static final String FILE_REPORTING_REQUIRED_ATTACHMENT = "FILE_REPORTING_REQUIRED_ATTACHMENT";
	/**
	 * 报件管理-附件
	 */
	public static final String FILE_REPORTING_ATTACHMENT = "FILE_REPORTING_ATTACHMENT";

	/**
	 * 资产台账-资产图片附件
	 */
	public static final String ASSETS_INFO_ATTACHMENT = "ASSETS_INFO_ATTACHMENT";

	/**
	 * 资产台账-资产报废图片附件
	 */
	public static final String ASSETS_INFO_SCRAP_ATTACHMENT = "ASSETS_INFO_SCRAP_ATTACHMENT";

	/**
	 * 资产台账-资产二维码图片附件
	 */
	public static final String ASSETS_INFO_QR_CODE_ATTACHMENT = "ASSETS_INFO_QR_CODE_ATTACHMENT";

	/**
	 * 报件管理评论
	 */
	public static final String FILE_REPORTING_APPROVAL_COMMENT = "FILE_REPORTING_APPROVAL_COMMENT";

	/**
	 * 开票申请评论
	 */
	public static final String INVOICE_APPLY_APPROVAL_COMMENT = "INVOICE_APPLY_APPROVAL_COMMENT";
	/**
	 * 账单调整申请评论
	 */
	public static final String BILL_ADJUST_APPROVAL_COMMENT = "BILL_ADJUST_APPROVAL_COMMENT";
	/**
	 * 补卡申请评论
	 */
	public static final String REISSUE_CARD_APPROVE_COMMENT = "REISSUE_CARD_APPROVE_COMMENT";

	/**
	 * 出差申请评论
	 */
	public static final String BUSINESS_TRAVEL_APPLICATION_COMMENT = "BUSINESS_TRAVEL_APPLICATION_COMMENT";
	/**
	 * 看房申请评论
	 */
	public static final String LOOK_HOUSE_APPLICATION_COMMENT = "LOOK_HOUSE_APPLICATION_COMMENT";
	/**
	 * 用章申请评论
	 */
	public static final String USING_OFFICIAL_SEAL_APPLICATION_COMMENT = "USING_OFFICIAL_SEAL_APPLICATION_COMMENT";
	/**
	 * 费用申请评论
	 */
	public static final String BUDGET_APPROVE_COMMENT = "BUDGET_APPROVE_COMMENT";
	/**
	 * 费用报销评论
	 */
	public static final String FILE_EXPENSE_REIMBURSEMENT_COMMENT = "FILE_EXPENSE_REIMBURSEMENT_COMMENT";
	/**
	 * 项目立项附件
	 */
	public static final String PROJECT_APPROVAL_APPEARANCE_ATTACHMENT = "PROJECT_APPROVAL_APPEARANCE_ATTACHMENT";

	/**
	 *项目立项批准
	 */
	public static final String PROJECT_APPROVAL_APPROVE_TARGET = "PROJECT_APPROVAL_APPROVE_TARGET";

	/**
	 *工单转派批准
	 */
	public static final String WORK_ORDER_REDEPLOY_APPROVE_TARGET = "WORK_ORDER_REDEPLOY_APPROVE_TARGET";

	/**
	 *报件批准
	 */
	public static final String FILE_REPORTING_APPROVE_TARGET = "FILE_REPORTING_APPROVE_TARGET";
	/**
	 *开票申请批准
	 */
	public static final String INVOICE_APPLY_APPROVE_TARGET = "INVOICE_APPLY_APPROVE_TARGET";
	/**
	 *补卡申请批准
	 */
	public static final String REISSUE_CARD_APPROVE_TARGET = "REISSUE_CARD_APPROVE_TARGET";

	/**
	 *出差申请批准
	 */
	public static final String BUSINESS_TRAVEL_APPLICATION_TARGET = "BUSINESS_TRAVEL_APPLICATION_TARGET";

	/**
	 *看房申请批准
	 */
	public static final String LOOK_HOUSES_APPLICATION_TARGET = "LOOK_HOUSES_APPLICATION_TARGET";

	/**
	 *用章申请批准
	 */
	public static final String USING_OFFICIAL_SEAL_APPLICATION_TARGET = "USING_OFFICIAL_SEAL_APPLICATION_TARGET";

	/**
	 *费用申请批准
	 */
	public static final String BUDGET_APPROVE_TARGET = "BUDGET_APPROVE_TARGET";

	/**
	 *费用报销
	 */
	public static final String FILE_EXPENSE_REIMBURSEMENT_TARGET = "FILE_EXPENSE_REIMBURSEMENT_TARGET";

	/**
	 *销售报价批准
	 */
	public static final String SALES_QUOTATION_APPROVE_TARGET = "SALES_QUOTATION_APPROVE_TARGET";
	/**
	 * 项目立项申请
	 */
	public static final String PROJECT_APPROVAL_TARGET = "PROJECT_APPROVAL_TARGET";
	/**
	 * 销售报价申请
	 */
	public static final String SALES_QUOTATION_TARGET = "SALES_QUOTATION_TARGET";
	/**
	 * 销售合同申请
	 */
	public static final String SALES_CONTRACT_TARGET = "SALES_CONTRACT_TARGET";
	/**
	 * 项目立项评论
	 */
	public static final String PROJECT_APPROVAL_COMMENT = "PROJECT_APPROVAL_COMMENT";

	/**
	 * 工单转派评论
	 redeploy
	 */
	public static final String WORK_ORDER_REDEPLOY_APPROVAL_COMMENT = "WORK_ORDER_REDEPLOY_APPROVAL_COMMENT";

	/**
	 * 销售报价评论
	 */
	public static final String SALES_QUOTATION_COMMENT = "SALES_QUOTATION_COMMENT";
	/**
	 * 销售合同评论
	 */
	public static final String SALES_CONTRACT_COMMENT = "SALES_CONTRACT_COMMENT";
	/**
	 * 实施培训附件
	 */
	public static final String IMPLEMENT_TRAINING_ATTACHMENT = "IMPLEMENT_TRAINING_ATTACHMENT";
	/**
	 * 巡检计划前缀
	 */
	public static final String XJJH = "XJJH";
	/**
	 * 巡检记录前缀
	 */
	public static final String XJJL = "XJJL";
	/**
	 * 保养工单前缀
	 */
	public static final String SBBY = "SBBY";
	/**
	 * 保养计划前缀
	 */
	public static final String BYJH = "BYJH";

	/**
	 * 客户编码前缀
	 */
	public static final String KH = "KH";
	/**
	 * 客户类型-会员客户customer member
	 */
	public static final Integer CUSTOMER_MEMBER = 345;
	/**
	 * 客户-附件
	 */
	public static final String CUSTOMINFO_ATTACHMENT = "CUSTOMINFO_ATTACHMENT";
	/**
	 * 跟进记录-附件
	 */
	public static final String FOLLOWUPRECORDS_ATTACHMENT = "FOLLOWUPRECORDS_ATTACHMENT";
	/**
	 * 跟进记录-跟进人
	 */
	public static final String FOLLOWUPRECORDS_FOLLOWUPPEOPLE = "FOLLOWUPRECORDS_FOLLOWUPPEOPLE";
	/**
	 * 跟进记录-抄送人 sender
	 */
	public static final String FOLLOWUPRECORDS_SENDER = "FOLLOWUPRECORDS_SENDER";
	/**
	 * 销售机会-抄送人 sender
	 */
	public static final String SALES_OPPORTUNITIES_SENDER = "SALES_OPPORTUNITIES_SENDER";
	/**
	/**
	 * 销售机会-附件
	 */
	public  static  final  String SALES_OPPORTUNITIES_ATTACHMENT ="SALES_OPPORTUNITIES_ATTACHMENT";
	/**
	 * 客服记录-附件
	 */
	public static  final  String CUSTOMER_SERVICE_RECORDS_ATTACHMENT ="CUSTOMER_SERVICE_RECORDS_ATTACHMENT";
	/**
	 * 投诉记录-附件
	 */
	public  static  final  String COMPLAINT_RECORD_ATTACHMENT ="COMPLAINT_RECORD_ATTACHMENT";
	/**
	 * 项目信息-附件
	 */
	public static final String PROJECT_INFO_ATTACHMENT = "PROJECT_INFO_ATTACHMENT";
	/**
	 * 项目信息-附件-楼栋分布图
	 */
	public static final String PROJECT_INFO_ATTACHMENT_BUILDING_DISTRIBUTION_MAP = "PROJECT_INFO_ATTACHMENT_BUILDING_DISTRIBUTION_MAP";
	/**
	 * 楼栋信息-附件
	 */
	public static final String BUILDING_INFO_ATTACHMENT = "BUILDING_INFO_ATTACHMENT";

	/**
	 * 车位管理-附件
	 */
	public static final String PARKING_LOT_ATTACHMENT = "PARKING_LOT_ATTACHMENT";

	/**
	 * 招商跟进-附件
	 */
	public static final String ATTRACT_INVESTMENT_FOLLOW_UP_ATTACHMENT = "ATTRACT_INVESTMENT_FOLLOW_UP_ATTACHMENT";

	/**
	 * 客户-附件
	 */
	public static final String CUSTOMER_ATTACHMENT = "CUSTOMER_ATTACHMENT";

	/**
	 * 租赁合同-附件
	 */
	public static final String lEASE_CONTRACT_ATTACHMENT = "lEASE_CONTRACT_ATTACHMENT";

	/**
	 * 租赁合同-盖章附件
	 */
	public static final String lEASE_CONTRACT_SEAL_ATTACHMENT = "lEASE_CONTRACT_SEAL_ATTACHMENT";

	/**
	 * 车位合同-附件
	 */
	public static final String PARKING_CONTRACT_ATTACHMENT = "PARKING_CONTRACT_ATTACHMENT";

	/**
	 * 车位合同-盖章附件
	 */
	public static final String PARKING_CONTRACT_SEAL_ATTACHMENT = "PARKING_CONTRACT_SEAL_ATTACHMENT";

	/**
	 * 租赁合同补充协议-附件
	 */
	public static final String lEASE_CONTRACT_ADD_ATTACHMENT = "lEASE_CONTRACT_ADD_ATTACHMENT";

	/**
	 * 项目信息-附件
	 */
	public static final String PROJECT_RESOURCE_ATTACHMENT = "PROJECT_RESOURCE_ATTACHMENT";

	/**
	 * 培训审批-附件
	 */
	public static final String TRAIN_APPLY_ATTACHMENT = "TRAIN_APPLY_ATTACHMENT";

	/**
	 * 离职申请-附件
	 */
	public static final String QUIT_APPLY_ATTACHMENT = "QUIT_APPLY_ATTACHMENT";

	/**
	 * 项目资源-状态
	 */
	public static final Integer PROJECT_RESOURCE_STATUS_LEISURE = 1077;

	/**
	 * 项目资源-使用性质-出租
	 */
	public static final Integer PROJECT_RESOURCE_NATURE_OF_RESOURCE_USE_RENT_OUT = 1069;

	/**
	 * 项目资源-使用性质-出售
	 */
	public static final Integer PROJECT_RESOURCE_NATURE_OF_RESOURCE_USE_SELL = 1070;

	/**
	 * 项目资源-使用性质-可租可售
	 */
	public static final Integer PROJECT_RESOURCE_NATURE_OF_RESOURCE_USE_RENT_OUT_SELL = 1071;

	/**
	 * 项目资源-使用性质-自用
	 */
	public static final Integer PROJECT_RESOURCE_NATURE_OF_RESOURCE_USE_ONESELF = 1072;

	/**
	 * 供应商编码前缀
	 */
	public static final String GYS = "GYS";
/**
	 * 待审核
	 */
	public static final Integer WAIT_AUDIT = 178;
	/**
	 * 已审核
	 */
	public static final Integer OK_AUDITED = 179;

	/**
	 * 费用编码前缀
	 */
	public static final String FY = "FY";/**
     * 库位编码前缀
     */
    public static final String KW = "KW";

    /**
     * 仓库编码前缀
     */
    public static final String CK = "CK";

    /**
     * 物料编码前缀
     */
    public static final String WL = "WL";

    /**
     * BOM编码前缀
     */
    public static final String BOM = "BOM";

    /**
     * 银行type
     */
    public static final String BANK = "bank";

    /**
     * 物料属性type
     */
    public static final String MATERIAL_TYPE = "material_type";
    /**
     * 单位type
     */
    public static final String UOM_TYPE = "uom_type";
    /**
     * 计价方法type
     */
    public static final String VALUATION_METHOD = "valuation_method";
    /**
     * 客户类型type
     */
    public static final String CLIENT_TYPE = "client_type";

    /**
     * 设备前缀
     */
    public static final String SB = "SB";
    /**
     * 设备类别type
     */
    public static final String DEVICE_TYPE = "device_type";
    /**
     * 设备来源type
     */
    public static final String DEVICE_SOURCE = "device_source";
    /**
     * 使用状况type
     */
    public static final String DEVICE_STATUS = "device_status";
    /**
     * 设备用途type
     */
    public static final String DEVICE_PURPOSE = "device_purpose";

	/**
	 * 工单附件
	 */
	public static final String WORK_ORDER_ATTACHMENT ="WORK_ORDER_ATTACHMENT";

	/**
	 * 供应商管理-附件
	 */
	public static final String SUPPLIER_INFO_ATTACHMENT = "SUPPLIER_INFO_ATTACHMENT";


	/**
	 * 合同附件
	 */
	public static final String SALES_CONTRACT_ATTACHMENT ="SALES_CONTRACT_ATTACHMENT";
	/**
	 * 工单营业执照附件
	 */
	public static final String WORK_ORDER_BUSINESS_LICENSE_ATTACHMENT ="WORK_ORDER_BUSINESS_LICENSE_ATTACHMENT";
	/**
	 * 工单技术材料附件
	 */
	public static final String WORK_ORDER_TECHNICAL_WRITER_ATTACHMENT ="WORK_ORDER_TECHNICAL_WRITER_ATTACHMENT";
	/**
	 * 工单节点附件
	 */
	public static final String WORK_ORDER_NODE_ATTACHMENT ="WORK_ORDER_NODE_ATTACHMENT";
	/**
	 * 工单身份材料附件
	 */
	public static final String WORK_ORDER_IDENTITY_MATERIALS_ATTACHMENT ="WORK_ORDER_IDENTITY_MATERIALS_ATTACHMENT";

	/**
	 * 产品类别：非项目类 product_category
	 */
	public static final Integer PRODUCT_CATEGORY_NOT_PROJECT = 407;

	/**
	 * 日报_单据类型_消息发送
	 */
	public static final Integer DAILY_REPORT_BILL_TYPE = 1;
	/**
	 * 周报_单据类型_消息发送
	 */
	public static final Integer WEEK_REPORT_BILL_TYPE = 2;
	/**
	 * 月报_单据类型_消息发送
	 */
	public static final Integer MONTH_REPORT_BILL_TYPE = 3;
	/**
	 * 跟进记录_单据类型_消息发送
	 */
	public static final Integer FOLLOW_UP_RECORD_BILL_TYPE = 4;
	/**
	 * 销售机会_单据类型_消息发送
	 */
	public static final Integer SALES_OPPORTUNITIES_BILL_TYPE = 5;
	/**
	 * 公共服务_任务中心_消息发送（回复）
	 */
	public static final Integer PUBLIC_CENTER_TASK_BILL_TYPE = 6;
//待回复消息
	public static final Long TO_BE_REPLIED_MESSAGE_TYPE = 1L;
//抄送消息
	public static final Long CC_MESSAGE_TYPE = 2L;
//回复消息
	public static final Long REPLY_MESSAGE_TYPE = 3L;
//系统消息
	public static final Long SYSTIM_MESSAGE_TYPE = 4L;
	/**
	 * 商标工单消息推送
	 */
	public static final Integer BRAND_WORK_ORDER_BILL_TYPE = 7;
	/**
	 * 版权工单消息推送
	 */
	public static final Integer COPYRIGHT_WORK_ORDER_BILL_TYPE = 8;
	/**
	 * 专利工单消息推送
	 */
	public static final Integer PATENT_WORK_ORDER_BILL_TYPE = 9;
	/**
	 * 科技政策工单消息推送
	 */
	public static final Integer TECHNOLOGY_WORK_ORDER_BILL_TYPE = 10;
//审批消息
	public static final Long INFORM_TYPE = 5L;

	public static final Long DEPARTMENT_CUSTOMER_SERVICE_CENTER = 132L;

	/**
	 * 加班申请_单据类型_消息发送
	 */
	public static final Integer OVER_TIME_APPLY_BILL_TYPE = 11;

	/**
	 * 费用报销_单据类型_消息发送
	 */
	public static final Integer EXPENSE_REIMBURSEMENT_APPLY_BILL_TYPE = 12;

	/**
	 * 请假管理_单据类型_消息发送
	 */
	public static final Integer LEAVE_APPLY_BILL_TYPE = 13;
	/**
	 * 补卡申请_单据类型_消息发送
	 */
	public static final Integer REISSUE_CARD_APPLY_BILL_TYPE = 14;
	/**
	 * 费用申请_单据类型_消息发送
	 */
	public static final Integer BUDGET_APPLY_BILL_TYPE = 15;
	/**
	 * 付款申请_单据类型_消息发送
	 */
	public static final Integer PAY_APPLY_BILL_TYPE = 16;
	/**
	 * 销售报价_单据类型_消息发送
	 */
	public static final Integer SALES_QUOTATION_APPLY_BILL_TYPE = 17;
	/**
	 * 销售合同_单据类型_消息发送
	 */
	public static final Integer SALES_CONTRACT_BILL_TYPE = 18;
	/**
	 * 报件管理_商标及相关业务_单据类型_消息发送
	 brand
	 */
	public static final Integer FILE_REPORTING_BRAND_BILL_TYPE = 19;
	/**
	 * 报件管理_版权及相关业务_单据类型_消息发送 copyright
	 */
	public static final Integer FILE_REPORTING_COPYRIGHT_BILL_TYPE = 20;
	/**
	 * 报件管理_专利及相关业务_单据类型_消息发送
	 patent
	 */
	public static final Integer FILE_REPORTING_PATENT_BILL_TYPE = 21;
	/**
	 * 报件管理_科技政策及相关业务_单据类型_消息发送technology
	 */
	public static final Integer FILE_REPORTING_TECHNOLOGY_BILL_TYPE = 22;

	/**
	 * 开票申请_单据类型_消息发送
	 */
	public static final Integer INVOICE_APPLY_BILL_TYPE = 23;
	/**
	 * 产品立项_单据类型_消息发送
	 */
	public static final Integer PROJECT_APPROVAL_BILL_TYPE = 24;
	/**
	 * 收款单_单据类型_消息发送
	 */
	public static final Integer PAYMENT_RECEIVED_APPROVAL_BILL_TYPE = 25;

	/**
	 * 日志_单据类型_消息发送
	 */
	public static final Integer DAILY_REMINDER_BILL_TYPE = 26;

	/**
	 * 采购申请_单据类型_消息发送
	 */
	public static final Integer PURCHASE_BILL_TYPE = 27;

	/**
	 * 出差申请_单据类型_消息发送
	 */
	public static final Integer BUSINESS_TRAVEL_APPLICATION_BILL_TYPE = 28;

	/**
	 * 用章申请_单据类型_消息发送
	 */
	public static final Integer USING_OFFICIAL_SEAL_APPLICATION_BILL_TYPE = 29;

	/**
	 * 看房申请_单据类型_消息发送
	 */
	public static final Integer LOOK_HOUSES_APPLICATION_BILL_TYPE = 30;

	/**
	 * 领用申请_单据类型_消息发送
	 */
	public static final Integer RECEIVE_APPLY_BILL_TYPE = 31;

	/**
	 * 租赁合同_单据类型_消息发送
	 */
	public static final Integer lEASE_CONTRACT_APPLY_BILL_TYPE = 32;

	/**
	 * 租赁合同补充协议_单据类型_消息发送
	 */
	public static final Integer lEASE_CONTRACT_ADD_APPLY_BILL_TYPE = 33;

	/**
	 * 车位合同_单据类型_消息发送
	 */
	public static final Integer PARKING_CONTRACT_APPLY_BILL_TYPE = 34;

	/**
	 * 退租申请_单据类型_消息发送
	 */
	public static final Integer BACK_LEASE_APPLY_BILL_TYPE = 35;

	/**
	 * 维修申请_单据类型_消息发送
	 */
	public static final Integer MALFUNCTION_APPLY_BILL_TYPE = 36;

	/**
	 * 维修合同_单据类型_消息发送
	 */
	public static final Integer MALFUNCTION_CONTRACT_BILL_TYPE = 37;

	/**
	 * 服务合同_单据类型_消息发送
	 */
	public static final Integer SERVICE_CONTRACT_BILL_TYPE = 38;

	/**
	 * 询价记录_单据类型_消息发送
	 */
	public static final Integer INQUIRY_RECORD_BILL_TYPE = 39;

	/**
	 * 工程签证_单据类型_消息发送
	 */
	public static final Integer ENGINEERING_VISA_BILL_TYPE = 40 ;

	/**
	 * 账单调整_单据类型_消息发送
	 */
	public static final Integer BILL_ADJUST_BILL_TYPE = 41;

	/**
	 * 违规确认_单据类型_消息发送
	 */
	public static final Integer VIOLATION_CONFIRMATION_BILL_TYPE = 42 ;

	/**
	 * 竣工验收_单据类型_消息发送
	 */
	public static final Integer COMPLETION_ACCEPTANCE_BILL_TYPE = 43;

	/**
	 * 故障报修_消息发送
	 */
	public static final Integer MALFUNCTION_REPAIR_BILL_TYPE = 44;

	/**
	 * 维修工单_消息发送
	 */
	public static final Integer REPAIR_ORDER_BILL_TYPE = 51;

	/**
	 * 发文管理_单据类型_消息发送
	 */
	public static final Integer POST_DOCUMENT_BILL_TYPE = 45;

	/**
	 * 收文管理_单据类型_消息发送
	 */
	public static final Integer COLLECT_DOCUMENT_BILL_TYPE = 46;

	/**
	 * 物业巡查_消息发送
	 */
	public static final Integer PROPERTY_INSPECTION_BILL_TYPE = 47;
	/**
	 * 整改通知_消息发送
	 */
	public static final Integer RECTIFICATION_NOTICE_BILL_TYPE = 48;

	/**
	 * 客户预约_消息发送
	 */
	public static final Integer CUSTOMER_APPOINTMENT_BILL_TYPE = 49;

	/**
	 * 客户反馈_消息发送
	 */
	public static final Integer CUSTOMER_FEEDBACK_BILL_TYPE = 50;

	/**
	 * 客户交接-消息发送
	 */
	public static final Integer CUSTOMER_HANDOVER_BILL_TYPE = 51;

	/**
	 * 资产报废-消息发送
	 */
	public static final Integer ASSETS_WASTE_UP_BILL_TYPE = 52;

	/**
	 * 打卡审批-消息发送
	 */
	public static final Integer MOBILE_ATTENDANCE_BILL_TYPE = 53;

	/**
	 * 培训审批-消息发送
	 */
	public static final Integer TRAIN_APPLY_BILL_TYPE = 54;

	/**
	 * 培训审批-消息发送
	 */
	public static final Integer QUIT_APPLY_BILL_TYPE = 55;

	/**
	 * 资产报废-消息发送
	 */
	public static final Integer ASSETS_WASTE_UP_DISPOSAL_BILL_TYPE = 56;

	//客户导入使用-客户来源-网络查找network to find
	public static  final Integer CUSTOM_SOURCE_NETWORK_FIND=349;
	//客户导入使用-客户来源-客户推荐Customers recommend
	public static  final Integer CUSTOM_SOURCE_CUSTOMERS_RECOMMEND=350;
	//客户导入使用-意向度分类-中intention_judgment centre
	public static  final Integer INTENTION_JUDGMENT_CENTRE=357;
	//客户导入使用-意向度分类-高intention_judgment
	public static  final Integer INTENTION_JUDGMENT_HIGH=356;
	//客户导入使用-意向度分类-低intention_judgment
	public static  final Integer INTENTION_JUDGMENT_LOW=358;
	//客户导入使用-客户类别-会员客户 member
	public static  final Integer CLIENT_TYPE_MEMBER=345;
	//客户导入使用-客户类别-普通客户 common
	public static  final Integer CLIENT_TYPE_COMMON=346;
	//客户导入使用-跟进阶段-售前咨询 Pre-sales consulting
	public static  final Integer FOLLOW_UP_STAGE_PRE_SALES_CONSULTING_=347;
	//客户导入使用-跟进阶段-商务报价 commercial offer
	public static  final Integer FOLLOW_UP_STAGE_COMMERCIAL_OFFER_=348;
	//客户导入使用-跟进阶段-已成交 commercial offer
	public static  final Integer FOLLOW_UP_STAGE_TRADED_=432;
	//产品列表-岗位层级-公司管理层
	public static  final String POST_LEVEL_1="post_level_1";
	//产品列表-岗位层级-部门经理
	public static  final String POST_LEVEL_2="post_level_2";
	//产品列表-岗位层级-普通员工
	public static  final String POST_LEVEL_3="post_level_3";
	//产品列表-岗位层级-城市总监
	public static  final String POST_LEVEL_4="post_level_4";

	/**
	 * 招聘申请评论
	 */
	public static final String ADVERTISE_APPROVE_COMMENT = "ADVERTISE_APPROVE_COMMENT";
	/**
	 * 费用申请_单据类型_消息发送
	 */
	public static final Integer ADVERTISE_APPLY_BILL_TYPE = 88;

	/**
	 * 资产台账状态-报废
	 */
	public static final Integer ASSETS_INFO_USAGE_STATUS_SCRAP = 1086;

	/**
	 * 招商政策附件
	 */
	public static final String INVESTMENT_POLICY_ATTACHMENT = "INVESTMENT_POLICY_ATTACHMENT";

	/**
	 * 新闻资讯附件
	 */
	public static final String NEWS_INFO_ATTACHMENT = "NEWS_INFO_ATTACHMENT";

	/**
	 * 失物招领附件
	 */
	public static final String LOST_FOUND_ATTACHMENT = "LOST_FOUND_ATTACHMENT";

	/**
	 * 通知公告附件
	 */
	public static final String NOTIFICATION_ANNOUNCEMENT_ATTACHMENT = "NOTIFICATION_ANNOUNCEMENT_ATTACHMENT";

	/**
	 * 政策法规附件
	 */
	public static final String POLICY_REGULATION_ATTACHMENT = "POLICY_REGULATION_ATTACHMENT";

	/**
	 * 园区活动附件
	 */
	public static final String PARK_ACTIVITY_ATTACHMENT = "PARK_ACTIVITY_ATTACHMENT";

	/**
	 * 公司信息图片
	 */
	public static final String COMPANY_INFO_IMAGE = "COMPANY_INFO_IMAGE";

	/**
	 * 园区视频
	 */
	public static final String PARK_VIDEO = "PARK_VIDEO";

	/**
	 * 共享资源附件
	 */
	public static final String SHARING_RESOURCE_ATTACHMENT = "SHARING_RESOURCE_ATTACHMENT";

	/**
	 * 入驻流程附件
	 */
	public static final String ENTER_PROCESS_ATTACHMENT = "ENTER_PROCESS_ATTACHMENT";

	/**
	 * 入住确认-附件
	 */
	public static final String CHECK_IN_CONFIRMATION_ATTACHMENT = "CHECK_IN_CONFIRMATION_ATTACHMENT";

	/**
	 * 退房确认-附件
	 */
	public static final String CHECK_OUT_CONFIRMATION_ATTACHMENT = "CHECK_OUT_CONFIRMATION_ATTACHMENT";

	/**
	 * 客户交接-附件
	 */
	public static final String CUSTOMER_HANDOVER_ATTACHMENT = "CUSTOMER_HANDOVER_ATTACHMENT";

	/**
	 * 入住确认-资产交接清单图片AssetHandoverInfo
	 */
	public static final String CHECK_IN_ASSET_HANDOVER_IMAGE = "CHECK_IN_ASSET_HANDOVER_IMAGE";

	/**
	 * 退房确认-资产交接清单图片AssetHandoverInfo
	 */
	public static final String CHECK_OUT_ASSET_HANDOVER_IMAGE = "CHECK_OUT_ASSET_HANDOVER_IMAGE";

	/**
	 * 故障报修-附件
	 */
	public static final String MALFUNCTION_REPAIR_ATTACHMENT = "MALFUNCTION_REPAIR_ATTACHMENT";

	/**
	 * 维修工单-附件
	 */
	public static final String REPAIR_ORDER_ATTACHMENT = "REPAIR_ORDER_ATTACHMENT";

	/**
	 * 维修计划-附件
	 */
	public static final String MALFUNCTION_SCHEDULE_ATTACHMENT = "MALFUNCTION_SCHEDULE_ATTACHMENT";

	/**
	 * 维修计划-明细-附件
	 */
	public static final String MALFUNCTION_SCHEDULE_ITEM_ATTACHMENT = "MALFUNCTION_SCHEDULE_ITEM_ATTACHMENT";

	/**
	 * 维修申请附件
	 */
	public static final String MALFUNCTION_APPLY_ATTACHMENT = "MALFUNCTION_APPLY_ATTACHMENT";

	/**
	 * 维修合同附件
	 */
	public static final String MALFUNCTION_CONTRACT_ATTACHMENT = "MALFUNCTION_CONTRACT_ATTACHMENT";

	/**
	 * 盖章维修合同附件
	 */
	public static final String SEAL_MALFUNCTION_CONTRACT_ATTACHMENT = "SEAL_MALFUNCTION_CONTRACT_ATTACHMENT";

	/**
	 * 服务合同附件
	 */
	public static final String SERVICE_CONTRACT_ATTACHMENT = "SERVICE_CONTRACT_ATTACHMENT";

	/**
	 * 盖章服务合同附件
	 */
	public static final String SEAL_SERVICE_CONTRACT_ATTACHMENT = "SEAL_SERVICE_CONTRACT_ATTACHMENT";

	/**
	 * 询价记录附件
	 */
	public static final String INQUIRY_RECORD_ATTACHMENT = "INQUIRY_RECORD_ATTACHMENT";

	/**
	 * 资产报废附件
	 */
	public static final String ASSETS_WASTE_UP_ATTACHMENT = "ASSETS_WASTE_UP_ATTACHMENT";

	/**
	 * 施工单位进出施工场地记录单-附件
	 */
	public static final String CONSTRUCTION_ACCESS_ATTACHMENT = "CONSTRUCTION_ACCESS_ATTACHMENT";

	/**
	 * 送审记录-附件
	 */
	public static final String SUBMISSION_RECORD_ATTACHMENT = "SUBMISSION_RECORD_ATTACHMENT";

	/**
	 * 审计结果-附件
	 */
	public static final String SUBMISSION_RESULT_ATTACHMENT = "SUBMISSION_RESULT_ATTACHMENT";

	/**
	 * 整改通知-附件
	 */
	public static final String RECTIFICATION_NOTICE_ATTACHMENT = "RECTIFICATION_NOTICE_ATTACHMENT";

	/**
	 * 安全巡查记录-附件
	 */
	public static final String SAFETY_INSPECTION_ATTACHMENT = "SAFETY_INSPECTION_ATTACHMENT";

	/**
	 * 维修记录-附件
	 */
	public static final String MAINTENANCE_RECORD_ATTACHMENT = "MAINTENANCE_RECORD_ATTACHMENT";

	/**
	 * 工程签证附件
	 */
	public static final String ENGINEERING_VISA_ATTACHMENT = "ENGINEERING_VISA_ATTACHMENT";

	/**
	 * 维修考评附件
	 */
	public static final String MAINTENANCE_EVALUATION_ATTACHMENT = "MAINTENANCE_EVALUATION_ATTACHMENT";

	/**
	 * 物业巡查附件
	 */
	public static final String PROPERTY_INSPECTION_ATTACHMENT = "PROPERTY_INSPECTION_ATTACHMENT";

	/**
	 * 违规确认附件
	 */
	public static final String VIOLATION_CONFIRMATION_ATTACHMENT = "VIOLATION_CONFIRMATION_ATTACHMENT";

	/**
	 * 竣工验收附件
	 */
	public static final String COMPLETION_ACCEPTANCE_ATTACHMENT = "COMPLETION_ACCEPTANCE_ATTACHMENT";

	/**
	 * 客户预约附件
	 */
	public static final String CUSTOMER_APPOINTMENT_ATTACHMENT = "CUSTOMER_APPOINTMENT_ATTACHMENT";

	/**
	 * 客户反馈附件
	 */
	public static final String CUSTOMER_FEEDBACK_ATTACHMENT = "CUSTOMER_FEEDBACK_ATTACHMENT";


	/**
	 * 租赁合同状态
	 */
	public static final Integer lEASE_CONTRACT_SAVE = 1135;//暂存
	public static final Integer lEASE_CONTRACT_APPROVING = 1137;//审批中
	public static final Integer lEASE_CONTRACT_REJECT = 1138;//驳回
	public static final Integer lEASE_CONTRACT_PASS = 1139;//审批通过
	public static final Integer lEASE_CONTRACT_CANCEL = 1140;//作废
	public static final Integer lEASE_CONTRACT_FILE = 1141;//归档

	/**
	 * 一般合同状态
	 */
	public static final Integer CONTRACT_SAVE = 1196;//暂存
	public static final Integer CONTRACT_APPROVING = 1198;//审批中
	public static final Integer CONTRACT_REJECT = 1199;//驳回
	public static final Integer CONTRACT_PASS = 1200;//审批通过
	public static final Integer CONTRACT_CANCEL = 1201;//作废
	public static final Integer CONTRACT_FILE = 1202;//归档
}
