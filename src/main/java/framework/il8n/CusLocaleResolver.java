package framework.il8n;

import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


public class CusLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
//        String l = httpServletRequest.getParameter("lang");
//        Locale locale = Locale.getDefault();
//        if (!StringUtils.isEmpty(l)) {
//            String[] split = l.split("_");
//            locale = new Locale(split[0], split[1]);
//        }
        Locale locale = new Locale("zh_CN");
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
