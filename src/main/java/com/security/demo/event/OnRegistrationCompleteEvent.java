package com.security.demo.event;

import com.security.demo.entity.Someone;
import java.util.Locale;
import org.springframework.context.ApplicationEvent;

/**
 * 註冊完成事件
 *
 * @author 李羅
 */
public class OnRegistrationCompleteEvent extends ApplicationEvent {

	private static final long serialVersionUID = -6411093423884992233L;
	
	private String appUrl;
	private Locale locale;
	private Someone talent;

	public OnRegistrationCompleteEvent(Someone talent, Locale locale, String appUrl) {
		super(talent);

		this.talent = talent;
		this.locale = locale;
		this.appUrl = appUrl;
	}

	// standard getters and setters
	public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Someone getTalent() {
		return talent;
	}

	public void setTalent(Someone talent) {
		this.talent = talent;
	}
}
