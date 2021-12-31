package framework.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONUtils {
	/**
	 * Bean对象转JSON
	 * 
	 * @param object
	 * @param dataFormatString
	 * @return
	 */
	public static String beanToJson(Object object, String dataFormatString) {
		if (object != null) {
			if (StringUtils.isEmpty(dataFormatString)) {
				return JSONObject.toJSONString(object);
			}
			return JSON.toJSONStringWithDateFormat(object, dataFormatString);
		} else {
			return null;
		}
	}

	/**
	 * Bean对象转JSON
	 * 
	 * @param object
	 * @return
	 */
	public static String beanToJson(Object object) {
		if (object != null) {
			return JSON.toJSONString(object);
		} else {
			return null;
		}
	}

	/**
	 * String转JSON字符串
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public static String stringToJsonByFastjson(String key, String value) {
		if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)) {
			return null;
		}
		Map<String, String> map = new HashMap<String, String>(16);
		map.put(key, value);
		return beanToJson(map, null);
	}

	/**
	 * 将json字符串转换成对象
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static Object jsonToBean(String json, Object clazz) {
		if (StringUtils.isEmpty(json) || clazz == null) {
			return null;
		}
		return JSON.parseObject(json, clazz.getClass());
	}

	/**
	 * json字符串转map
	 * 
	 * @param json
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> jsonToMap(String json) {
		if (StringUtils.isEmpty(json)) {
			return null;
		}
		return JSON.parseObject(json, Map.class);
	}

	// 目前仅支持一层
	public static JSONArray format(List<?> dateList) {
		JSONArray jsonArray = JSON.parseArray(JSON.toJSONStringWithDateFormat(dateList, DateFormatUtil.DATE_PATTERN));
		Object value;
		String bigDecimal;
		String date;
		for (Object o : jsonArray) {
			if (o.getClass().isArray()) {
				continue;
			}
			JSONObject jsonObject = (JSONObject) o;
			for (Map.Entry<String, Object> stringObjectEntry : jsonObject.entrySet()) {
				value = stringObjectEntry.getValue();
				if (value instanceof BigDecimal) {
					bigDecimal = ((BigDecimal) value).stripTrailingZeros().toPlainString();
					stringObjectEntry.setValue(bigDecimal);
					continue;
				}
				if (value instanceof java.util.Date) {
					if (value instanceof java.sql.Date) {
						date = DateFormatUtil.getFormateDate((java.sql.Date) value, DateFormatUtil.DATE_PATTERN_YMD);
						stringObjectEntry.setValue(date);
						continue;
					}
					date = DateFormatUtil.getFormateDate((java.util.Date) value);
					stringObjectEntry.setValue(date);

				}
			}
		}
		return jsonArray;
	}
}
