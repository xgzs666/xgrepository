package  com.xg.renting.common;

public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),//成功
    ERROR(1,"ERROR"),//错误
    NEED_LOGIN(10,"NEED_LOGIN"),//需要登入
    NO_POWER(6,"NO_POWER");//无权限


    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
