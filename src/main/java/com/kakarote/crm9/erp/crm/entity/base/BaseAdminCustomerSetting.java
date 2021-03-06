package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminCustomerSetting<M extends BaseAdminCustomerSetting<M>> extends Model<M> implements IBean {

	public M setSettingId(Integer settingId) {
		set("setting_id", settingId);
		return (M)this;
	}

	public Integer getSettingId() {
		return getInt("setting_id");
	}

	public M setType(Integer type) {
		set("type", type);
		return (M)this;
	}

	public Integer getType() {
		return getInt("type");
	}

	public M setFollowupDay(Integer followupDay) {
		set("followup_day", followupDay);
		return (M)this;
	}

	public Integer getFollowupDay() {
		return getInt("followup_day");
	}

	public M setDealDay(Integer dealDay) {
		set("deal_day", dealDay);
		return (M)this;
	}

	public Integer getDealDay() {
		return getInt("deal_day");
	}

}
