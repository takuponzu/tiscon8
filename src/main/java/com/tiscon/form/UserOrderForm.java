package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;


/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    //追加
    @NotBlank( message = "1~12の数字で引っ越し予定月を正しく入力してください")
    @Min(value = 1, message = "1~12の数字で引っ越し予定月を正しく入力してください") 
    @Max(value = 12, message = "1~12の数字で引っ越し予定月を正しく入力してください")
    private String month;

    @NotBlank( message = "名前は空白を使わずに入力してください")
    private String customerName;

    @NotBlank( message = "電話番号は空白を使わずに入力してください")
    @Pattern(regexp = "0\\d{1,4}\\d{1,4}\\d{4}", message = "ハイフンなしで電話番号の形式で入力してください（最初の数字は0で）")
    private String tel;

    @Email
    @NotBlank( message = "メールアドレスは空白を使わずに入力してください")
    private String email;

    @NotBlank
    private String oldPrefectureId;

    @NotBlank( message = "出荷元住所を正しく入力してください")
    private String oldAddress;

    @NotBlank
    private String newPrefectureId;

    @NotBlank( message = "お届け先住所を正しく入力してください")
    private String newAddress;

    @Numeric( message = "段ボールの個数を半角で入力してください")
    @NotBlank( message = "段ボールの個数を空白を用いずに入力してください。無い場合は0を入力してください。")
    private String box;

    @Numeric( message = "ベッドの個数を半角で入力してください")
    @NotBlank( message = "ベッドの個数を空白を用いずに入力してください。無い場合は0を入力してください。")
    private String bed;

    @Numeric( message = "自転車の個数を半角で入力してください")
    @NotBlank( message = "自転車の個数を空白を用いずに入力してください。無い場合は0を入力してください。")
    private String bicycle;

    @Numeric( message = "洗濯機の個数を半角で入力してください")
    @NotBlank( message = "洗濯機の個数を空白を用いずに入力してください。無い場合は0を入力してください。")
    private String washingMachine;

    @NotNull
    private boolean washingMachineInstallation;

    //追加
    public String getMonth() {
        return month;
    }

    //追加
    public void setMonth(String month) {
        this.month = month;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }

    
}
