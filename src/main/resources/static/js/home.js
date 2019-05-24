/**
 * Created by Administrator on 2018/11/14.
 */

/*登录注册框切换*/
$(document).ready(function () {
    $("#login_a").click(function () {
        $("#small-dialog").show();
        $("#small-dialog1").hide();
        $("#body").show();
    });
    $("#signup_a").click(function () {
        $("#small-dialog1").show();
        $("#small-dialog").hide();
        $("#body").show();
    });
    $("#body").click(function () {
        $("#small-dialog1").hide();
        $("#small-dialog").hide();
        $("#body").hide();
    })

    /*验证两次密码是否相同*/
    $("#pas2").keyup(function(){
       if($("#pas1").val()==$("#pas2").val()){
           $("#h4_info").html("请输入注册信息");
           $("#signup_button").removeAttr("disabled");
       }else{
           $("#h4_info").html("<font color='red'>两次输入密码不相同！</font>");
           $("#signup_button").attr("disabled","true");
       }
    });

    /*筛选框切换效果*/
    







    
})
